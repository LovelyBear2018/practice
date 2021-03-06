package com.lzx.java.nlp.hamdistance;

/**
 * 计算两个数字(字符)的海明距离
 * @author liuzhixiong
 * 2017年10月25日15:59:26
 */

public class HamDistanceCompute {
	public static void main(String[] args) {
//		int a = 5;
//		int b = 6;
//		
//		int distance = hamdistance_Number(a, b);
//		System.out.println("distance of number is: " + distance);
		String a = "1000101100011010001000110000100000000000011011100001101010000100";
		String b = "1010111110010110011000110000100000010110111101110011101110000100";
		int distance = hamdistance_String(a, b);
		System.out.println("distance of string is: " + distance);
	}
	
	public static int hamdistance_String(String a, String b){
		if(a == null || b == null){
			return 0;
		}
		int l1 = a.length();
		int l2 = b.length();
		if(l1 != l2){
			return 0;
		}
		int k = 0;
		int distance = 0;
		while(k < l1){
			if(a.charAt(k) != b.charAt(k)){
				distance ++;
			}
			
			k ++;
		}
		return distance;
	}
	
	public static int hamdistance_Number(int a, int b){
		int res = a ^ b;
		int distance = 0;
		while(res != 0){
			if((res & 1) == 1){
				distance ++;
			}
			res >>= 1;
		}
		return distance;
	}
}
