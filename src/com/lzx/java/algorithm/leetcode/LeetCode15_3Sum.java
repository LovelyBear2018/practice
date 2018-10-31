package com.lzx.java.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
注意：答案中不可以包含重复的三元组。
例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]

 * @author liuzhixiong
 * 2018年04月23日05:25:49
 */

public class LeetCode15_3Sum {
	
	public static void main(String[] args) {
		int[] nums = new int[]{0, 0, 0, 0};
		List<List<Integer>> resList = new LeetCode15_3Sum().threeSum(nums);
		for(List<Integer> list:resList){
			System.out.println(list);
		}
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(nums.length < 3) return res;
        Arrays.sort(nums);
        int i=0;
        
        while(i < nums.length-2){
            
            if(nums[i] > 0) break;
            
            int j = i+1;
            int k = nums.length-1;
            
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum == 0) res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if(sum <= 0) while(nums[j] == nums[++j] && j<k);
                if(sum >= 0) while(nums[k] == nums[--k] && j<k);
            }
            
            while(nums[i] == nums[++i] && i < nums.length-2);
        }
        
        return res;
    }
}
