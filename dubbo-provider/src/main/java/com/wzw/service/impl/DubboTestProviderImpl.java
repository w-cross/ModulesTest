package com.wzw.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzw.service.DubboTest;

@Service
public class DubboTestProviderImpl implements DubboTest {

    @Override
    public String dubboTest() {
        System.out.println("provider");
        return "hello dubbo";
    }
}
