package com.lzx.java.designpattern.factory.method;

/**
 * Created by liuzhixiong on 2018/12/7.
 */
public class ConcreteFactoryB implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
