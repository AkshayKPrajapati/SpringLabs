package com.orm.dao;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.entity.Book;

public class BookDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//----------------------------------------------------------------//
	@Transactional
	public void saveNewBook(Book book){
		this.hibernateTemplate.save(book);
		System.out.println("Data inserted successfully.. !!");
	}

}
