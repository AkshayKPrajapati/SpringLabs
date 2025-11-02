package com.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Empolyee;

public class SpringBeanScope {

    public static String scopeBeanFile = "com/example/bean/scope.xml";

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext(scopeBeanFile);
        Empolyee empolyee1 = (Empolyee)context.getBean("employee");
        Empolyee empolyee2 = (Empolyee)context.getBean("employee");

        System.out.println(empolyee1.hashCode());
        System.out.println(empolyee2.hashCode());
    }
}
