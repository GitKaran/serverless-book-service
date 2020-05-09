package bookapp.controller;

import bookapp.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class BookController {
    private static final Book[] books = {
            new Book(1L, "Nemesis", "Isaac Asimov"),
            new Book(2L, "Great Expectations", "Charles Dickens"),
            new Book(3L, "The Chronicles of Narnia", "C.S. Lewis")
    };
    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public Book[] books() {
        return books;
    }
}