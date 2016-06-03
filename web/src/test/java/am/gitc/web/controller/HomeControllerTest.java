package am.gitc.web.controller;

import am.gitc.common.model.entity.Book;
import am.gitc.service.service.BookService;
import am.gitc.web.GitcLibraryWeb;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

/**
 * Created by Zorik Zaqaryan on 04.06.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = GitcLibraryWeb.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        /*TransactionalTestExecutionListener.class*/})
public class HomeControllerTest {
    @Autowired
    BookService bookService;

    @Before
    public void setUp() throws Exception {
        for (int i = 0; i < 200; i++) {
            bookService.save(getBook());
        }
    }

    @Test
    public void initHome() throws Exception {
        bookService.findAll();
    }

    @Test
    public void booksRedirect() throws Exception {

    }

    @Test
    public void pagedBooksPage() throws Exception {

    }

    private Book getBook() {
        Book book = new Book();
        book.setAuthor("author");
        book.setName("bookName");
        book.setCount(8);
        book.setImageUri("imageUrI");
        return book;
    }
}