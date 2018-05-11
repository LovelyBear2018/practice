package com.lzx.java.scheme.singleton;

/**
 * 懒汉式-静态内部类
 * @author liuzhixiong 
 * 2017年11月07日20:15:27
 */

public class Singleton6 {
	private static class LazyHolder {
		private static final Singleton6 INSTANCE = new Singleton6();
	}

	private Singleton6() {
	}

	public static final Singleton6 getInstance() {
		return LazyHolder.INSTANCE;
	}
}
