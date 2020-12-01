package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.service.RPCOrderService;
import org.springframework.stereotype.Component;

@Component
@Service(version = "2.0.0")
public class RPCorderServiceImpl2 implements RPCOrderService {


    @Override
    public int getall() {
        return 3;
    }
}
