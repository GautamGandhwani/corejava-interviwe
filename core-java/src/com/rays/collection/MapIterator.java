package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(1,"Ram");
		m.put(2, "Shyam");
		m.put(3, "Lakhan");
		m.put(4, null);
		
		System.out.println(m);
		
		for (Object o : m.entrySet()) {
			System.out.println(o);
		}
		
		for (Object o : m.values()) {
			System.out.println(o);
		}
		
		for (Object o : m.keySet()) {
			System.out.println(o);
		}
	}
}
