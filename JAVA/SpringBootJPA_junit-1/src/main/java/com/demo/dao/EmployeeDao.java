package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {


	Employee addEmployee(Employee emp);

	Employee updateEmployee(Employee emp);

	Employee getEmployee(int empid);

	String deleteEmployee(int empid);

	List<Employee> getAllEmployees();
}
