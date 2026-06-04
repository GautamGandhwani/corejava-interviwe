package com.rays.string;

public class FindLargestStringFormParagraph {

	public static void main(String[] args) {

		String p = "I am student of rays technologeis in indore.";

		String[] words = p.split(" ");

		String largest = words[0];

		for (String word : words) {

			if (word.length() > largest.length()) {
				largest = word;
			}
		}
		System.out.println("largest word = " + largest);
	}
}