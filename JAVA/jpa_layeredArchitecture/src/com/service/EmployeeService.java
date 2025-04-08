package com.service;

import com.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee emp);
	
	void updateEmploye(Employee emp);
	
	void deleteEmployee(Employee emp);
	
	Employee findEmployeeById(int empid);
	
	
}
