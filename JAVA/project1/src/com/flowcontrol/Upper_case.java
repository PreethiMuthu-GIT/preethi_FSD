package com.flowcontrol;

import java.util.Scanner;

public class Upper_case {
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the Character :");
			char ch = input.next().charAt(0);
			if (ch >= 'a' && ch <= 'z') {
				System.out.println("This is a Lowercase Alphabet "+ch);
			} else {
				System.out.println("This is a Uppercase Alphabet "+ch);
			}
		}
	}


