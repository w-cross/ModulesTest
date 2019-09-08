package com.wzw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.DubboTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Reference
    private DubboTest dubboTest;

    @RequestMapping("/test_dubbo")
    @ResponseBody
    public String testDubbo() {
        System.out.println("dubbo-test");
        return dubboTest.dubbo();
    }
}
