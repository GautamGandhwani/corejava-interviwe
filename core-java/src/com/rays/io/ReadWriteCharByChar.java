package com.rays.io;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteCharByChar {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("D:\\IO\\keyboard.txt");

		FileWriter wfile = new FileWriter("D:\\IO\\output.txt");

		int ch = file.read();

		while (ch != -1) {
			System.out.print((char) ch);

			wfile.write(ch);

			ch = file.read();
		}
		wfile.close();
		file.close();
	}
}