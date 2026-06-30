package com.rays.oop.withoutconstructor;

public class TestShape {

	public static void main(String[] args) {

		Shape s[] = new Shape[3];

		s[0] = new Rectangle();

		s[1] = new Circle();

		s[2] = new Triangle();

		Rectangle r = (Rectangle) s[0];

		r.setLength(3);
		r.setWidth(4);

		Circle c = (Circle) s[1];

		c.setRedius(2);

		Triangle t = (Triangle) s[2];

		t.setBase(2);
		t.setHeight(2);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}
}