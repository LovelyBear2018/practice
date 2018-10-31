package com.lzx.java.designpattern.proxy;

/**
 * Created by liuzhixiong on 2018/10/29.
 */
public class DynamcClient {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        ProxyInvocationHandler proxyHandler = new ProxyInvocationHandler(subject);
        Subject proxy = (Subject)java.lang.reflect.Proxy.newProxyInstance(DynamcClient.class.getClassLoader(), new Class[]{Subject.class}, proxyHandler);
        proxy.request();
    }
}
