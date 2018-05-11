package com.lzx.java.jvm.classload;

/**
 * 被动引用
 * @author liuzhixiong
 * 2018年04月27日10:28:10
 */

/**
 * 通过数组定义来引用类，不会触发此类的初始化
 */
class SuperClazz {
	static {
		System.out.println("SuperClazz init!");
	}
	
	public static int value = 123;
}


public class PassiveReference_2 {

	public static void main(String[] args) {
		SuperClazz[] sca = new SuperClazz[10];
		System.out.println(sca);
	}

}
