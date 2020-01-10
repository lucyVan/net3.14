package com.net.demo.controller;

import com.net.demo.dto.BookAndPublishAndAuthor;
import com.net.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Book")
public class BookController {
    final
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Autowired

    @PostMapping("/findAllAndAuthorAndPublisher")
    public List<BookAndPublishAndAuthor> findAllAndAuthorAndPublisher() {
        return bookService.findAllAndAuthorAndPublisher();
    }
}
