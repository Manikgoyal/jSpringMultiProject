package com.techdazzler.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import test.service.pojo.Person;

@Repository
public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(Person peson) {

	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Person> allPerson() {
		List<Person> persons = sessionFactory.getCurrentSession()
				.createQuery("from person").list();
		return persons;
	}

	@Override
	public void test() {
		System.out.println("Inside Hibernate Check Properties");

	}

}
