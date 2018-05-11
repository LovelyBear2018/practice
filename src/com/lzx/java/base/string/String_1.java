package com.lzx.java.base.string;

/**
 * 1.6与1.7结果不一样
 * @author liuzhixiong
 * 2018年04月22日05:21:15
 */

public class String_1 {
	public static void main(String[] args) {
		String str1  = new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
		
	}
}
