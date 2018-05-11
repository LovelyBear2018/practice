package com.lzx.java.scheme.singleton;

/**
 * 饿汉式-变种
 * @author liuzhixiong 
 * 2017年11月07日19:51:08
 */

public class Singleton4 {
	
	public static void main(String[] args) {
		System.out.println(Singleton4.class);
	}
	
	private static Singleton4 instance = null;
	static {
		instance = new Singleton4();
	}

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		return instance;
	}
}
