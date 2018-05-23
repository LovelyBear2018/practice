package com.lzx.java.designpattern.dynamicproxy;
import java.lang.reflect.Method;
public class $Proxy1 implements com.lzx.java.designpattern.dynamicproxy.UserMgr{
    public $Proxy1(InvocationHandler h) {
        this.h = h;
    }
    com.lzx.java.designpattern.dynamicproxy.InvocationHandler h;
    @Override
    public  void delUser() {
        try {
        Method md = com.lzx.java.designpattern.dynamicproxy.UserMgr.class.getMethod("delUser");
        h.invoke(this, md);
        }catch(Exception e) {e.printStackTrace();}
    }
    @Override
    public  void addUser() {
        try {
        Method md = com.lzx.java.designpattern.dynamicproxy.UserMgr.class.getMethod("addUser");
        h.invoke(this, md);
        }catch(Exception e) {e.printStackTrace();}
    }

}