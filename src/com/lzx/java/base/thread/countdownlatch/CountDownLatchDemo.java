package com.lzx.java.base.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by liuzhixiong on 2018/12/29.
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(2);

        new Thread() {
            @Override
            public void run() {
                System.out.println("子线程1 运行");
                System.out.println("子线程1 结束");
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("子线程2 运行");
                System.out.println("子线程2 结束");
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            }
        }.start();

        System.out.println("主线程等待子线程结束");
        try {
            countDownLatch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("主线程 运行");
        System.out.println("主线程 结束");

    }
}
