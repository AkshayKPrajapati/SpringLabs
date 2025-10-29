package com.example.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		org.springframework.core.io.Resource resource =  new ClassPathResource("bean.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Student student= (Student)beanFactory.getBean("st");
		
		
	}

}
