package com.flowcontrol;

import java.util.Scanner;

public class All_side_triangles {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three sides of triangles");
	int side1 = sc.nextInt();
	int side2 = sc.nextInt();
	int side3 = sc.nextInt();
	
	//if the sum of any two sides is greater than the 
	//length of the third side
	if((side1+side2) > side3) 
		
		if((side2+side3) > side1) 
			
			if((side3+side1) > side2) 
				System.out.println("Triangle is valid");
			else 
				System.out.println("Triangle is Invalid");
			
		else 
			System.out.println("Triangle is Invalid");	
			
	else 
		System.out.println("Triangle is Invalid");
	
}
}
