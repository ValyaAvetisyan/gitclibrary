package am.gitc.web.controller;

import am.gitc.common.model.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by zorikz on 06/03/2016.
 */
@Controller
public class BookController {
    private static final String CMD_NAME = "bookCmd";
    private static final String VIEW_NAME = "/addBook";


    @RequestMapping(value = VIEW_NAME, method = RequestMethod.GET)
    public String addBook(@ModelAttribute(CMD_NAME) Book bookCmd, Model model) {
        model.addAttribute("bookCmd", bookCmd);
        return VIEW_NAME;
    }


    @RequestMapping(value = VIEW_NAME, method = RequestMethod.POST)
    public String addBookInit(@Valid @ModelAttribute(CMD_NAME) Book bookCmd,
                              BindingResult result, Model model) {

        if (result.hasErrors()) {
            return VIEW_NAME;
        }

        model.addAttribute("bookCmd", bookCmd);
        return VIEW_NAME;
    }


}
