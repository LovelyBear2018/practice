package com.lzx.java.designpattern.factory.abs;

/**
 * Created by liuzhixiong on 2018/12/7.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        System.out.println(product);

        Gift gift = factory.createGift();
        System.out.println(gift);

        factory = new ConcreteFactoryB();
        product = factory.createProduct();
        System.out.println(product);

        gift = factory.createGift();
        System.out.println(gift);
    }
}
