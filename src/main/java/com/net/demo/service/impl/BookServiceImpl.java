package com.net.demo.service.impl;

import com.net.demo.dao.BookDao;
import com.net.demo.dao.UserDao;
import com.net.demo.dto.BookAndPublishAndAuthor;
import com.net.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    final
    BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao){
        this.bookDao = bookDao;
    }
    public List<BookAndPublishAndAuthor> findAllAndAuthorAndPublisher() {
        return bookDao.findAllAndAuthorAndPublisher();
//        return null;
    }
}
