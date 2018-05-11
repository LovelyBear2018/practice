package com.lzx.java.jvm.gc;

/**
 * MinorGC Eden 4M Survivor 0M 老年代 6M
 * @author liuzhixiong
 * 2018年04月23日04:38:54
 */

public class MinorGC {
	
	private static final int _1MB = 1024 * 1024;
	
	/*
	 * VM参数: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[2 * _1MB];
		allocation2 = new byte[2 * _1MB];
		allocation3 = new byte[2 * _1MB];
		allocation4 = new byte[4 * _1MB]; //出现一次MinorGC
	}
}
