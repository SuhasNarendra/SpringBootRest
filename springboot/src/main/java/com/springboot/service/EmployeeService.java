package com.springboot.service;

import com.springboot.entity.Employee;


public interface EmployeeService {

	public Iterable<Employee> getAllEmployees();

	public Employee getEmployee(Integer id);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Integer id);

	public void addEmployee(Employee employee);
}
