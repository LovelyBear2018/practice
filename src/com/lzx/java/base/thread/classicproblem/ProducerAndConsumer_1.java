package com.lzx.java.base.thread.classicproblem;

import java.util.LinkedList;
import java.util.List;

/**
 * 生产者消费者问题(使用wait,notifyAll实现)
 * @author liuzhixiong
 * 2018年05月25日16:02:54
 */

class Storage {
	private static final int MAX_SIZE = 100;
	private static List<String> queue = new LinkedList<String>();
	
	public void produce(String s){
		synchronized (queue) {
			while(queue.size() == MAX_SIZE){
				System.out.println("仓库已满");

				try {
					queue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("生产了 " + s);
			queue.add(s);
			queue.notifyAll();
		}
	}
	
	public String consumer(){
		synchronized (queue) {
			while(queue.size() == 0){
				System.out.println("仓库已空");
				try {
					queue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			String s = queue.remove(0);
			queue.notifyAll();
			System.out.println("消费了 " + s);
			return s;
		}
	}
	
	public static List<String> getQueue() {
		return queue;
	}
	public static void setQueue(List<String> queue) {
		Storage.queue = queue;
	}
	public static int getMaxSize() {
		return MAX_SIZE;
	}
}

class Producer extends Thread{
	private Storage storage;
	public Producer(Storage storage){
		this.storage = storage;
	}
	
	public void run(){
		for(int i=0; i<1000; i++){
			storage.produce("" + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	private Storage storage;
	public Consumer(Storage storage){
		this.storage = storage;
	}
	
	public void run(){
		for(int i=0; i<1000; i++){
			storage.consumer();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ProducerAndConsumer_1 {
	
	public static void main(String[] args) {
		Storage storage = new Storage();
		Producer pro = new Producer(storage);
		Consumer con = new Consumer(storage);
		pro.start();
		con.start();
	}
	
}
