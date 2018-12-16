package com.lzx.java.designpattern.builder;

/**
 * Created by liuzhixiong on 2018/12/11.
 */
public abstract class Builder {
    Product product = new Product();

    public abstract void buildA();
    public abstract void buildB();
    public abstract void buildC();

    public Product getResult() {
        return product;
    }
}
