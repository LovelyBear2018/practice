package com.lzx.java.algorithm.leetcode;

import java.util.Arrays;

/**
 * 下一个排序
 * @author liuzhixiong
 * 2018年06月15日22:39:30
 */

public class LeetCode31_NextPermutation {

	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 4, 3, 7, 6, 5};
		System.out.println(Arrays.toString(nums));
		nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void nextPermutation(int[] nums){
		
		if(nums.length == 0 || nums.length == 1){
			return;
		}
		
		int length = nums.length;
		int i = length - 1;
		while(i > 0 && nums[i] < nums[i-1]){
			i --;
		}
		
		if(i == 0){
			Arrays.sort(nums);
		} else {
			int base = nums[i-1];
			int j = nums.length - 1;
			while(nums[j] < base){
				j --;
			}
			
			nums[i-1] = nums[j];
			nums[j] = base;
			
			for(int t=i; t<length; t++){
				for(int k=t+1; k<length; k++){
					if(nums[k] < nums[t]){
						int temp = nums[k];
						nums[k] = nums[t];
						nums[t] = temp;
					}
				}
			}
		}
	}
}
