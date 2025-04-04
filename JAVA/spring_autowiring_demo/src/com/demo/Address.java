package com.demo;

public class Address {
 
	private int huid;
	private String colony;
	private int pincode;
	private String state;
	public int getHuid() {
		return huid;
	}
	public void setHuid(int huid) {
		this.huid = huid;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [huid=" + huid + ", colony=" + colony + ", pincode=" + pincode + ", state=" + state + "]";
	}
	public Address(int huid, String colony, int pincode, String state) {
		super();
		this.huid = huid;
		this.colony = colony;
		this.pincode = pincode;
		this.state = state;
	}
	
}
