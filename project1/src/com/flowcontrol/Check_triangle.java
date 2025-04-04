package com.flowcontrol;

import java.util.Scanner;

public class Check_triangle {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter three sides of triangle:");
	int side1 = sc.nextInt();
	int side2 = sc.nextInt();
	int side3 = sc.nextInt();
	//all sides are equal
	if (side1 == side2 && side2 == side3) {
		System.out.println("Equilateral Triangle");
	}
	//any of the two sides are equal
	else if(side1 == side2 || side1 == side3 || side2 == side3) {
		System.out.println("Isosceles Triangle");
	}
	//all sides are not equal
	else if(side1 != side2 && side2 != side3){
		System.out.println("Scalene Triangle");
	}
	else {
		System.out.println("its not a triangle");
	}
	
}
}
