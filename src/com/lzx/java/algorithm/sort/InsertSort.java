package com.lzx.java.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author liuzhixiong
 * 2018年06月11日15:36:46
 */

public class InsertSort {
	public static void main(String[] args) {
		int[] nums = new int[]{3, 2, 4, 1, 8, 6, 7, 9, 5};
		System.out.println("排序前-" + Arrays.toString(nums));
		sort(nums);
		System.out.println("排序后-" + Arrays.toString(nums));
	}
	
	
	public static void sort(int[] nums){
		
		int len = nums.length;
		
		for(int i=1; i<len; i++){
			int temp = nums[i];
			int j=i-1;
			for(; j>=0 && nums[j] > temp; j--){
				nums[j+1] = nums[j];
			}
			nums[j+1] = temp;
		}
	}
}
