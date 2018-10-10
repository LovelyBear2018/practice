package com.lzx.java.designpattern.decorator;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class WaterCar extends SuperCar{
    public WaterCar(ICar car) {
         super(car);
     }

     public void swim(){
         System.out.println("水里游");
     }

     @Override
     public void move() {
         super.move();
         swim();
     }
}
