package com.rays.string;

public class CountNoOfIntFromStringSum {

	public static void main(String[] args) {

		String name = "Gautam123456789";

		int sum = 0;
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				count++;
				int num = Character.getNumericValue(name.charAt(i));
				sum = sum + num;
			}
		}
		System.out.println("Sum of digit = " + sum);
	}
}