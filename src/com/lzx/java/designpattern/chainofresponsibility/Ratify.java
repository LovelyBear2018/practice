package com.lzx.java.designpattern.chainofresponsibility;

/**
 * 接口描述：处理请求
 */
public interface Ratify {
    public Result deal(Chain chain);
}
