package com.lzx.java.jvm.reference;

import java.lang.ref.SoftReference;

/**
 * 软引用示例
 * @author liuzhixiong
 * 2018年05月03日17:03:38
 */

public class SoftReferenceDemo {

	public static void main(String[] args) {
		SoftReference<String> sr = new SoftReference<String>(new String("hello"));
        System.out.println(sr.get());
        System.gc();              //通知JVM的gc进行垃圾回收
        System.out.println(sr.get());
	}

}
