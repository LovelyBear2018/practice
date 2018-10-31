package com.lzx.java.designpattern.proxy;

/**
 * Created by liuzhixiong on 2018/10/29.
 */
public class Client {
    public static void main(String[] args) {

        Subject subject = new RealSubject();
        subject.request();
        Subject proxy = new Proxy(subject);
        proxy.request();

    }
}
