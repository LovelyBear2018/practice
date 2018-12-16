package com.lzx.java.designpattern.prototype;

/**
 * Created by liuzhixiong on 2018/12/11.
 */
public class ConcretePrototype implements Cloneable{

    String a;
    String b;
    String c;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public Object clone() {
        ConcretePrototype concretePrototype = null;
        try {
            concretePrototype = (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Not support cloneable");
        }
        return concretePrototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
