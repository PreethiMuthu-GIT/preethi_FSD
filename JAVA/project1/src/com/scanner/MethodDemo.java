package com.scanner;

public class MethodDemo {
	
	public void Display(){
		System.out.println("Welcome to methods in java");		
	}
	public static int SumofTwoNum(int a, int b) {
		return (a+b);
	}
	public void SubOfTwoNum(int c,int d) {
		System.out.println(c-d);
	}
	public static void main(String[] args) {
		
		MethodDemo md = new MethodDemo();
		md.Display();//instance method with no RT and no P
		System.out.println(MethodDemo.SumofTwoNum(10, 20));//static method with RT with P
		md.SubOfTwoNum(5,3);//instance method without RT with P
		
	}

}
