package com.arraysdemo;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int[] numbers = {1,2,3,4,5};
	
	for(int i=0; i<numbers.length/2; i++) {
		int temp = numbers[i];
		//System.out.println(temp);
		numbers[i] = numbers[numbers.length-1-i];
		//System.out.println(numbers[i]);
		numbers[numbers.length-1-i] = temp;
		//System.out.println(numbers[numbers.length-1-i] );
	}
	System.out.println("reversed array:"+Arrays.toString(numbers));
}
}
