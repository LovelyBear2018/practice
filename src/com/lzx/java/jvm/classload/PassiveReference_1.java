package com.lzx.java.jvm.classload;

/**
 * 被动引用
 * @author liuzhixiong
 * 2018年04月27日10:28:10
 */

/**
 * 通过子类引用父类的静态字段，不会导致子类初始化
 */
class SuperClass {
	static {
		System.out.println("SuperClass init!");
	}
	
	public static int value = 123;
}

class SubClass extends SuperClass {
	static {
		System.out.println("SubClass init!");
	}
}

public class PassiveReference_1 {

	public static void main(String[] args) {
		System.out.println(SubClass.value);
	}

}
