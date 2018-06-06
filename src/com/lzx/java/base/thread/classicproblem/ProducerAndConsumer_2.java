package com.lzx.java.base.thread.classicproblem;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 生产者消费者问题(使用阻塞队列实现)
 * @author liuzhixiong
 * 2018年06月06日10:27:23
 */

class Storage1 {
    // 仓库最大存储量
    private final int MAX_SIZE = 100;

    // 仓库存储的载体
    private LinkedBlockingQueue<Object> list = new LinkedBlockingQueue<Object>(100);  

    // 生产产品
    public void produce(String producer) {
        // 如果仓库已满
        if (list.size() == MAX_SIZE) {
            System.out.println("仓库已满，【" + producer + "】： 暂时不能执行生产任务!");            
        }

        // 生产产品
        try {
            list.put(new Object());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("【" + producer + "】：生产了一个产品\t【现仓储量为】:" + list.size());
    }

    // 消费产品
    public void consume(String consumer) {
        // 如果仓库存储量不足
        if (list.size() == 0) {
            System.out.println("仓库已空，【" + consumer + "】： 暂时不能执行消费任务!");            
        }

        try {
            list.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("【" + consumer + "】：消费了一个产品\t【现仓储量为】:" + list.size());        

    }

    public LinkedBlockingQueue<Object> getList() {
        return list;
    }

    public void setList(LinkedBlockingQueue<Object> list) {
        this.list = list;
    }
    public int getMAX_SIZE() {
        return MAX_SIZE;
    }
}

class Producer1 extends Thread{
	private Storage1 storage;
	public Producer1(Storage1 storage){
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

class Consumer1 extends Thread{
	private Storage1 storage;
	public Consumer1(Storage1 storage){
		this.storage = storage;
	}
	
	public void run(){
		for(int i=0; i<1000; i++){
			storage.consume("" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ProducerAndConsumer_2 {
	
	public static void main(String[] args) {
		Storage1 storage = new Storage1();
		Producer1 pro = new Producer1(storage);
		Consumer1 con = new Consumer1(storage);
		pro.start();
		con.start();
	}
	
}
