package com.rays.string;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Gautam");

		System.out.println("String = "+sb.toString());
		
		System.out.println("Length = " + sb.length());

		System.out.println("Capacity = " + sb.capacity());

		System.out.println("IndexOf = " + sb.indexOf("u"));

		System.out.println("CharAt = " + sb.charAt(1));
		
		System.out.println("Delete = "+ sb.delete(0, 2));
		
		System.out.println("Append = " + sb.append(" Gandhwani"));
		
		System.out.println("Insert = " + sb.insert(6, "Ga"));
		
		System.out.println("Reverse = " + sb.reverse());
		
		System.out.println("Replace = " + sb.replace(0, 4, "d"));
	}
}
