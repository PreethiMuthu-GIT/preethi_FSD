package com.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository //creates dao layer object
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext//its created entity object in the dao layer
	EntityManager entity;
	
	
	@Override
	public Employee addEmployee(Employee emp) {
		entity.persist(emp);
		return entity.find(Employee.class, emp.getEmpid());
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		Employee upemp=entity.merge(emp);
		return upemp;
	}

	@Override
	public Employee getEmployee(int empid) {
		Employee getemp=entity.find(Employee.class, empid);
		return getemp;
	}

	@Override
	public String deleteEmployee(int empid) {
		Employee delemp=entity.find(Employee.class, empid);
		if(delemp!=null) {
			entity.remove(delemp);
			return "Employee removed successfully";
		}
		else {
			return "Employee not found";
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		TypedQuery<Employee> result=entity.createQuery("Select e from Employee e",Employee.class);
		List<Employee> li= result.getResultList();
		return li;
	}

}
