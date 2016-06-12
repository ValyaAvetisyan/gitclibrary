package am.gitc.web.controller;

import am.gitc.common.model.entity.User;
import am.gitc.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Zorik Zaqaryan on 28.05.2016.
 */
@Controller
@RequestMapping
public class AdminController {

    private static final String SESSION_ATTRIBUTE_BOOK_LIST = "BookList";

    @Autowired
    BookService bookService;

    @Autowired
    BookPagination pagination;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String initHome(Model model, HttpSession session, HttpServletRequest request) {
        User user = (User) session.getAttribute("loggedUser");
        user.getRole().getId();

        pagination.pagination(request, 0, model);
        return "admin/admin";
    }

    @RequestMapping(value = "admin/books")

    public String booksRedirect(HttpServletRequest request) {

        request.getSession().setAttribute(SESSION_ATTRIBUTE_BOOK_LIST, null);
        return "redirect:admin/books/page/1";
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "admin/books/page/{pageNumber}", method = RequestMethod.GET)
    public String pagedBooksPage(HttpServletRequest request, @PathVariable Integer pageNumber, Model uiModel) {
        pagination.pagination(request, pageNumber, uiModel);
        return "/admin/admin";
    }


}
