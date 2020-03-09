package org.example.services;

import java.util.List;
import java.util.Optional;

import org.example.daos.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.models.Student;

public class StudentServices {

	@Autowired
	StudentDao students;

	public List<Student> getAllStudents() {
		return students.findAll();
	}

	public Optional<Student> getStudentById(long id) {
		return students.findById(id);
	}

	public void removeStudent(long id) {
		students.deleteById(id);
	}

	public void addStudent(Student student) {
		students.save(student);
	}

	public long getTotalStudent() {
		return students.count();
	}

	public void removeStudentByStudent(Student student) {
		students.delete(student);
	}
}
