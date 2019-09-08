package com.wzw.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.DubboTest;

@Service
public class DubboTestProviderImpl implements DubboTest {


    @Override
    public String dubbo() {
        System.out.println("provider");
        return "hello dubbo";
    }
}
