package com.polymorphism;

public class calculator {
	
	public void Addition(int a,int b) {
		System.out.println("addition of a and b:"+(a+b));
	}
	public void Addition(int a,int b,int c) {
		System.out.println("addition of a and b and c:"+(a+b+c));
	}
	public void Addition(float a,float b) {
		System.out.println("addition of float a and b:"+(a+b));
	}
	public void Addition(float a,int b) {
		System.out.println("addition of float a and int b:"+(a+b));
	}
	public void Addition(int a,float b) {
		System.out.println("addition ofint a andfloat b:"+(a+b));
	}
  public static void main(String[] args) {
	  calculator cal = new calculator();
	  cal.Addition('a', 'a');//type promotion
	  cal.Addition(4, 4,4);
	  cal.Addition(4.45f, 4.45f);
	  cal.Addition(4.45f, 10);
	  cal.Addition(10, 4.45f);
}
}
