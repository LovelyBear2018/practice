package com.lzx.java.jvm.classload;

/**
 * 被动引用
 * @author liuzhixiong
 * 2018年04月27日10:28:10
 */

/**
 * 常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化
 */
class ConstClass {
	static {
		System.out.println("ConstClass init!");
	}
	
	public static final String HELLOWORLD = "hello world";
}

public class PassiveReference_3 {

	public static void main(String[] args) {
		System.out.println(ConstClass.HELLOWORLD);
	}

}
