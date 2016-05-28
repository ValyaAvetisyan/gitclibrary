package am.gitc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Zorik Zaqaryan on 28.05.2016.
 */
@Controller
@RequestMapping
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String initHome(Model model, HttpSession session) {

        return "home";
    }
}
