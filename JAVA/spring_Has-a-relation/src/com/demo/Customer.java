package com.demo;

import java.util.List;

public class Customer {

	private int custid;
	private String cusname;
	private double cussalary;
	private List<Address> address;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public double getCussalary() {
		return cussalary;
	}
	public void setCussalary(double cussalary) {
		this.cussalary = cussalary;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", cusname=" + cusname + ", cussalary=" + cussalary + ", address="
				+ address + "]";
	}
	public Customer(int custid, String cusname, double cussalary, List<Address> address) {
		super();
		this.custid = custid;
		this.cusname = cusname;
		this.cussalary = cussalary;
		this.address = address;
	}
	
}
