package com.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Empolyee;
/*
 * Primitive Type using Constructor Based Injection 
 */
public class ConstuctorBasedInection {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        // get 2 different beans by id
        Empolyee emp1 = (Empolyee) applicationContext.getBean("employee");
        Empolyee emp2 = (Empolyee) applicationContext.getBean("emp");

        System.out.println(emp1 + "\n" + emp2);
		
	}
}
