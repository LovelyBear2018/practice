package com.lzx.java.designpattern.singleton;

/**
 * 懒汉式非线程安全
 * 
 * @author liuzhixiong 2017年11月07日19:19:11
 */

public class Singleton1 {

	private Singleton1() {
	}

	private static Singleton1 instance = null;

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}