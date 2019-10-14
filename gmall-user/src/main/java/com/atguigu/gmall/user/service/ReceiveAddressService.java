package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.ReceiveAddress;
import com.atguigu.gmall.user.bean.User;

import java.util.List;

public interface ReceiveAddressService {
    List<ReceiveAddress> list();
    ReceiveAddress get(String id);
    int add(ReceiveAddress receiveAddress);
    int edit(ReceiveAddress receiveAddress);
    int del(String id);
}
