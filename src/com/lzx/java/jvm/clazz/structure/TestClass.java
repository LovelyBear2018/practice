package com.lzx.java.jvm.clazz.structure;

/**
 * 测试class文件结构
 * @author liuzhixiong
 * 2018年04月25日17:30:04
 */

public class TestClass {
	private int m;
	public int inc(){
		return m + 1;
	}
	
	public static void main(String[] args) {
		new TestClass().inc();
	}
}
