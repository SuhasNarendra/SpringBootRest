package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.service.EmployeeService;

@RestController
@Component
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;

	@GetMapping(value = "/employees")
	public Iterable<Employee> getAllEmployees() {

		return employeeservice.getAllEmployees();
	}

	@GetMapping(value = "/employees/{id}")
	public Employee getEmployee(@PathVariable Integer id) {

		return employeeservice.getEmployee(id);
	}

	@PostMapping(value = "/addemployee")
	public void addEmployee(@RequestBody Employee employee) {

		employeeservice.addEmployee(employee);
	}

	@PutMapping(value = "/updateemployee/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) {

		employeeservice.updateEmployee(employee);
	}

	@DeleteMapping(value = "/employees/{id}")
	public void deleteEmployee(@PathVariable Integer id) {

		employeeservice.deleteEmployee(id);
	}
}