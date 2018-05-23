package com.lzx.java.designpattern.dynamicproxy;

import java.lang.reflect.Method;

public interface InvocationHandler {  
    public void invoke(Object o, Method m);  
}
