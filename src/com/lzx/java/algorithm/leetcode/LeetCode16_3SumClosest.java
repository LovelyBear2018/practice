package com.lzx.java.algorithm.leetcode;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 * @author liuzhixiong
 * 2018年04月27日16:29:09
 */

public class LeetCode16_3SumClosest {
	public static void main(String[] args) {
		int[] nums = new int[]{-3, -2, -5, 3, -4};
		int res = new LeetCode16_3SumClosest().threeSumClosest(nums, -1);
		System.out.println(res);
	}
	
	public int threeSumClosest(int[] nums, int target) {
		int length = nums.length;
		if(length < 3){
			return length;
		}
		
		Arrays.sort(nums);
		
		int closest = nums[0] + nums[1] + nums[2];
		int diff = Math.abs(closest - target);
		for(int i=0; i<length; i++){
			int left = i + 1, right = length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int newDiff = Math.abs(sum - target);
                if (diff > newDiff) {
                    diff = newDiff;
                    closest = sum;
                }
                if (sum < target) ++left;
                else --right;
            }
		}
		
		return closest;
	}
}
