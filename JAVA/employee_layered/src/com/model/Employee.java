package com.model;

public class Employee {

	private String empname;
	private int empsal;
	private String empAdd;
	private String empMail;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empsal=" + empsal + ", empAdd=" + empAdd + ", empMail=" + empMail
				+ "]";
	}
	public Employee(String empname, int empsal, String empAdd, String empMail) {
		super();
		this.empname = empname;
		this.empsal = empsal;
		this.empAdd = empAdd;
		this.empMail = empMail;
	}
	
	
}
