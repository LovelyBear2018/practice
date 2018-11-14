package com.lzx.java.designpattern.wrapper.classlevel;

import com.lzx.java.designpattern.wrapper.Target;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class Client {
    public static void main(String[] args) {
        Target t = new Adapter();
        t.request();
    }
}
