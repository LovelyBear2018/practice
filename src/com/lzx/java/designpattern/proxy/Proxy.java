package com.lzx.java.designpattern.proxy;

/**
 * Created by liuzhixiong on 2018/10/29.
 */
public class Proxy implements Subject {

    Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void request() {
        System.out.println("before...");
        subject.request();
        System.out.println("after...");
    }
}
