package am.gitc.web.controller;

import am.gitc.common.model.entity.Book;
import am.gitc.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zorikz on 06/03/2016.
 */
@Controller
public class BookController {
    private static final String CMD_NAME = "bookCmd";
    private static final String VIEW_NAME = "/admin" + "/addBook";

    @Autowired
    BookService bookService;

    @Autowired
    ServletContext context;

    @RequestMapping(value = VIEW_NAME, method = RequestMethod.GET)
    public String addBook(@ModelAttribute(CMD_NAME) Book bookCmd, Model model, HttpSession session) {
        model.addAttribute("bookCmd", bookCmd);
        model.addAttribute("path", "data/kk.png");

        return VIEW_NAME;
    }


    @RequestMapping(value = VIEW_NAME, method = RequestMethod.POST)
    public String addBookInit(@Valid @ModelAttribute(CMD_NAME) Book bookCmd,
                              BindingResult result, Model model,
                              @RequestParam(name = "file") MultipartFile file,
                              @RequestParam(name = "image") MultipartFile image
    ) {

        if (result.hasErrors()) {
            return VIEW_NAME;
        }

        if (file.isEmpty() || image.isEmpty()) {
            return VIEW_NAME;
        }

        model.addAttribute("bookCmd", bookCmd);
        return VIEW_NAME;
    }

    @ModelAttribute("categories")
    public List<String> getCategories() {
        List<String> list = new LinkedList<>();
        list.add("JAVA");
        list.add("C#");
        list.add("C++");
        list.add("PHP");
        list.add("ENGLISH");
        return list;
    }

}
