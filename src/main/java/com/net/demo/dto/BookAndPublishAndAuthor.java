package com.net.demo.dto;

import com.net.demo.po.Author;
import com.net.demo.po.Book;
import com.net.demo.po.Publisher;
import lombok.Data;

import java.io.Serializable;

@Data
public class BookAndPublishAndAuthor implements Serializable {
    private Book book;
    private Publisher publisher;
    private Author author;

    public BookAndPublishAndAuthor() {
    }

    public BookAndPublishAndAuthor(Book book, Publisher publisher, Author author) {
        this.book = book;
        this.publisher = publisher;
        this.author = author;
    }
}
