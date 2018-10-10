package com.lzx.java.designpattern.wrapper.interfacelevel;

/**
 * 接口级适配器
 * Created by liuzhixiong on 2018/10/10.
 */
public class Client {

    public static void main(String[] args) {
        Source source = new Ashili();
        source.a();
        source.d();
    }

}
