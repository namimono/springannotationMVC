package com.namimono.ssano.service;

import com.namimono.ssano.config.ConfigIOC;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloServiceTest {

    @Test
    public void getHello() {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigIOC.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name: beanDefinitionNames){
            System.out.println(name);
        }
    }
}