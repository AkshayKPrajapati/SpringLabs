package com.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Students;

/*
 * Use of the @ Components
 * And Value Annotation 
 * 
 * Model Class : Students.java\
 * 
 * XML class : UseOfComponent.xml
 */


public class UseOfComponentAndValueAnnotatin {
	
	public static void main(String[] args) {
		
        String configFile = "com/example/bean/UseOfComponent.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(configFile);
        Students student =(Students) context.getBean("student");
        System.out.println(student);
	}
}
