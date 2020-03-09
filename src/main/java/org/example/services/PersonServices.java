package org.example.services;

import java.util.List;
import java.util.Optional;

import org.example.daos.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.models.Person;

public class PersonServices {

	@Autowired
	PersonDao students;

	public List<Person> getAllStudents() {
		return students.findAll();
	}

	public Optional<Person> getPersonById(long id) {
		return students.findById(id);
	}

	public void removePerson(long id) {
		students.deleteById(id);
	}

	public void addPerson(Person student) {
		students.save(student);
	}

	public long getTotalPerson() {
		return students.count();
	}

	public void removePersonByPerson(Person student) {
		students.delete(student);
	}
}
