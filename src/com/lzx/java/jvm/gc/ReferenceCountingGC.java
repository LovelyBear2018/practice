package com.lzx.java.jvm.gc;

/**
 * 引用计数算法 循环引用问题导致垃圾无法回收
 * @author liuzhixiong
 * 2018年04月22日20:45:11
 */

public class ReferenceCountingGC {
	
	public Object instance = null;
	private static final int _1MB = 1024 * 1024;
	
	/*
	 * 这个成员属性的唯一意义就是占用内存，以便能在GC日志中看清楚是否被回收过
	 */
	@SuppressWarnings("unused")
	private byte[] bigSize= new byte[2 * _1MB];
	
	public static void main(String[] args) {
		
		ReferenceCountingGC objA = new ReferenceCountingGC();
		ReferenceCountingGC objB = new ReferenceCountingGC();
		objA.instance = objB;
		objB.instance = objA;
		
		objA = null;
		objB = null;
		
		//假设在这行发生GC，objA和objB是否能被回收
		System.gc();
	}
}
