package com.lzx.java.designpattern.factory.simple;

/**
 * Created by liuzhixiong on 2018/12/7.
 */
public class Client {
    public static void main(String[] args) {
        String name = "A";
        Product product = Factory.createProduct(name);
        System.out.println(product);
    }
}
