package com.lzx.java.designpattern.wrapper;

/**
 * 类级别适配器
 * Created by liuzhixiong on 2018/10/10.
 */
public class Adapter_ClassLevel extends AdapteeImp implements Target {

    @Override
    public void isPs2(){
           isUsb();
    }
}
