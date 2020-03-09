package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@GeneratedValue()
	private long id;
	
	private String studentFullName;
	private String studentCourse;
	private String studentGender;
	private String studentClass;

	public Student(String studentFullName, String studentCourse, String studentGender, String studentClass) {
		super();
		this.studentFullName = studentFullName;
		this.studentCourse = studentCourse;
		this.studentGender = studentGender;
		this.studentClass = studentClass;
	}

	public Student() {

	}

	public String getStudentFullName() {
		return studentFullName;
	}

	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	@Override
	public String toString() {
		return "Student [studentFullName=" + studentFullName + ", studentCourse=" + studentCourse + ", studentGender="
				+ studentGender + ", studentClass=" + studentClass + "]";
	}

}
