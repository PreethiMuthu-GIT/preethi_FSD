package com.polymorphism;

public class Authentication {
	public boolean login(String username) {
		return username.equals("Preethi");
	}
	public boolean login(String username, String password ) {
		return username.equals("Preethi") && password.equals("Preethi123");
	}
	public boolean login(String username, String password,String email) {
		return username.equals("Preethi") && password.equals("Preethi123")  && email.equals("preethi@gmail.com");
	}
  public static void main(String[] args) {
	Authentication ad = new Authentication();
	System.out.println("Usernanme: "+ad.login("Preethi"));
	System.out.println("Usernanme  and Password: "+ad.login("Preethi","Preethi123"));
	System.out.println("Usernanme: "+ad.login("Preethi","Preethi123","reethi@gmail.com"));
}
}
