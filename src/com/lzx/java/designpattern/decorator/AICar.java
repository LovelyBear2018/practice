package com.lzx.java.designpattern.decorator;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class AICar extends SuperCar {
    public AICar(ICar car) {
         super(car);
     }

     public void autoMove(){
         System.out.println("自动跑");
     }

     @Override
     public void move() {
         super.move();
         autoMove();
     }
}
