package com.lzx.java.designpattern.dynamicproxy;

import java.lang.reflect.Method;

public class TransactionHandler implements InvocationHandler {  

    private Object target;  

    public TransactionHandler(Object target) {  
        super();  
        this.target = target;  
    }  

    @Override  
    public void invoke(Object o, Method m) {  
        System.out.println("开启事务.....");  
        try {  
            m.invoke(target);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        System.out.println("提交事务.....");  
    }
}  
