package com.lzx.java.designpattern.factory.method;

/**
 * Created by liuzhixiong on 2018/12/7.
 */
public class ConcreteFactoryA implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
