package com.lzx.java.algorithm.search;

import java.util.Arrays;

/**
 * 数字均出现两次,只有两个个出现了一次
 * @author liuzhixiong
 * 2018年06月12日10:57:00
 */

public class TwoAppearsExceptionTwo {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 1, 2, 5, 3, 3, 6};
		int[] res = twoAppears(nums);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] twoAppears(int[] nums){
		int[] res = new int[2];
		
		int xorRes = 0;
		for(int i=0; i<nums.length; i++){
			xorRes ^= nums[i];
		}
		
		xorRes &= -xorRes;
		
		for(int i=0; i<nums.length; i++){
			if((xorRes & nums[i]) != 0){
				res[0] ^= nums[i];
			} else {
				res[1] ^= nums[i];
			}
		}
		
		return res;
	}
}
