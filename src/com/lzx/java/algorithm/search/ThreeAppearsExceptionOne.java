package com.lzx.java.algorithm.search;

/**
 * 数字出现三次,只有一个出现了一次
 * @author liuzhixiong
 * 2018年06月12日10:57:00
 */

public class ThreeAppearsExceptionOne {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 1, 2, 2, 1, 3, 2, 5, 3, 3};
		int res = threeAppears(nums);
		System.out.println("res=" + res);
	}
	
	public static int threeAppears(int[] nums){
		
		int result = 0;
		
		for(int i=0; i<32; i++){
			int sum = 0;
			for(int j=0; j<nums.length; j++){
				sum += (nums[j] & (1 << i));
			}
			
			if(sum % 3 == 1){
				result |= (1 << i);
			}
		}
		
		return result;
	}
}
