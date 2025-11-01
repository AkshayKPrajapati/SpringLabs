package com.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.EmpolyeeData;

public class SecondaryDependencyUsingCBI {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("constructor.xml");
		EmpolyeeData empolyeeData = applicationContext.getBean(EmpolyeeData.class);
		System.out.println(empolyeeData);
	}
}
