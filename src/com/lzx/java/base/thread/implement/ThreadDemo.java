package com.lzx.java.base.thread.implement;

public class ThreadDemo extends Thread{
	
	public void run(){
		System.out.println("ThreadDemo start..");
	}
	
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		td.start();
	}
}
