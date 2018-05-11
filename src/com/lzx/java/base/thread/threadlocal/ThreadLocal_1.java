package com.lzx.java.base.thread.threadlocal;

public class ThreadLocal_1 {
	private static final ThreadLocal<Integer> local = ThreadLocal.withInitial(()->0);  
    public static void main(String[] args) throws InterruptedException {  
        for(int i = 0; i < 10;i += 3){  
            new MyThread(i).start();  
        }  
    }  
  
    static class MyThread extends Thread{  
        private int end;  
  
        public MyThread(int end) {  
            this.end = end;  
        }  
  
        @Override  
        public void run() {  
            System.out.println(Thread.currentThread().getName() + " start, local = " + local.get());  
            for(int i = 0; i <= end;i++){  
                local.set(local.get() + i); //计算(end+1)*end/2的值  
            }  
            System.out.println(Thread.currentThread().getName() + " end, local = " + local.get());  
        }  
    }  
}
