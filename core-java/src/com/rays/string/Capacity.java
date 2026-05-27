package com.rays.string;

public class Capacity {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("gautam");

		System.out.println("length = " + sb.length());
		System.out.println("Capacity = " + sb.capacity());
		System.out.println(sb.append("dsmsnsjabshabskioxcj")+"\n");
		System.out.println("length33:" + sb.length());
		System.out.println("capacity33:" + sb.capacity());
		System.out.println(sb.append("ggggggggggggg")+"\n");
		System.out.println("length33:" + sb.length());
		System.out.println("capacity33:" + sb.capacity());
		System.out.println(sb.append("llllllllllllllllll"));
	}
}