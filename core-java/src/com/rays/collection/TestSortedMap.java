package com.rays.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {

	public static void main(String[] args) {

		SortedMap m = new TreeMap();

		m.put(2, "Ram");
		m.put(1, "Shyam");
		m.put(3, "Lakhan");

		System.out.println(m);

		System.out.println(m.lastKey());
		System.out.println(m.firstKey());
		System.out.println(m.tailMap(2));
		System.out.println(m.subMap(1, 3));
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
	}
}
