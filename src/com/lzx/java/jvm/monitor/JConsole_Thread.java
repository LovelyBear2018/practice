package com.lzx.java.jvm.monitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JConsole之线程监控
 * @author liuzhixiong
 * 2018年04月25日11:26:08
 */

public class JConsole_Thread {

	/**
	 * 线程死循环演示
	 */
	public static void createBusyThread(){
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){
					
				}
			}
			
		}, "testBusyThread");
		
		thread.start();
	}
	
	/**
	 * 线程锁等待演示
	 */
	public static void createLockThread(final Object lock){
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				synchronized (lock) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				}
			}
			
		}, "testLockThread");
		
		thread.start();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		createBusyThread();
		br.readLine();
		Object obj = new Object();
		createLockThread(obj);
	}
}
