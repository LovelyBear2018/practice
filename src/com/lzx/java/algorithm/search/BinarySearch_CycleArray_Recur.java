package com.lzx.java.algorithm.search;

/**
 * 循环数组二分查找
 * @author liuzhixiong
 * 2018年06月12日09:59:42
 */

public class BinarySearch_CycleArray_Recur {
	public static void main(String[] args) {
		int[] nums = new int[]{7, 8, 9, 1, 2, 3, 4, 5, 6};
		int res = cycleSearch(nums, -3, 0, nums.length-1);
		System.out.println("res=" + res);
	}
	
	public static int cycleSearch(int[] nums, int num, int low, int high){
		
		if(low > high){
			return -1;
		}
		
		int mid = (low + high) >> 1;
		
		if(nums[mid] == num){
			return mid;
		} else if(nums[mid+1] <= nums[high]){
			if(nums[mid+1] <= num && nums[high] >= num){
				return cycleSearch(nums, num, mid+1, high);
			} else {
				return cycleSearch(nums, num, low, mid-1);
			}
		} else {
			if(nums[low] <= num && nums[mid-1] >= num){
				return cycleSearch(nums, num, low, mid -1);
			} else {
				return cycleSearch(nums, num, mid+1, high);
			}
		}
	}
}
