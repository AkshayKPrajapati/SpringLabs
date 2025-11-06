package com.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.StudentNew;

/*
 * Auto By Annotation
 */
public class AutoWiringByAnnotation {
	
	public static void main(String[] args) {
		
		String AutoByNameBeanFile="com/example/bean/AutoByAnnotation.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(AutoByNameBeanFile);
		StudentNew studentNew=(StudentNew) context.getBean("studentNew");
		System.out.println(studentNew);
	}
}
