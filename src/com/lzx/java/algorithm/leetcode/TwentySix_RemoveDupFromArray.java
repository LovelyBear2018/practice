package com.lzx.java.algorithm.leetcode;

import java.util.Arrays;

/**
 * 移除数组重复的数字
 * @author liuzhixiong
 * 2018年06月15日15:59:41
 */

public class TwentySix_RemoveDupFromArray {
	public static void main(String[] args) {
		int[] array = new int[]{4, 4, 2, 3, 1, 1, 5};
		int length = removeDupFromArray(array);
		System.out.println("length=" + length);
		System.out.println(Arrays.toString(array));
	}
	
	public static int removeDupFromArray(int[] nums){
		if(nums == null || nums.length == 0)return 0;
        if(nums.length == 1)return 1;
        
        int curr = nums[0];
        int pos = 0;
        int length = nums.length;
        
        for(int i=1; i<nums.length; ++i){
            if(nums[i] != curr){
                nums[++pos] = nums[i];
                curr = nums[i];
            }else{
                length --;
            }
        }
        
        return length;
	}
}
