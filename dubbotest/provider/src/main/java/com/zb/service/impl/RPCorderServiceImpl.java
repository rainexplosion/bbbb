package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.service.RPCOrderService;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0")
public class RPCorderServiceImpl implements RPCOrderService {


    @Override
    public int getall() {
        System.out.println("11111");
        return 3;
    }
}
