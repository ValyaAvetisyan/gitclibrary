package am.gitc.web.controller;

import am.gitc.common.model.entity.Gender;
import am.gitc.common.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedList;
import java.util.List;

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
        model.addAttribute("genderList", getGenderList());
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String registerUser(Model model, User user) {
        model.addAttribute("userForm", user);
//        model.addAttribute("genderList", getGenderList());

        return "registration";
    }


    public User getUser() {
        return new User();
    }


    public List<Gender> getGenderList() {
        List<Gender> genders = new LinkedList<>();
        //
        Gender male = new Gender();
        male.setId(1);
        male.setType("MALE");
        //
        Gender female = new Gender();
        male.setId(2);
        male.setType("FEMALE");

        genders.add(male);
        genders.add(female);
        return genders;
    }
}
