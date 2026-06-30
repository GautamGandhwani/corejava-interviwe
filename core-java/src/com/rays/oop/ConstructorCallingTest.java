package com.rays.oop;

public class ConstructorCallingTest extends ConstructorCalling{

//	public ConstructorCallingTest(String fName,String lName) {
//		super(fName,lName);
//	}
	
	public ConstructorCallingTest(String fName) {
		super(fName);
	}
	
	public static void main(String[] args) {
		
		ConstructorCallingTest t = new ConstructorCallingTest("Gautam");
	}
}