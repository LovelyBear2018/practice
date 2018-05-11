package com.lzx.java.scheme.singleton;

/**
 * 懒汉式-双重校验锁
 * @author liuzhixiong 
 * 2017年11月07日20:09:19
 */

public class Singleton5 {
	private volatile static Singleton5 singleton;

	private Singleton5() {
	}

	public static Singleton5 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton5.class) {
				if (singleton == null) {
					singleton = new Singleton5();
				}
			}
		}
		return singleton;
	}
}
