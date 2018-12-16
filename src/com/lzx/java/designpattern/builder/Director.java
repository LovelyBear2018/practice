package com.lzx.java.designpattern.builder;

/**
 * Created by liuzhixiong on 2018/12/11.
 */
public class Director {

    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Product contruct() {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getResult();
    }
}
