package com.lzx.java.base.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 5; i++) {
			executor.submit(new Runnable(){
				@Override
				public void run() {
					System.out.println("task");
				}
			});
		}
	}
}
