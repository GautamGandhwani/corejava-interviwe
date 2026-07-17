package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class RuntimeExceptions {

	public static void main(String[] args) {

		int a = 10;

		String b = "Gautam";

		String c = null;

		List list = new ArrayList();

		list.add("a");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			it.next();
		}

		try {
			int d = a / 0;

			System.out.println(b.charAt(10));

			System.out.println(c.length());

			System.out.println(it.next());
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
}
