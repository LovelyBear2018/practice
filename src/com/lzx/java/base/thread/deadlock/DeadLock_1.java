package com.lzx.java.base.thread.deadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 死锁
 * @author liuzhixiong
 * 2018年05月25日10:11:40
 */

public class DeadLock_1{
	
	static ReentrantLock lock1 = new ReentrantLock();
	static ReentrantLock lock2 = new ReentrantLock();
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	public void run(){
		synchronized (DeadLock_1.lock1) {
			System.out.println(Thread.currentThread().getName() + " lock " + "lock1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (DeadLock_1.lock2) {
				System.out.println(Thread.currentThread().getName() + " lock " + "lock2");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Thread2 extends Thread {
	public void run(){
		synchronized (DeadLock_1.lock2) {
			System.out.println(Thread.currentThread().getName() + " lock " + "lock2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (DeadLock_1.lock1) {
				System.out.println(Thread.currentThread().getName() + " lock " + "lock1");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
