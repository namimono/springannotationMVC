package com.namimono.ssano.controller;

import com.namimono.ssano.bean.Customer;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Customer> getAll(String firstName, String lastName){
        System.out.println(firstName);
        System.out.println(lastName);
        List<Customer> list = new ArrayList<Customer>();
        list.add(new Customer(1,"a"));
        list.add(new Customer(1,"b"));
        list.add(new Customer(1,"c"));
        list.add(new Customer(1,"d"));
        list.add(new Customer(1,"e"));
        list.add(new Customer(1,"f"));
        list.add(new Customer(1,"g"));
        list.add(new Customer(1,"h"));
        return list;
    }
    @RequestMapping("/getAll2")
    public String  getAll2(){
        System.out.println("aaaaa");
//        List<Customer> list = new ArrayList<>();
//        list.add(new Customer(1,"a"));
//        list.add(new Customer(1,"b"));
//        list.add(new Customer(1,"c"));
//        list.add(new Customer(1,"d"));
//        list.add(new Customer(1,"e"));
//        list.add(new Customer(1,"f"));
//        list.add(new Customer(1,"g"));
//        list.add(new Customer(1,"h"));
        return "aaa";
    }
}
