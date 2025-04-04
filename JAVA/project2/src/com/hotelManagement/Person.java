package com.hotelManagement;

public abstract class Person {

	//variable intiallization
	int id;
	String name;
	String phnnum;
	
	public Person(int id,String name,String phnnum) {
		this.id=id;
		this.name=name;
		this.phnnum=phnnum;
	}
	public abstract void show();
}
