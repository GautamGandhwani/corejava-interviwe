package com.rays.exception;

public class LoginExceptionTest {

	public static void main(String[] args) {

		String name = "admi";

		try {
			if (name.equals("admin")) {
				System.out.println("Vailid User");
			} else {
				throw new LoginException();
			}
		} catch (Exception e) {
//			System.out.println(e);
			e.printStackTrace();
		}
	}
}
