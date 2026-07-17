package com.rays.exception;

public class TestNullPointerException {

	public static void main(String[] args) {

		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
