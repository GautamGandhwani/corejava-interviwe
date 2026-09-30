package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteValidEmailRegex {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("D:\\IO\\Email.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IO\\ValidEmail.txt"));

		String email = br.readLine();

		while (email != null) {

			if (email.matches("^[a-zA-Z0-9,_%+-]+@gmail\\.com$")) {

				bw.write(email);
				bw.newLine();

				System.out.println(email);
			}
			email = br.readLine();
		}
		br.close();
		bw.close();
	}
}