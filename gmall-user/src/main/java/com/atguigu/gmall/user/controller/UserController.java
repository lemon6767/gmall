package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.User;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "user-gmall";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> getAllUser(){
        List<User> user = userService.getAllUser();
        return user;
    }

    @RequestMapping("/add")
    @ResponseBody
    public Object addUser(){
        User user =new User();
        user.setBirthday(new Date());
        user.setCity("青岛1111");
        user.setUsername("张三");
        int i = userService.addUser(user);
        return i;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(String id){
        User user =new User();
        user.setId(id);
        user.setBirthday(new Date());
        user.setCity("青岛2222");
        int i = userService.editUser(user);
        return i;
    }

    @RequestMapping("/get")
    @ResponseBody
    public Object get(String id){
        User user = userService.getUser(id);
        return user;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(String id){
        int i = userService.delUser(id);
        return i;
    }
}
