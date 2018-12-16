package com.lzx.java.designpattern.prototype;

/**
 * Created by liuzhixiong on 2018/12/11.
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype1 = new ConcretePrototype();
        concretePrototype1.setA("a");
        concretePrototype1.setB("b");
        concretePrototype1.setC("c");
        System.out.println(concretePrototype1);

        ConcretePrototype concretePrototype2 = (ConcretePrototype)concretePrototype1.clone();
        System.out.println(concretePrototype2);

        System.out.println(concretePrototype1 == concretePrototype2);
    }
}
