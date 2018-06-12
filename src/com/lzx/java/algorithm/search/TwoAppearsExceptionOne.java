package com.lzx.java.algorithm.search;

/**
 * 数字出现两次,只有一个出现了一次
 * @author liuzhixiong
 * 2018年06月12日10:57:00
 */

public class TwoAppearsExceptionOne {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 1, 2, 5, 3, 3};
		int res = twoAppears(nums);
		System.out.println("res=" + res);
	}
	
	public static int twoAppears(int[] nums){
		int res = 0;
		
		for(int i=0; i<nums.length; i++){
			res ^= nums[i];
		}
		
		return res;
	}
}
