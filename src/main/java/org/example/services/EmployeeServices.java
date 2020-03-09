package org.example.services;

import java.util.List;

import org.example.daos.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.models.Employee;
import java.util.Optional;

public class EmployeeServices {

	@Autowired
	EmployeeDao employees;

	public List<Employee> getAllEmployee() {
		return employees.findAll();
	}

	public Optional<Employee> findById(long id) {
		return employees.findById(id);
	}

	public void removeEmployee(long id) {
		employees.deleteById(id);
	}

	public void addNewEmployee(Employee entity) {
		employees.save(entity);
	}

	public void removeEmployeByEmployee(Employee entity) {
		employees.delete(entity);
	}

	public long getTotalEmployee() {
		return employees.count();
	}
}
