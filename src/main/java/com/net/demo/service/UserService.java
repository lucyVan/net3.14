package com.net.demo.service;

import com.net.demo.po.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User Register(User user);
    User LogIn(User user);
}
