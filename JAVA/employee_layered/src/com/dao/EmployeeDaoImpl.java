package com.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	HashMap<Integer,Employee> hasMap= new HashMap<Integer,Employee>();//databae
	int empid=200;//auto incremnt every time
	

	@Override
	public int addEmployee(Employee emp) {
	hasMap.put(++empid, emp);
		return empid;
	}

	@Override
	public Employee updateEmployee(int empid, Employee emp) {
		Employee empobj=hasMap.put(empid, emp);
		return empobj;
	}

	@Override
	public Employee getEmployee(int empid) {
		Employee getEmp=hasMap.get(empid);
		return getEmp;
	}

	@Override
	public String deleteEmployee(int empid) {
		hasMap.remove(empid);
		return "employee dleeted suufuly :"+empid;
	}

	@Override
	public Set<Entry<Integer, Employee>> getAllEmployees() {
		Set<Entry<Integer, Employee>> result	=hasMap.entrySet();
		return result;
	}

}
