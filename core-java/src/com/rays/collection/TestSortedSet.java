package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add(300);
		s.add(200);
		s.add(400);
		s.add(100);
		
		System.out.println(s);
		
		System.out.println("f = "+s.first());
		System.out.println("l = "+s.last());
		System.out.println("hs = "+s.headSet(400));
		System.out.println("ts = "+s.tailSet(300));
		System.out.println("ss = "+s.subSet(300,400));
	}
}
