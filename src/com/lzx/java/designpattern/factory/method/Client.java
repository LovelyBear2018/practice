package com.lzx.java.designpattern.factory.method;

/**
 * Created by liuzhixiong on 2018/12/7.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        System.out.println(product);
    }
}
