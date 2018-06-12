package com.lzx.java.algorithm.array;

import java.util.Arrays;

/**
 * 三数之和等于某数
 * @author liuzhixiong
 * 2018年06月12日10:17:57
 */

public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] res = threeSum(nums, 9);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] threeSum(int[] nums, int num){
		
		int[] res = new int[3];
		Arrays.fill(res, -1);
		
		for(int i=0; i<nums.length-3; i ++){
			if(nums[i] < num){
				int sum = num - nums[i];
				int j = i+1;
				int k = nums.length-1;
				while(j < k){
					int tempSum = nums[j] + nums[k];
					if(tempSum == sum){
						res[0] = i;
						res[1] = j;
						res[2] = k;
						break;
					} else if(tempSum > sum) {
						k --;
					} else {
						j ++;
					}
				}
			}
		}
		
		return res;
	}
}
