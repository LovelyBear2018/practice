package com.lzx.java.base.thread.join;

/**
 * 线程调用join关键字,会使得main线程退出cpu的争夺,直到
 * 线程执行结束才会继续实行main线程.
 */

public class JoinTest extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("thread-" + i);
		}
	}
	
	public static void main(String[] args) {
		JoinTest test = new JoinTest();
		test.start();
		try {
			test.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<10; i++){
			System.out.println("main-" + i);
		}
	}
}
