package com.lzx.java.designpattern.wrapper.objectlevel;

import com.lzx.java.designpattern.wrapper.Adaptee;
import com.lzx.java.designpattern.wrapper.Target;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class Client {
    public static void main(String[] args) {
        Target t = new Adapter(new Adaptee());
        t.request();
    }
}
