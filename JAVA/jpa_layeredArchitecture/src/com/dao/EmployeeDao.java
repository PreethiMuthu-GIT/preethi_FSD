package com.dao;

import com.model.Employee;

public interface EmployeeDao {

	Employee getEmployeeById(int empid);

	void addEmployee(Employee emp);

	void updateEmploye(Employee emp);

	void deleteEmployee(Employee emp);

	void beginTransaction();

	void commitTransaction();

}
