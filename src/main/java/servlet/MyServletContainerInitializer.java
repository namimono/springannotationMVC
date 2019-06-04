package servlet;

import service.HelloService;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes(value = {HelloService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("servlet.MyServletContainerInitializer...................");
        for(Class<?> aClass :set){
            System.out.println(aClass);
        }
    }
}
