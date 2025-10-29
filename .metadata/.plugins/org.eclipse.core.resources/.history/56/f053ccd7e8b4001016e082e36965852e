package com.example.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.model.Student;

@SuppressWarnings("deprecation") // because XmlBeanFactory is deprecated
public class Main {

    public static void main(String[] args) {

        // Load bean configuration file
        Resource resource = new ClassPathResource("bean.xml");

        // Create BeanFactory container
        BeanFactory factory = new XmlBeanFactory(resource);

        // Retrieve bean by id
        Student student = (Student) factory.getBean("student");

        // Print bean details
        System.out.println(student);
    }
}
