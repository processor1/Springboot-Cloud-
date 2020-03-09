package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@GeneratedValue()
	private long id;
	
	
	private String fullname;
	private String gender;
	private String classType;
	private int age;
	private double price;

	public Person() {

	}

	public Person(String fullname, String gender, String classType, int age, double price) {
		this.fullname = fullname;
		this.gender = gender;
		this.classType = classType;
		this.age = age;
		this.price = price;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Person [fullname=" + fullname + ", gender=" + gender + ", classType=" + classType + ", age=" + age
				+ ", price=" + price + "]";
	}

}
