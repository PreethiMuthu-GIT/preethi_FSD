package com.jdbc_onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="oto_emp")
public class Employee {
	
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private int empid;
   private String empname;
   private int empsal;
   @OneToOne(cascade= CascadeType.ALL)
   private Address address;//has a relation(one employee has one address)-unidirection onetoone
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
   
   public Employee() {
	// 85.TODO Auto-generated constructor stub
}
public Employee(String empname, int empsal, Address address) {
	super();
	this.empname = empname;
	this.empsal = empsal;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", address=" + address + "]";
}
   
   
}

