package am.gitc.web.controller;

import am.gitc.common.model.entity.User;
import am.gitc.service.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Zorik Zaqaryan on 15.05.2016.
 */
@Controller
@RequestMapping(value = RegistrationController.CONTROLLER_NAME)
public class RegistrationController {
    public static final String CONTROLLER_NAME = "/register";

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(method = RequestMethod.GET)
    public String initPage(Model model) {
        model.addAttribute("userForm", getUser());
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String registerUser(Model model, @Valid @ModelAttribute("userForm") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }

        User dbUser = userService.authenticate(user.getEmail(), user.getPassword());

//        model.addAttribute("userForm", user);
        if (dbUser == null || dbUser.getEmail().equals("")) {
            model.addAttribute("message", "User with this username already exists");
            return "registration";
        }

        userService.addUser(user);
        model.addAttribute("message", "You have Successful registered");
        return "login";
    }


    public User getUser() {
        return new User();
    }
}
