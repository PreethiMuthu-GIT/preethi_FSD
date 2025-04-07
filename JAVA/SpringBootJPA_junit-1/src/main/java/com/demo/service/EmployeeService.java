package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee emp);
	
    Employee updateEmployee(Employee emp);
    
    Employee getEmployee(int empid);
    
    String deleteEmployee(int empid);
    
    List<Employee> getAllEmployees();

	
	
}
