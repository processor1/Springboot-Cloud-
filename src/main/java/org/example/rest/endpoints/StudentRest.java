package org.example.rest.endpoints;

import java.util.List;

import org.example.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Student;

@RestController
public class StudentRest {

	@Autowired
	StudentServices student;
	
	@RequestMapping(value="/students")
	@ResponseBody
	public List<Student> student(){
		return student.getAllStudents();
	}
}
