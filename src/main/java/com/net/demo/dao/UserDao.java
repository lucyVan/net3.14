package com.net.demo.dao;

import com.net.demo.po.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, String> {
    List<User> findByUserName(String userName);
    // 分页查询、排序
    @Query("select u from User u where u.userName like %?1%")
    Page<User> findByUserNamePage(String name, Pageable pageable);
}
