package com.lzx.java.base.thread.implement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("main start..");
		int taskSize = 5;

		ExecutorService pool = Executors.newFixedThreadPool(taskSize);
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();
		for (int i = 0; i < taskSize; i++) {
			Callable<Integer> c = new MyCallable<Integer>(i + " ");
			Future<Integer> f = pool.submit(c);
			list.add(f);
		}

		pool.shutdown();

		for (Future<Integer> f : list) {
			System.out.println("threads res=" + f.get());
		}
	}
}

@SuppressWarnings("hiding")
class MyCallable<Integer> implements Callable<Integer> {
	private String taskNum;

	MyCallable(String taskNum) {
		this.taskNum = taskNum;
	}

	@SuppressWarnings("unchecked")
	public Integer call() throws Exception {
		System.out.println("---" + taskNum + " thread start");
		Date dateStart = new Date();
		Thread.sleep(1000);
		Date dateEnd = new Date();
		long time = dateEnd.getTime() - dateStart.getTime();
		return (Integer) (taskNum + " end require[" + time + "ms]");
	}
}
