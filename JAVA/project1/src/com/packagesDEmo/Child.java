package com.packagesDEmo;

class Parent{
	public void m1() {
		System.out.println("wlcome to m1");
	}
}


public class Child extends Parent {
	
	public void m2() {
		System.out.println("welcome to m2");
	}
  public static void main(String[] args) {
	  Child ch = new Child();
	  ch.m1();
	  ch.m2();

}
}
