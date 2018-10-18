package com.lzx.java.base.thread.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixedThreadPoolDemo {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 5; i++) {
			executor.submit(new Runnable(){
				@Override
				public void run() {
					System.out.println("task");
				}
			});
			System.out.println("线程池size=" + executor.getPoolSize());
		}

		try {
			Thread.sleep(10000);
		}catch (Exception e) {

		}
		System.out.println("线程池size=" + executor.getPoolSize());
	}
}
