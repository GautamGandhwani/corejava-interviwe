package com.rays.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentTest {

	public static void main(String[] args) throws Exception {
		
		Student s = new Student();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf.parse("02-03-2003");
		s.setId(1);
		s.setRollNo(1001);
		s.setFirstName("Gautam");
		s.setLastName("Gandhwani");
		s.setDob(d);
		
		System.out.println("Id = "+ s.getId());
		System.out.println("Roll NO. = "+ s.getRollNo());
		System.out.println("First Name = "+ s.getFirstName());
		System.out.println("Last Name = "+ s.getLastName());
		System.out.println("DOB = "+s.getDob());
	}
}
