package com.rays.collection;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

		// AutoBoxing
        int a = 10;  //Primitive data type
        Integer i = a;  // Wapper class object

        System.out.println(i);
        
        // UnBoxing
        Integer x = 20;  // Wapper class object
        int b = x;  //Primitive data type

        System.out.println(b);
	}
}