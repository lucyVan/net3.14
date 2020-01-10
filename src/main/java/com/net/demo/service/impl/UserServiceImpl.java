package com.net.demo.service.impl;

import com.net.demo.dao.UserDao;
import com.net.demo.po.User;
import com.net.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    final
    UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    public User Register(User user) {
        return userDao.save(user);
    }

    public User LogIn(User user) {
        List<User> userList = userDao.findByUserName(user.getUserName());
        for (User item : userList) {
            if (item.getPassword().equals(user.getPassword())) {
                return item;
            }
        }
        return null;
    }
}
