package com.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.EmpolyeeData;
import com.example.model.StudentNew;
@SuppressWarnings("resource")
public class AutoWiringByType {
	
	
	public static void main(String[] args) {
		String AutoByNameBeanFile="com/example/bean/AutoByType.xml";
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(AutoByNameBeanFile);
		StudentNew studentNew =(StudentNew) applicationContext.getBean("studentNew");
		
		EmpolyeeData empolyeeData = (EmpolyeeData)applicationContext.getBean("emp");
		
		System.out.println(studentNew);
		
		System.out.println(studentNew.getId());
		System.out.println(studentNew.getName());
		System.out.println(studentNew.getAddress().getCity());
		System.out.println(studentNew.getAddress().getState());
		
		
		System.out.println(empolyeeData);
	
	}
}
