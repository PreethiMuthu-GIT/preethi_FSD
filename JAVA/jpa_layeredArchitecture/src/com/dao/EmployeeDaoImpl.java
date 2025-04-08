package com.dao;

import javax.persistence.EntityManager;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	EntityManager entity;
	
	public EmployeeDaoImpl() {
		entity=JPAUtil.getEntityManager();
	}
	
	
	@Override
	public Employee getEmployeeById(int empid) {
	Employee empobj= entity.find(Employee.class, empid);
		return empobj;
	}

	@Override
	public void addEmployee(Employee emp) {
		entity.persist(emp);
		
	}

	@Override
	public void updateEmploye(Employee emp) {
		entity.merge(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		entity.remove(emp);
		
	}

	@Override
	public void beginTransaction() {
	entity.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entity.getTransaction().commit();
		
	}

}
