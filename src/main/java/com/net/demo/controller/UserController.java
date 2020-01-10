package com.net.demo.controller;

import com.net.demo.dao.UserDao;
import com.net.demo.po.User;
import com.net.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {
    final
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/Register")
    public User Register(User user) {
        return userService.Register(user);
    }

    @PostMapping("/LogIn")
    public User LogIn(User user) {
        return userService.LogIn(user);
    }

    @PostMapping("/Test")
    public void Test() {
        return;
    }
}
