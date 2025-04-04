package com.flowcontrol;

import java.util.Scanner;

public class Alp_Num_Spl {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("enter the values:");
	char ch = sc.next().charAt(0);
	
	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
		System.out.println("this is a alphabet");
	}
	else if(ch >= '0' && ch<='9') {
		System.out.println("this is a Number");
	}
	else {
		System.out.println("this is a special character");
	}
}
}
