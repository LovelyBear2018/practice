package com.lzx.java.designpattern.builder;

/**
 * Created by liuzhixiong on 2018/12/11.
 */
public class ConcreteBuilder extends Builder{

    String a;
    String b;
    String c;

    @Override
    public void buildA() {
    }

    @Override
    public void buildB() {
    }

    @Override
    public void buildC() {
    }

    public Product getResult() {
        return product;
    }
}



