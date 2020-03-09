package org.main.apps;

import java.util.List;

import org.example.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.models.Employee;

public class Main {

	@Autowired

	EmployeeServices employee;

	static public void main(String[] args) {

		Main main_app = new Main();
		main_app.get().stream().forEach(System.out::print);
	}

	public List<Employee> get() {
		return employee.getAllEmployee();
	}
}
