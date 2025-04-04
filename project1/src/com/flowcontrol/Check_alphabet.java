package com.flowcontrol;

import java.util.Scanner;

public class Check_alphabet {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character:");
	char alp = sc.next().charAt(0);
	
	if(alp >= 'a' && alp <= 'z' || alp >= 'A' && alp <= 'Z') {
		System.out.println("This is a alphabet");
	}
	else {
		System.out.println("This is not a alphabet");
	}
}
}
