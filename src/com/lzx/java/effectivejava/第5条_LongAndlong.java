package com.lzx.java.effectivejava;

/**
 * 自动装箱拆箱性能区别
 * @author liuzhixiong
 * 2018年05月10日14:49:17
 */

public class 第5条_LongAndlong {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Long sum = 0L;
		for(long i=0; i<Integer.MAX_VALUE; i++){
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println("Long 耗时:" + (end - start) + "ms");
		
		start = System.currentTimeMillis();
		long sum1 = 0L;
		for(long i=0; i<Integer.MAX_VALUE; i++){
			sum1 += i;
		}
		end = System.currentTimeMillis();
		System.out.println(sum1);
		System.out.println("long 耗时:" + (end - start) + "ms");
	}
}
