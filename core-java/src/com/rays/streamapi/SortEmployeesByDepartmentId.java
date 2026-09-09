package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesByDepartmentId {

	public static void main(String[] args) {

		List<Employee1> list = new ArrayList<Employee1>();

		list.add(new Employee1("Ram", 2));
		list.add(new Employee1("Shyam", 1));
		list.add(new Employee1("Jay", 1));
		list.add(new Employee1("Vijay", 3));

		List<Employee1> sortedEmployees = list.stream().sorted(Comparator.comparingInt(Employee1::getDepartmentId))
				.collect(Collectors.toCollection(ArrayList::new));

		sortedEmployees.forEach(
				employee -> System.out.println(employee.getName() + " " + employee.getDepartmentId()));

	}
}