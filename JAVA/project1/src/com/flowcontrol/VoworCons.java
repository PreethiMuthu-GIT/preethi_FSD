package com.flowcontrol;

import java.util.Scanner;

public class VoworCons {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	//System.out.println("char"+ch);
	
	boolean condition =( (ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || 
			(ch=='E') || (ch=='I') || (ch=='O') || (ch=='U') );
	
	if(condition) {
		System.out.println(ch+"   Character is vowel");
	}
	else {
		System.out.println(ch+" Character is Consonant");
	}
}
}
