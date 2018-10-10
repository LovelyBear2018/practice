package com.lzx.java.designpattern.decorator;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class SuperCar implements ICar{
     private ICar car;
     public SuperCar(ICar car){
         this.car = car;
     }

     @Override
     public void move() {
         car.move();
     }
}
