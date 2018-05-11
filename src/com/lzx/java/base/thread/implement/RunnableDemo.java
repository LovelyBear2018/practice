package com.lzx.java.base.thread.implement;

public class RunnableDemo implements Runnable{
	@Override
	public void run() {
		System.out.println("RunnableDemo start..");
	}
	
	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);
		t.start();
	}
}
