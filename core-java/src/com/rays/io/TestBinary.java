package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("D:\\IO\\welcome.jpg");

		FileOutputStream out = new FileOutputStream("D:\\IO\\welcomecopy.jpg");

		int ch = in.read();

		while (ch != -1) {

			System.out.print((char) ch);

			out.write(ch);

			ch = in.read();
		}
		in.close();
		out.close();
	}
}