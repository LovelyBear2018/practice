package com.lzx.java.designpattern.observer;

/**
 * Created by liuzhixiong on 2018/12/12.
 */
public interface Subject {
    boolean attach(Observer observer);
    boolean detach(Observer observer);
    boolean notifyall(String info);
    void addInfo(String info);
}
