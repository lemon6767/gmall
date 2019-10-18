package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.ReceiveAddress;

import java.util.List;

public interface ReceiveAddressService {
    List<ReceiveAddress> list();
    ReceiveAddress get(String id);
    int add(ReceiveAddress receiveAddress);
    int edit(ReceiveAddress receiveAddress);
    int del(String id);
}
