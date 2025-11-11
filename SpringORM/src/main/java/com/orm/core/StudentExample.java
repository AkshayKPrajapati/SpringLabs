package com.orm.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.BookDao;
import com.orm.dao.StudentDao;
import com.orm.entity.Student;

public class StudentExample {
	
	public static void main(String[] args) {
		 String configuration = "config.xml";
	        ApplicationContext context = new ClassPathXmlApplicationContext(configuration);
	        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
	       // System.out.print(studentDao);
	        
	        //inset new data
//	        Student  student=new Student(3,"Shreya","NGP",89);
//	        studentDao.saveNewStudent(student);
	        
	        //get student data via id 
	     //   Student c = studentDao.getStudentById(3);
	     //   System.out.println(c);
	        
	        
	        
	        //student all data
//	        List<Student> listOfStudent = studentDao.getStudentAllData();
//	        for(Student student:listOfStudent ){
//	        	System.out.println(student);
//	        }
	        
	        //update student data
//	        Student studentUpdate = studentDao.getStudentById(1);
//	        studentUpdate.setName("Aman");
//	        studentUpdate.setCity("Ranchi");
//	        studentUpdate.setMark(100);
//	        studentDao.updateStudentData(studentUpdate);
	        
	          
	        //delete student data
//	        Student student = studentDao.getStudentById(2);
//	        studentDao.deleteStudentData(student);
	               
	}
}
