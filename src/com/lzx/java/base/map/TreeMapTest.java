package com.lzx.java.base.map;

import java.util.TreeMap;

/**
 * TreeMap按键排序
 * @author liuzhixiong
 * 2018年05月16日14:14:16
 */

public class TreeMapTest {
	public static void main(String[] args) {
		 TreeMap<String, String> tMap = new TreeMap<String, String>();
		 tMap.put("2", "1");
		 tMap.put("4", "1");
		 tMap.put("1", "1");
		 tMap.put("3", "1");
		 
		 String firstKey = tMap.firstKey();
		 String lastKey = tMap.lastKey();
		 System.out.println("firstKey=" + firstKey);
		 System.out.println("lastKey=" + lastKey);
	}
}
