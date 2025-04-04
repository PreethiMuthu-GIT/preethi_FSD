package com.jpa_Demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEEE")
public class Employee {
  
	@Id
	private int emp_id;
	private String emp_name;
	private int emp_sal;
	private String emp_add;
	
	//generate setters and getters
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(int emp_sal) {
		this.emp_sal = emp_sal;
	}
	public String getEmp_add() {
		return emp_add;
	}
	public void setEmp_add(String emp_add) {
		this.emp_add = emp_add;
	}
	
	//genertae default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	//genertae tostring method
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + ", emp_add=" + emp_add
				+ "]";
	}
	
	//generate param constructor
	public Employee(int emp_id, String emp_name, int emp_sal, String emp_add) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
		this.emp_add = emp_add;
	}
	
}
