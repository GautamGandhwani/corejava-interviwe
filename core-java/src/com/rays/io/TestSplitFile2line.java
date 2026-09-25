package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestSplitFile2line {
	public static void main(String[] args) throws Exception {

//		File file = new File("D:\\IO\\SplitFile.txt");

		BufferedReader br = new BufferedReader(new FileReader(new File("D:\\IO\\SplitFile.txt")));

		int fileNo = 1;
		String line = br.readLine();

		while (line != null) {

			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IO\\Split" + fileNo + ".txt"));

			// 2 lines per file
			for (int i = 1; i <= 2 && line != null; i++) {

				bw.write(line);
				bw.newLine();

				line = br.readLine();
			}
			bw.close();

			System.out.println("createFile" + fileNo);

			fileNo++;
		}
		br.close();
	}
}