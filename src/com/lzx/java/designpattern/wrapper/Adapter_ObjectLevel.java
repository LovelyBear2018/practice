package com.lzx.java.designpattern.wrapper;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class Adapter_ObjectLevel implements Target{

    private AdapteeImp adapteeImp;

    public Adapter_ObjectLevel(AdapteeImp adapteeImp) {
        this.adapteeImp = adapteeImp;
    }

    @Override
    public void isPs2(){
        adapteeImp.isUsb();
    }
}
