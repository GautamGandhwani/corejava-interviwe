package com.rays.exception;

public class LoginException extends Exception{

	public LoginException() {
		super("Login Id & Password is Invailid");
	}
}
