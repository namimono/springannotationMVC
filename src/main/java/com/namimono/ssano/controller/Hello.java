package com.namimono.ssano.controller;

import com.namimono.ssano.sercices.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    @Autowired
    HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello")
    public String  getHello(){
        String hello = "fuck";
        return hello;
    }
    @RequestMapping("/success")
    public String  getSuccess(){
        System.out.println("aaaaaaaaaa");
        return "success";
    }

    @RequestMapping("/test")
    public String  gettest(){
        System.out.println("aaaaaaaaaa");
        return "success";
    }
}
