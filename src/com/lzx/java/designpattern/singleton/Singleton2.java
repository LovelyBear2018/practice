package com.lzx.java.designpattern.singleton;

/**
 * 懒汉式线程安全
 * @author liuzhixiong 
 * 2017年11月07日19:36:56
 */


public class Singleton2 {
	private static Singleton2 instance;
	private Singleton2() {
	}
	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
