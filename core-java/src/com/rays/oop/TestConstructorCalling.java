package com.rays.oop;

public class TestConstructorCalling extends ConstructorCalling{

//	public TestConstructorCalling(String fName,String lName) {
//		super(fName,lName);
//	}
	
	public TestConstructorCalling(String fName) {
		super(fName);
	}
	
	public static void main(String[] args) {
		
		TestConstructorCalling t = new TestConstructorCalling("Gautam");
	}
}