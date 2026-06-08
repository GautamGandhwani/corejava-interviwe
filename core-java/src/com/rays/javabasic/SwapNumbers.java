package com.rays.javabasic;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 20;
		int b = 30;
		
		//With using third variable
//		int c = a;
//		a = b;
//		b = c;
		
		//Without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}