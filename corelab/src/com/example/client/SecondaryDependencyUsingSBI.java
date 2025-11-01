package com.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.EmpolyeeData;

/*
 * Secondary Dependency Injection Using Setter Based Injection
 */
public class SecondaryDependencyUsingSBI {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("secondarybean.xml");
		EmpolyeeData empolyeeData = applicationContext.getBean(EmpolyeeData.class);
		System.out.println("Emp id : "+empolyeeData.getEmpId());
		System.out.println("Emp Name : "+empolyeeData.getEmpName());
		System.out.println("Company id : "+empolyeeData.getCompanyData().getCompanyId());
		System.out.println("Company Name : "+empolyeeData.getCompanyData().getCompnayName());
		
	}
}
