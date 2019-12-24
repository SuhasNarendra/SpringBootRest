package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.dao.EmployeeDao;
import com.springboot.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeedao;

	@Override
	@Transactional
	public Iterable<Employee> getAllEmployees() {
		return employeedao.findAll();
	}

	@Override
	@Transactional
	public Employee getEmployee(Integer id) {
		return employeedao.findOne(id);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {
		employeedao.save(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(Integer id) {
		employeedao.delete(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		employeedao.save(employee);
	}

}
