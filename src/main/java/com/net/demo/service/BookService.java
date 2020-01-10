package com.net.demo.service;

import com.net.demo.dto.BookAndPublishAndAuthor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<BookAndPublishAndAuthor> findAllAndAuthorAndPublisher();
}
