package com.lzx.java.designpattern.wrapper;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class Client_ObjectLevel {
    public static void main(String[] args) {
        Target t = new Adapter_ObjectLevel(new AdapteeImp());
        t.isPs2();
    }
}
