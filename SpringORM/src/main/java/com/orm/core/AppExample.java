package com.orm.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.BookDao;
import com.orm.entity.Book;

public class AppExample {
	
	public static void main(String[] args) {
		String configuration ="config.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configuration);
		BookDao bookDao = (BookDao)context.getBean("bookDao");// Created by IOC container
		
		Book book=new Book(101,"Wings of Fire"," APJ Abdul Kalam");
		bookDao.saveNewBook(book);
	}
}
