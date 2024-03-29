package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.ReceiveAddress;
import com.atguigu.gmall.service.ReceiveAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addr")
public class ReceiveAddressController {
    @Reference
    ReceiveAddressService receiveAddressService;

    @RequestMapping("/list")
    public Object list(){
        return receiveAddressService.list();
    }
    @RequestMapping("/get")
    public Object get(String id){
        return receiveAddressService.get(id);
    }

    @RequestMapping("/edit")
    public Object edit(String id){
        ReceiveAddress receiveAddress = new ReceiveAddress();
        receiveAddress.setId(id);
        receiveAddress.setCity("青岛");
        return receiveAddressService.edit(receiveAddress);
    }
    @RequestMapping("/add")
    public Object add(){
        ReceiveAddress receiveAddress = new ReceiveAddress();
        receiveAddress.setCity("青岛");
        return receiveAddressService.add(receiveAddress);
    }

    @RequestMapping("/del")
    public Object del(String id){
        return receiveAddressService.del(id);
    }
}
