package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zb.service.RPCOrderService;
import com.zb.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Reference(version = "1.0.0",loadbalance = "roundrobin")
    private RPCOrderService rpcOrderService;
    @Override
    public int getallll() {
        return rpcOrderService.getall();
    }
}
