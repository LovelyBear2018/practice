package com.lzx.java.jvm.gc;

/**
 * 大对象直接分配到老年代
 * @author liuzhixiong
 * 2018年04月23日04:47:03
 */

public class BigInstanceGC {
	
	private static final int _1MB = 1024 * 1024;
	
	/**
	 * VM参数:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+PrintTenuringDistribution
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] allocation1, allocation2, allocation3;
		allocation1 = new byte[_1MB / 4];
		//什么时候进入老年代取决于 XX:MaxTenuringThreshold设置
		allocation2 = new byte[4 * _1MB];
		allocation3 = new byte[4 * _1MB];
		allocation3 = null;
		allocation3 = new byte[4 * _1MB];
	}
}
