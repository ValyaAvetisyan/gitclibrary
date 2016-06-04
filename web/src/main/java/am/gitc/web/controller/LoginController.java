package am.gitc.web.controller;


import am.gitc.common.model.entity.User;
import am.gitc.service.service.impl.UserServiceImpl;
import am.gitc.web.model.UserLoginCmd;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@Controller
@RequestMapping
//@SessionAttributes(URIConstants.LOGGED_USER)
public class LoginController {
    private static final Logger log = LogManager.getLogger(LoginController.class);
    public static final String LOGIN = "/login";

    @Autowired
    UserServiceImpl userService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm(Model model) {
        UserLoginCmd userFormCmd = new UserLoginCmd();
        model.addAttribute("userLoginCmd", userFormCmd);
//        if (afterRegistration) {
//            model.put("afterRegistrationMsg", "Your registration was succesful. Thank you.");
//        }
        return "/login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String processLogin(@Valid @ModelAttribute("userLoginCmd") UserLoginCmd user, BindingResult result,
                               Model model, HttpSession session) {

        if (result.hasErrors()) {
            return "login";
        }
        User authenticatedUser = userService.getUserByCretentials(user.getUserName(), user.getPassword());

        if (authenticatedUser == null) {
            model.addAttribute("msg_incorrect", "Incorrect Login or Password");
            model.addAttribute("loggedUser", user);
            log.debug("Incorrect Login or Password");
            return "login";
        }

        model.addAttribute("sessionUser", authenticatedUser);
        session.setAttribute("loggedUSer", authenticatedUser);

        if (authenticatedUser.getRole().equals("ADMIN")) {
            return "redirect:/" + "admin";
        }
        return "redirect:/" + "home";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String showLoginForm(HttpSession session) {


        session.removeAttribute("loggedUser");

        return "redirect:/login";
    }
}
