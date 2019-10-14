package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.User;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public User getUser(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }

    @Override
    public int editUser(User user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        return i;
    }

    @Override
    public int delUser(String id) {
        int i = userMapper.deleteByPrimaryKey(id);
        return i;
    }

}
