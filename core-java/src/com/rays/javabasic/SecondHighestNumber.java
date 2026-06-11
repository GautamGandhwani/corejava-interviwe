package com.rays.javabasic;

public class SecondHighestNumber {

	public static void main(String[] args) {

		int[] num = { 100, 23, 34, 45, 56, 67, 69 };
		int highest = 0;
		int secondHighest = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > highest) {
				secondHighest = highest;
				highest = num[i];
			}
			
			if (secondHighest < num[i] && highest != num[i]) {
				secondHighest = num[i];
			}
		}
		System.out.println(secondHighest);
	}
}
