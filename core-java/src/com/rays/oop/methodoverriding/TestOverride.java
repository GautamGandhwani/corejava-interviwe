package com.rays.oop.methodoverriding;

public class TestOverride {

	public static void main(String[] args) {

		BaseCtl b = new BaseCtl();
		b.display();

		UserCtl u = new UserCtl();
		u.display();

		BaseCtl bu = new UserCtl();
		bu.display();
	}
}