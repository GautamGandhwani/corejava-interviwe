package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		LocalDate bDate = LocalDate.of(2003, 03, 02);
		Period age = Period.between(bDate, date);
		System.out.println("Age = " + age.getYears());
	}
}