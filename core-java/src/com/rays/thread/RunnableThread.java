package com.rays.thread;

public class RunnableThread implements Runnable {

	public String name;

	public RunnableThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + name);
		}
	}
}