package com.lzx.java.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序
 * @author liuzhixiong
 * 2018年06月11日15:54:43
 */

public class QuickSort {
	
	public static void main(String[] args) {
		int[] nums = new int[]{3, 2, 4, 1, 8, 6, 7, 9, 5};
		System.out.println("排序前-" + Arrays.toString(nums));
		sort(nums, 0, nums.length-1);
		System.out.println("排序后-" + Arrays.toString(nums));
	}
	
	
	public static void sort(int[] nums, int low, int high){
		
		int i = low;
		int j = high;
		int base = nums[low];
		
		while(i < j){
			while(i < j && nums[j] > base) j --;
			
			if(i < j){
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i ++;
			}
			
			while(i < j && nums[i] <= base) i ++;
			
			if(i < j){
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j --;
			}
		}
		
		if(i > low) sort(nums, low, i-1);
		if(j < high) sort(nums, j+1, high);
	}
}
