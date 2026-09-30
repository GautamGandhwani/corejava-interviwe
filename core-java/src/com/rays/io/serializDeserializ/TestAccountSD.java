package com.rays.io.serializDeserializ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSD {

	public static void main(String[] args) throws Exception {
		
		Account a = new Account("001", 500.0);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream ("D:\\IO\\Account.txt"));
		
		// Convert Account class object into byte stream: serialization
		out.writeObject(a);
		
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\IO\\Account.txt"));
		
		// Convert byte stream into Account class object: deserialization
		System.out.println(in.readObject());
		
		in.close();
	}
}