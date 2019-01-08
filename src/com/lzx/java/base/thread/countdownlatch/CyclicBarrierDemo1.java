package com.lzx.java.base.thread.countdownlatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by liuzhixiong on 2018/12/29.
 */
public class CyclicBarrierDemo1 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程" + Thread.currentThread().getName() + "继续执行");
            }
        });

        new Thread() {
            @Override
            public void run() {
                System.out.println("线程1 执行");
                try {
                    Thread.sleep(5000);
                    System.out.println("线程1 中途完成");
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }catch(BrokenBarrierException e){
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("线程2 执行");
                try {
                    Thread.sleep(1000);
                    System.out.println("线程2 中途完成");
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }catch(BrokenBarrierException e){
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("线程3 执行");
                try {
                    Thread.sleep(6000);
                    System.out.println("线程3 中途完成");
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }catch(BrokenBarrierException e){
                    e.printStackTrace();
                }
            }
        }.start();

    }
}
