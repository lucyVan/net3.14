package com.net.demo.controller;

import com.net.demo.dao.BookDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * BookController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>01/07/2020</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookControllerTest {

    @Autowired
    BookController bookController;

    @Autowired
    BookDao bookDao;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findAllAndAuthorAndPublisher()
     */
    @Test
    public void testFindAllAndAuthorAndPublisher() throws Exception {
//TODO: Test goes here...
        System.out.println(bookController.findAllAndAuthorAndPublisher());

    }

    @Test
    public void test1() throws Exception{
//        System.out.println(bookDao.findAll123());
    }
} 
