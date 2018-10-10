package com.lzx.java.designpattern.strategy;

/**
 * Created by liuzhixiong on 2018/10/10.
 */
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.9;
    }
}
