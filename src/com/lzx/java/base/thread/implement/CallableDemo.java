package com.lzx.java.base.thread.implement;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> call = new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                System.out.println("callable thread start..");
                Thread.sleep(2000);
                return 1;
            }
        };

        FutureTask<Integer> task = new FutureTask<>(call);
        Thread t =  new Thread(task);

        t.start();
        System.out.println("do other thing..");
        System.out.println("callable res=" + task.get());
	}
}
