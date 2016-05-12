package am.gitc.web.controller;


import am.gitc.web.model.UserLoginCmd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@Controller
//@RequestMapping(value = LoginController.LOGIN)
//@SessionAttributes(URIConstants.LOGGED_USER)
public class LoginController {
//    private static final Logger log = LogManager.getLogger();
    public static final String LOGIN = "/login";


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLoginForm() {
//        UserLoginCmd userFormCmd = new UserLoginCmd();
//        model.addAllAttribute("userLoginCmd", userFormCmd);
//        if (afterRegistration) {
//            model.put("afterRegistrationMsg", "Your registration was succesful. Thank you.");
//        }
        return "/login";
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String showLoginForm(HttpSession session) {
        session.removeAttribute("loggedUser");
        return "redirect:/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processLogin(@Valid @ModelAttribute("userLoginCmd") UserLoginCmd user, BindingResult result,
                               Model model) {

        if (result.hasErrors()) {
            return "login";
        }

//        com.egs.vqportal.common.data.entity.User authenticatedUser = userRestClient.authenticate(user.getUserName(), user.getPassword());
//        if (authenticatedUser == null) {
//            model.addAttribute("msg_incorrect", "Incorrect Login or Password");
//            model.addAttribute("loggedUser", user);
//            log.debug("Incorrect Login or Password");
//            return "login";
//        }
//        model.addAttribute(URIConstants.LOGGED_USER, authenticatedUser);
//        log.debug("User {} is logged in.", authenticatedUser.getUserName());

        return "redirect:/" + "home";
    }
}