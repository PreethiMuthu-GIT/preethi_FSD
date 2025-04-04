package com.jpql_demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp-jpql")
public class Employee {

	@Id
	private int e_id;
	private String e_name;
	private int e_salary;
	private String e_add;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_salary() {
		return e_salary;
	}
	public void setE_salary(int e_salary) {
		this.e_salary = e_salary;
	}
	public String getE_add() {
		return e_add;
	}
	public void setE_add(String e_add) {
		this.e_add = e_add;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + ", e_add=" + e_add + "]";
	}
	public Employee(int e_id, String e_name, int e_salary, String e_add) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_salary = e_salary;
		this.e_add = e_add;
	}
	
}
