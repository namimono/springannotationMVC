package com.namimono.ssano.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses");
        return new Class<?>[]{ConfigIOC.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getRootConfigClasses");
        return new Class<?>[]{ConfigMVC.class};
    }

    protected String[] getServletMappings() {
        System.out.println("getRootConfigClasses");
        return new String[]{"/"};
    }
}
