package com.lzx.java.designpattern.decorator;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新的功能：飞行");
        ICar flayCar = new FlyCar(car);
        flayCar.move();

        System.out.println("增加新的功能：水里游");
        ICar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加两个新的功能，飞行，水里游");
        ICar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();
    }
}
