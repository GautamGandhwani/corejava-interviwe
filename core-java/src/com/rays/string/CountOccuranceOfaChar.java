package com.rays.string;

public class CountOccuranceOfaChar {

	public static void main(String[] args) {

		String name = "gautam gandhwani";

		char ch = 'a';
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {
				count++;
			}
		}
		if (count != 0)
			System.out.println(ch + "=" + count);
	}
}