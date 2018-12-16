package com.lzx.java.designpattern.observer;

/**
 * Created by liuzhixiong on 2018/12/12.
 */
public class Client {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver("observer1");
        Observer observer2 = new ConcreteObserver("observer2");
        Observer observer3 = new ConcreteObserver("observer3");

        Subject subject = new ConcreteSubject();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.detach(observer2);
        subject.addInfo("info1");

        subject.attach(observer2);
        subject.addInfo("info2");
    }
}
