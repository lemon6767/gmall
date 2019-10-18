package com.atguigu.gmall.user.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.ReceiveAddress;
import com.atguigu.gmall.service.ReceiveAddressService;
import com.atguigu.gmall.user.mapper.ReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ReceiveAddressServiceImpl implements ReceiveAddressService {

    @Autowired
    ReceiveAddressMapper mapper;

    @Override
    public List<ReceiveAddress> list() {
        return mapper.selectAll();
    }

    @Override
    public ReceiveAddress get(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(ReceiveAddress receiveAddress) {
        return mapper.insert(receiveAddress);
    }

    @Override
    public int edit(ReceiveAddress receiveAddress) {
        return mapper.updateByPrimaryKeySelective(receiveAddress);
    }

    @Override
    public int del(String id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
