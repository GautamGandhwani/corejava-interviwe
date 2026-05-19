package com.rays.string;

public class CountNoOfIntFromStringSum {

	public static void main(String[] args) {

		String name = "Gautam123456789";

		int count = 0;
		int sum = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("Sum of digit = " + sum);
	}
}
