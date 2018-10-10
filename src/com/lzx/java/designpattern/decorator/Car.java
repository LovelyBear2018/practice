package com.lzx.java.designpattern.decorator;

/**
 * 具体构件角色(真实对象)
 * Created by liuzhixiong on 2018/10/10.
 */
public class Car implements ICar {
     @Override
     public void move() {
         System.out.println("陆地上跑！");
     }
}
