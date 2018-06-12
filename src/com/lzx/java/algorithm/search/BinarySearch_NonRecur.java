package com.lzx.java.algorithm.search;

/**
 * 二分非递归查找
 * @author liuzhixiong
 * 2018年06月12日09:44:04
 */

public class BinarySearch_NonRecur {
	
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 4, 6, 8, 9};
		int res = binarySearch(nums, 5);
		System.out.println("res=" + res);
	}
	
	public static int binarySearch(int[] nums, int num){
		int low = 0;
		int high = nums.length;
		
		while(low <= high){
			int mid = (low + high) >> 1;
			if(nums[mid] == num) {
				return mid;
			} else if(nums[mid] > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return -1;
	}
}
