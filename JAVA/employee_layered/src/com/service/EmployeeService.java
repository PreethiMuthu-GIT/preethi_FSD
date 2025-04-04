package com.service;

import java.util.Map.Entry;
import java.util.Set;

import com.model.Employee;

public interface EmployeeService {

	// employee services-->
	int addEmployee(Employee emp);

	Employee updateEmployee(int empid, Employee emp);

	Employee getEmployee(int empid);

	String deleteEmployee(int empid);

	Set<Entry<Integer, Employee>> getAllEmployees();
}
