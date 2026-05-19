package com.rays.string;

public class CountNoOfIntFromString {

	public static void main(String[] args) {
		
		String name = "Gautam123456789";
		
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
			
			//print digits
			if (Character.isDigit(name.charAt(i))) {
				count++;
				System.out.println("digit = "+count);
			}
		}
		//print total digits
		System.out.println("total digit = "+count);
	}
}
