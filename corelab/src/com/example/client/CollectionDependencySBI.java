package com.example.client;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Student;
import com.example.model.StudentData;

/*
 * Collection Dependency Using Setter Based Injection 
 */
public class CollectionDependencySBI {
	
	public static String file="com/example/bean/collection.xml";
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext(file);
		StudentData student = (StudentData)context.getBean("student");
		
		List<Integer> listsOfMarks=student.getMarks();
		listsOfMarks.forEach(System.out::println);
		
		
		Set<String> setOfSubject=student.getSubject();
		setOfSubject.forEach(System.out::println);
		
		
		Map<Integer,String> mapOfDepartment=student.getDepartment();
		mapOfDepartment.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
	}
}
