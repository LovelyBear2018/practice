package com.lzx.java.algorithm.search;

/**
 * 二分递归查找
 * @author liuzhixiong
 * 2018年06月12日09:38:19
 */

public class BinarySearch_Recur {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 4, 6, 8, 9};
		int res = binarySearch(nums, 9, 0, nums.length);
		System.out.println("res=" + res);
	}
	
	public static int binarySearch(int[] nums, int num, int low, int high){
		
		if(low > high) return -1;
		
		int mid = (low + high) / 2;
		if(nums[mid] == num){
			return mid;
		} else if(nums[mid] > num){
			return binarySearch(nums, num, low, mid-1);
		} else {
			return binarySearch(nums, num, mid+1, high);
		}
	}
}
