package com.lzx.java.designpattern.decorator;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class FlyCar extends SuperCar{
    public FlyCar(ICar car) {
         super(car);
    }

    public void fly(){
         System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
