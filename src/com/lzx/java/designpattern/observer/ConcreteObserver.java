package com.lzx.java.designpattern.observer;

/**
 * Created by liuzhixiong on 2018/12/12.
 */
public class ConcreteObserver implements Observer{
    String name;
    public ConcreteObserver(String name) {
        this.name = name;
    }
    public void update(String message) {
        System.out.println(name + " 接收到 " + message);
    }
}
