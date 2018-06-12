package com.lzx.java.algorithm.sort;

import java.util.Arrays;

/**
 * 堆排序
 * @author liuzhixiong
 * 2018年06月11日16:25:10
 */

public class HeapSort {
	
	public static void main(String[] args) {
		int[] nums = new int[]{3, 2, 4, 1, 8, 6, 7, 9, 5};
		System.out.println("排序前-" + Arrays.toString(nums));
		sort(nums);
		System.out.println("排序后-" + Arrays.toString(nums));
	}
	
	
	public static void sort(int[] nums){
		createHeap(nums);
		int len = nums.length;
		for(int i=len-1; i>0; i--){
			int temp = nums[i];
			nums[i] = nums[0];
			nums[0] = temp;
			
			foundHeap(nums, 0, i);
		}
	}
	
	public static void createHeap(int[] nums){
		int len = nums.length;
		for(int i=nums.length/2-1; i>=0; i--){
			foundHeap(nums, i, len);
		}
	}
	
	public static void foundHeap(int[] nums, int i, int len){
		int left = i * 2 + 1;
		int right = i * 2 + 2;
		
		int max = 0;
		if(left < len && nums[left] > nums[i]){
			max = left;
		} else {
			max = i;
		}
		
		if(right < len && nums[max] < nums[right]){
			max = right;
		}
		
		if(max != i){
			int temp = nums[max];
			nums[max] = nums[i];
			nums[i] = temp;
			
			foundHeap(nums, max, len);
		}
	}
}
