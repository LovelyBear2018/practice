package com.lzx.java.designpattern.wrapper.objectlevel;

import com.lzx.java.designpattern.wrapper.Adaptee;
import com.lzx.java.designpattern.wrapper.Target;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request(){
        adaptee.specificRequest();
    }
}
