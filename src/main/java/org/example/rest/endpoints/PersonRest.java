package org.example.rest.endpoints;

import java.util.List;

import org.example.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.models.Person;

public class PersonRest {
	@Autowired
	PersonServices person;
	
	@RequestMapping(value="/persons")
	@ResponseBody
	public List<Person> person(){
		return person.getAllStudents();
	}
}
