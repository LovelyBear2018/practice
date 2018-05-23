package com.lzx.java.designpattern.dynamicproxy;

public class Client {  
    public static void main(String[] args) throws Exception {  
        UserMgr mgr = new UserMgrImpl();  

        //为用户管理添加事务处理  
        InvocationHandler h = new TransactionHandler(mgr);  
        UserMgr u = (UserMgr)Proxy.newProxyInstance(UserMgr.class, h);  

        //为用户管理添加显示方法执行时间的功能  
//        TimeHandler h2 = new TimeHandler(u);  
//        u = (UserMgr)Proxy.newProxyInstance(UserMgr.class, h2);  

        u.addUser();  
        System.out.println("\r\n==========华丽的分割线==========\r\n");  
        u.delUser();  
    }  
} 