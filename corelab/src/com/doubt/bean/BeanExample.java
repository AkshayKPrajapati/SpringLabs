package com.doubt.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanExample {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaBean.class);
		Student student=(Student) applicationContext.getBean("student");
		System.out.println(student);
	}
}
