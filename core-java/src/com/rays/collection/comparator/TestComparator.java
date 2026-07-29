package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Ram", 5000));
		list.add(new Employee(2, "Shyam", 3300));
		list.add(new Employee(3, "Lakhan", 4000));
		list.add(new Employee(4, "Raj", 5000));

		EmployeeSortByName byName = new EmployeeSortByName();

		Collections.sort(list, byName);

		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		EmployeeSortByIdName byIdName = new EmployeeSortByIdName();

//		Collections.sort(list, byIdName);
//		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		EmployeeSortByIdNameSalary byAll = new EmployeeSortByIdNameSalary();

//		Collections.sort(list, byAll);
//
//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
}