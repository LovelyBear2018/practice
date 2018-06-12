package com.lzx.java.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author liuzhixiong
 * 2018年06月11日15:36:46
 */

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = new int[]{3, 2, 4, 1, 8, 6, 7, 9, 5};
		System.out.println("排序前-" + Arrays.toString(nums));
		sort(nums);
		System.out.println("排序后-" + Arrays.toString(nums));
	}
	
	
	public static void sort(int[] nums){
		
		int len = nums.length;
		
		for(int i=0; i<len; i++){
			for(int j=0; j<len-i-1; j++){
				if(nums[j] > nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
}
