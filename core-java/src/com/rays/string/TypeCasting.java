package com.rays.string;

public class TypeCasting {

	public static void main(String[] args) {
		
		int num = 100;
		
		//Interger to String
		
		String str = Integer.toString(num);
		System.out.println(str);
		
		String str1 = String.valueOf(num);
		System.out.println(str1);
	
		//String to Integer
		
		String name = "200";
		
		int str2 = Integer.parseInt(name);
		System.out.println(str2);
		
		int str3 = Integer.valueOf(name);
		System.out.println(str3);
	}
}
