package org.example.rest.endpoints;

import java.util.List;

import org.example.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.models.Employee;

public class EmployeeRest {
	@Autowired
	EmployeeServices employee;
	
	@RequestMapping(value="/employees")
	@ResponseBody
	public List<Employee> employee(){
		return employee.getAllEmployee();
	}
}
