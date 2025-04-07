package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

import jakarta.transaction.Transactional;

@Service//service object is created
@Transactional//instead of writing begin,commit 
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee addEmployee(Employee emp) {
		
		return dao.addEmployee(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return dao.updateEmployee(emp);
	}

	@Override
	public Employee getEmployee(int empid) {
		
		return dao.getEmployee(empid);
	}

	@Override
	public String deleteEmployee(int empid) {
		
		return dao.deleteEmployee(empid);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return dao.getAllEmployees();
	}

}
