package com.net.demo.controller;

import com.net.demo.dao.UserDao;
import com.net.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Sample")
public class ASampleController {
    final
    private UserDao userDao;

    @Autowired
    public ASampleController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping()
    public User add(@RequestBody User user) {
        return userDao.save(user);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") String id) {
        userDao.deleteById(id);
    }

    @PutMapping("/{id}")
    public User modify(@PathVariable("id") String id, @RequestBody User user) {
        user.setUserId(id);
        return userDao.saveAndFlush(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id) {
        //Optional是一个容器对象，可能包含也可能不包含非null值
        Optional<User> optional = userDao.findById(id);
        User user = new User();
        if (optional.isPresent()) {
            user = optional.get();
        }
        return user;
    }

    @GetMapping("/list")
    public Page<User> pageQuery(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                @RequestParam(value = "name", defaultValue = "") String name) {
        return userDao.findByUserNamePage(name, PageRequest.of(pageNum - 1, pageSize, Sort.by(Sort.Direction.DESC, "price")));
    }
}
