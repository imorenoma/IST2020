package org.urjc.ist;

import java.util.*;


public class DemoArrays {

	public static void main(String[] args) {
		
		int[] numbers = new int [5];
		
		for(int i=0; i < numbers.length; i++ ) {
			numbers[i]= i-1;
			System.out.println("array element " + i+ " is: " + numbers[i]);
		}
		
		for(int item : numbers) {
			System.out.println("Element is: " + item);
		}
		
		System.out.println(Arrays.toString(numbers));
		Arrays.fill(numbers, 5);
	}
}
