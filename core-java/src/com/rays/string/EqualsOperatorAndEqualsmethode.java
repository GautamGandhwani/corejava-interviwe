package com.rays.string;

public class EqualsOperatorAndEqualsmethode {

	public static void main(String[] args) {

		String s1 = "SUNRAYS";
		String s2 = "SUNRAYS";

		String s3 = new String("SUNRAYS");
		String s4 = new String("SUNRAYS");

		System.out.println(s1 == s2);
		
		System.out.println(s1 == s3);

		System.out.println(s3.equals(s4));
		
		System.out.println(s3.equals(s1));
	}
}