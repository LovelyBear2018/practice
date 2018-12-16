package com.lzx.java.designpattern.builder;

/**
 * Created by liuzhixiong on 2018/12/11.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.contruct();
        System.out.println(product);
    }
}
