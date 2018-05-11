package com.lzx.java.base.thread.synchroized;

public class Synchronized_2 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new SyncThread(), "SyncThread1");
		Thread thread2 = new Thread(new SyncThread(), "SyncThread2");
		thread1.start();
		thread2.start();
	}
}
