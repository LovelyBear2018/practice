package com.lzx.java.designpattern.chainofresponsibility;

/**
 * Created by liuzhixiong on 2018/11/1.
 */
public interface Chain {
    // 获取当前request
    Request request();

    // 转发request
    Result proceed(Request request);
}
