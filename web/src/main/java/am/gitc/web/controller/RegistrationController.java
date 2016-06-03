package am.gitc.web.controller;

import am.gitc.common.model.entity.User;
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

    @RequestMapping(method = RequestMethod.GET)
    public String initPage(Model model) {
        model.addAttribute("userForm", getUser());
//        model.addAttribute("genderList", getGenderList());
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String registerUser(Model model, @Valid @ModelAttribute("userForm") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("userForm", user);
            return "registration";
        }
        model.addAttribute("userForm", user);
//        model.addAttribute("genderList", getGenderList());

        model.addAttribute("userForm", user);

        return "registration";
    }


    public User getUser() {
        return new User();
    }
}
