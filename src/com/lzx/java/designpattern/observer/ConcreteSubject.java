package com.lzx.java.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhixiong on 2018/12/12.
 */
public class ConcreteSubject implements Subject{
    private List<Observer> observers;
    private List<String> infos;

    public ConcreteSubject() {
        observers = new ArrayList<Observer>();
        infos = new ArrayList<String>();
    }
    @Override
    public void addInfo(String info) {
        infos.add(info);
        notifyall(info);
    }
    @Override
    public boolean attach(Observer observer) {
        return observers.add(observer);
    }
    @Override
    public boolean detach(Observer observer) {
        return observers.remove(observer);
    }
    @Override
    public boolean notifyall(String info) {
        for(Observer observer:observers){
            observer.update(info);
        }
        return true;
    }
}
