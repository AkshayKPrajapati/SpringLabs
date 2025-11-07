package com.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.JavaBean;
import com.example.model.StudentBean;

public class BeanExample {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaBean.class);
		StudentBean bean= (StudentBean) context.getBean("student");
		System.out.println(bean);
	}
}
