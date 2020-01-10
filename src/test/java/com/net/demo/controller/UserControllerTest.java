package com.net.demo.controller;

import com.net.demo.dao.BookDao;
import com.net.demo.dao.UserDao;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.net.demo.po.User;

import java.sql.Timestamp;

/**
 * UserController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>01/06/2020</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    UserController userController;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: Register(User user)
     */
    @Test
    public void testRegister() throws Exception {
//TODO: Test goes here...
        User user = new User();
        user.setUserName("张三");
        user.setPassword("zhangsan");
        user.setAge(20);
        user.setBirthday(new java.sql.Date(System.currentTimeMillis()));
        user.setRegtime(new Timestamp(System.currentTimeMillis()));
        System.out.println(userController.Register(user));
    }

    @Test
    public void testLogin() throws Exception {
        User user = new User();
        user.setUserName("张三");
        user.setPassword("zhangsan");
        if(userController.LogIn(user)==null){
            System.out.println("failure");
        }else{
            System.out.println("success");
        }
    }

} 
