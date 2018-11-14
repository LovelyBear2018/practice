package com.lzx.java.algorithm.jzoffer;

/**
 * 二进制中1的个数
 * @author liuzhixiong 
 * 2018年08月17日10:27:23
 */

public class Pro15 {
	public static void main(String[] args) {
		int val = 21;
		System.out.println(new Pro15().getNumberOf1Bits(val));
	}
	
	public int getNumberOf1Bits(int val){
		int count = 0;
		while(val != 0){
			count ++;
			val &= (val-1);
		}
		return count;
	}
}
