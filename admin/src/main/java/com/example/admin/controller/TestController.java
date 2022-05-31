package com.example.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyang
 * @version 1.0.0
 * @Description TODO
 * @date 2022/05/31 09:08
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
