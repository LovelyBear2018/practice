package com.lzx.java.jvm.reference;

import java.lang.ref.WeakReference;

/**
 * 弱引用示例
 * @author liuzhixiong
 * 2018年05月03日17:11:09
 */

public class WeakReferenceDemo {
	public static void main(String[] args) {
		WeakReference<String> sr = new WeakReference<String>(new String("hello"));
        System.out.println(sr.get());
        System.gc();                //通知JVM的gc进行垃圾回收
        System.out.println(sr.get());
	}
}
