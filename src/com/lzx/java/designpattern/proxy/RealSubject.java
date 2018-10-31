package com.lzx.java.designpattern.proxy;

/**
 * Created by liuzhixiong on 2018/10/29.
 */
public class RealSubject implements Subject {
    public void request(){
        System.out.println("RealSubject request()");
    }
}
