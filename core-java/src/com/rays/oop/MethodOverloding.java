package com.rays.oop;

public class MethodOverloding {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		MethodOverloding m = new MethodOverloding();

		System.out.println(m.sum(10, 20));
		System.out.println(m.sum(5, 6, 7));
	}
}