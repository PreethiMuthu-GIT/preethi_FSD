package com.flowcontrol;

import java.util.Scanner;

public class Trinagle_valid {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter three anles of triangle:");
	int ang1 = sc.nextInt();
	int ang2 = sc.nextInt();
	int ang3 = sc.nextInt();
	int total = ang1+ang2+ang3;
	if ((total==180) && (ang1 >0) && (ang2 >0) && (ang3 >0)) {
		System.out.println("Traingle is valid");
	}
	else {
		System.out.println("triangle is invalid");
	}
	
	
	
	
	}
}
