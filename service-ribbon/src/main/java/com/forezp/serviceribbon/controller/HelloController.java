package com.forezp.serviceribbon.controller;

import com.forezp.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @RequestMapping(value = "/ribbon")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
