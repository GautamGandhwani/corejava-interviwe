package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add("null");
		s.add(1);
		s.add(null);
		s.add("null");
		s.add(1);
		
		Set s1 = new HashSet();
		s1.add(2);
		s1.add("null");
		s1.add(2);
		s1.add(null);
		
		System.out.println(s);
		System.out.println(s.contains(1));
		System.out.println(s.containsAll(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.isEmpty());
		System.out.println(s.remove(1));
		System.out.println(s);
	}
}