package com.lzx.java.algorithm.leetcode;

/**
 * 求最大子数组的和
 * @author liuzhixiong
 * 2018年06月18日22:59:45
 */

public class FiftyThree_MaxSubArray {
	public static void main(String[] args) {
		int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int res = maxSubArray(nums);
		System.out.println(res);
	}
	
	public static int maxSubArray(int[] nums){
		int max = nums[0];
		int sum = nums[0];
		
		for(int i=1; i<nums.length; i++){
			if (sum < 0) {
				sum = nums[i];
			} else {
				sum += nums[i];
			}
			
			if(sum > max){
				max = sum;
			}
		}
		
		return max;
	}
}
