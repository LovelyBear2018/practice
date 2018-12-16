package com.lzx.java.designpattern.factory.simple;

/**
 * Created by liuzhixiong on 2018/12/7.
 */
public class Factory {
    public static Product createProduct(String name) {
        if(name.equals("A")){
            return new ConcreteProductA();
        } else if (name.equals("B")) {
            return new ConcreteProductB();
        }
        return null;
    }
}
