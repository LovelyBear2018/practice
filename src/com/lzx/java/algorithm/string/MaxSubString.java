package com.lzx.java.algorithm.string;

/**
 * 最长公共子串
 * @author liuzhixiong
 * 2018年06月11日15:29:11
 */

public class MaxSubString {
	public static void main(String[] args) {
		String s1 = "afdbcde";
		String s2 = "afdbcfe";
		
		int res = new MaxSubString().maxSubString(s1, s2);
		System.out.println(res);
	}
	
	public int maxSubString(String s1, String s2){
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		int result = 0;
		
		int[][] res = new int[len1 + 1][len2 + 1];
		
		for(int i=0; i<len1+1; i++){
			for(int j=0; j<len2+1; j++){
				if(i == 0 || j == 0){
					res[i][j] = 0;
				} else if(s1.charAt(i-1) == s2.charAt(j-1)){
					res[i][j] = res[i-1][j-1] + 1;
					if(res[i][j] > result){
						result = res[i][j];
					}
				}
			}
		}
		
		return result;
	}
}
