package com.service;

import java.util.Map.Entry;
import java.util.Set;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
  //creating object of dao layer
	
	EmployeeDao dao= new EmployeeDaoImpl();
	
	
	@Override
	public int addEmployee(Employee emp) {
		
		return dao.addEmployee(emp);
	}

	@Override
	public Employee updateEmployee(int empid, Employee emp) {
		
		return dao.updateEmployee(empid, emp);
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
	public Set<Entry<Integer, Employee>> getAllEmployees() {
	
		return dao.getAllEmployees();
	}

}
