package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUser(String id);
    int addUser(User user);
    int editUser(User user);
    int delUser(String id);
}
