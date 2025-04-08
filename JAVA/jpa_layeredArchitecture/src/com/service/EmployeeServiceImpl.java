package com.service;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao dao;
	
	
public EmployeeServiceImpl() {
	dao= new EmployeeDaoImpl();
}	

	@Override
	public void addEmployee(Employee emp) {
		
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmploye(Employee emp) {
		dao.beginTransaction();
		dao.updateEmploye(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee findEmployeeById(int empid) {
		Employee result=dao.getEmployeeById(empid);
		return result;
	}

}
