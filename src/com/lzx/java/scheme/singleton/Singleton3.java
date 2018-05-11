package com.lzx.java.scheme.singleton;

/**
 * 饿汉式
 * @author liuzhixiong 
 * 2017年11月07日19:36:56
 */

public class Singleton3 {
	private static Singleton3 instance = new Singleton3();

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return instance;
	}
}
