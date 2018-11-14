package com.lzx.java.designpattern.wrapper.classlevel;

import com.lzx.java.designpattern.wrapper.Adaptee;
import com.lzx.java.designpattern.wrapper.Target;

/**
 * 类级别适配器
 * Created by liuzhixiong on 2018/10/10.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request(){
           specificRequest();
    }
}
