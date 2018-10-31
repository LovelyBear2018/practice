package com.lzx.java.base.shift;

/**
 * 左移
 * @author liuzhixiong
 * 2018年07月03日10:56:00
 */

public class LeftShift {
	public static void main(String[] args) {
		int COUNT_BITS = Integer.SIZE - 3;
		int res = (-1 << COUNT_BITS);
		System.out.println(res);
		System.out.println(res | 0);
	}
}
