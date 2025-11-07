package com.example.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.model.StudentModelData;

public class UseOfQualifierAnnotation {
    public static void main(String[] args) {
        String configFile = "com/example/bean/UseOfQualifierAnnotation.xml";
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);

        StudentModelData student = (StudentModelData) context.getBean("studentNew");
        System.out.println(student);
    }
}
