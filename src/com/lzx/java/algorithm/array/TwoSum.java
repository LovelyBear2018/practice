package com.lzx.java.algorithm.array;

import java.util.Arrays;

/**
 * 两数之和等于某数
 * @author liuzhixiong
 * 2018年06月12日10:17:57
 */

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] res = twoSum(nums, 8);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] twoSum(int[] nums, int num){
		int i = 0;
		int j = nums.length -1;
		
		int[] res = new int[2];
		Arrays.fill(res, -1);
		
		while(i < j){
			int sum = nums[i] + nums[j];
			if(sum == num){
				res[0] = i;
				res[1] = j;
				break;
			} else if (sum > num){
				j --;
			} else {
				i ++;
			}
		}
		
		return res;
	}
}
