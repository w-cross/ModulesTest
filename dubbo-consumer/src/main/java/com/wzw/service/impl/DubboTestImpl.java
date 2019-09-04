package com.wzw.service.impl;

import com.wzw.service.DubboTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DubboTestImpl implements DubboTest {

    @Autowired
    DubboTest dubboTest;

    @Override
    public void dubboTest() {
        dubboTest.dubboTest();
    }
}
