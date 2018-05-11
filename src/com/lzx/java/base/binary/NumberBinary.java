package com.lzx.java.base.binary;

/**
 * 打印int数值的二进制
 * @author liuzhixiong
 * 2017年11月17日10:47:32
 */

public class NumberBinary {
	public static void main(String[] args) {
		System.out.println(toFullBinaryString(2077946));
	}
	
	private static String toFullBinaryString(int x) {
        int[] buffer = new int[Integer.SIZE];
        for (int i = (Integer.SIZE - 1); i >= 0; i--) {
            buffer[i] = x >> i & 1;
        }
        String s = "";
        for (int j = (Integer.SIZE - 1); j >= 0; j--) {
            s = s + buffer[j];
        }
        return s;
    }
}
