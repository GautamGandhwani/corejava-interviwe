package com.rays.string;

public class StringAllMethods {

	public static void main(String[] args) {

		String name = "Gautam";
		String str = "Gandhwani";

		// Print length of the string
		System.out.println("String Length = " + name.length());
		
		// Convert to uppercase
		System.out.println("Upper Case = " + name.toUpperCase());
		
		// Convert to lowercase
		System.out.println("Lower Case = " + name.toLowerCase());
		
		// Check if string starts with "K"
		System.out.println("Start With = " + name.startsWith("G"));
		
		// Check if string ends with "d"
		System.out.println("End With = " + name.endsWith("m"));
		
		// Print character at index 6
		System.out.println("Char At = " + name.charAt(0));
		
		// Print index of first occurrence of 'a'
		System.out.println("Index Of = " + name.indexOf("G"));
		
		 // Print last index of 'i'
		System.out.println("Last Index Of = " + name.lastIndexOf("m"));
		
		// Print substring starting from index 6 to end
		System.out.println("Sub String = " + name.substring(1));
//		System.out.println("Sub String = " + name.substring(0, 1));
		
		// Trim leading and trailing whitespace from string
		System.out.println("Trim = " + name.trim());
		
		// Concatenate two strings
		System.out.println("Conact = " + name.concat(str));
		
		// Concatenate two strings
		System.out.println("Concat = " + str.concat(name));
		
		// Replace 'D' with 'k' (case sensitive)
		System.out.println("Replace = " + name.replace("Gautam", "Gaurav"));

		// Split string based on space
		String str1 = "Hellow Java";
		String[] s = str1.split(" "); 

		for (String s1 : s) {
			System.out.print(s1);
		}

		System.out.println(".........................");

		String s2 = "SUNRAYS";
		String s3 = "SUNRAYS";

		String s4 = new String("SUNRAYS");
		String s5 = new String("SUNRAYS");

		boolean b = (s2 == s3);
		System.out.println(b);
		boolean p = s2.equals(s3);
		System.out.println(p);
	}
}