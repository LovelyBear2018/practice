package com.lzx.java.designpattern.facade;

/**
 * Created by liuzhixiong on 2018/12/11.
 */
public class Facade {

    SubSysA subSysA;
    SubSysB subSysB;
    SubSysC subSysC;
    SubSysD subSysD;

    public Facade() {
        subSysA = new SubSysA();
        subSysB = new SubSysB();
        subSysC = new SubSysC();
        subSysD = new SubSysD();
    }

    public void facade() {
        subSysA.exec();
        subSysB.exec();
        subSysC.exec();
        subSysD.exec();
    }
}
