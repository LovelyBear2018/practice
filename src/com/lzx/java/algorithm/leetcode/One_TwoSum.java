package com.lzx.java.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + 
 * @author liuzhixiong
 * 2018年04月23日05:21:24
 */

public class One_TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums.length < 2)
            return res;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                int index2 = map.get(target-nums[i]);
                if(i < index2){
                    res[0] = i;
                    res[1] = index2;   
                } else if(i > index2){
                    res[0] = index2;
                    res[1] = i;
                }
                break;
            }
            
            map.put(nums[i], i);
        }
        
        return res;
    }
}
