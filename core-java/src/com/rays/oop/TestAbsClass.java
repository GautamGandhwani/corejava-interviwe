package com.rays.oop;

public class TestAbsClass extends AbstractClass {

	@Override
	public void show() {
		System.out.println("Show Method");
	}

	public TestAbsClass(String name) {
		super(name);
		System.out.println(name);
	}

	public static void main(String[] args) {

		TestAbsClass t = new TestAbsClass("Gautam");

		t.simple();
		t.show();

		AbstractClass.simple();
	}
}