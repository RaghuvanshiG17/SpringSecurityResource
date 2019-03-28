package com.epam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.epam.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping(value="/user/getEmployeesList", produces = "application/json")
	@ResponseBody
	public List<Employee> getEmployeeList(){
		List<Employee> employees = new ArrayList<>();
		Employee emp = new Employee();
		emp.setEmpId("emp_id_1");
		emp.setEmpName("emp_name_1");
		employees.add(emp);
		return employees;
	}
	
}
