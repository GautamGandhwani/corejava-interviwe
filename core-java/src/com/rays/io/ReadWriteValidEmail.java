package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteValidEmail {

	public static void main(String[] args) throws Exception {
		
//		FileReader source = new FileReader("D:\\IO\\Email.txt");
//		FileWriter target = new FileWriter("D:\\IO\\ValidEmail.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\IO\\Email.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IO\\ValidEmail.txt"));
		
		String email = br.readLine();
		
		while(email != null) {
			
			if(email.endsWith("@gmail.com")) {
				System.out.println(email);
				
				bw.write(email);
				bw.newLine();
			}
			email = br.readLine();
		}
		br.close();
		bw.close();
	}

}