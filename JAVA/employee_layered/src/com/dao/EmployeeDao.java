package com.dao;

import java.util.Set;
import java.util.Map.Entry;

import com.model.Employee;

public interface EmployeeDao {

	int addEmployee(Employee emp);

	Employee updateEmployee(int empid, Employee emp);

	Employee getEmployee(int empid);

	String deleteEmployee(int empid);

	Set<Entry<Integer, Employee>> getAllEmployees();
}

