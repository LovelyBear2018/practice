package com.lzx.java.designpattern.strategy;

/**
 * Startegy
 * Created by liuzhixiong on 2018/10/10.
 */
public interface CalPrice {
    //根据原价返回一个最终的价格
    Double calPrice(Double orgnicPrice);
}
