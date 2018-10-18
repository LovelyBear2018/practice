package com.lzx.java.base.thread.deadlock.banker;

/**
 * Created by liuzhixiong on 2018/10/16.
 */
import java.util.Scanner;

public class TestBankerClass {


    public static void main(String[] args) {
        boolean choose = true;
        String c;
        Scanner in = new Scanner(System.in);
        BankerClass bankerClass = new BankerClass();
        System.out.println("这是一个三个进程，初始系统可用三类资源为{10,8,7}的银行家算法：");

        bankerClass.setSystemVariable();
        while (choose == true) {
            bankerClass.setRequest();
            System.out.println("您是否还要进行请求：y/n?");
            c = in.nextLine();
            if (c.endsWith("n")) {
                choose = false;
            }
        }
    }
}
