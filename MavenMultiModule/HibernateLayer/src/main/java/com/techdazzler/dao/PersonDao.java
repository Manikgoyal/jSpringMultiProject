package com.techdazzler.dao;

import java.util.List;

import test.service.pojo.Person;

public interface PersonDao {

	void save(Person peson);
	void update(Person person);
	void delete(Person person);
	List<Person> allPerson();
	void test();
}
