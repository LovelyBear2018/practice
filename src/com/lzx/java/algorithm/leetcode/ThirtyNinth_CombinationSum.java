package com.lzx.java.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ThirtyNinth_CombinationSum {

	public static void main(String[] args) {
		int[] nums = new int[]{2, 3, 6, 7};
		int target = 7;
		List<List<Integer>> resList = combinationSum(nums, target);
		System.out.println(resList);
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
	
		getResList(resList, list, candidates, target, 0);
		
		return resList;
	}
	
	public static void getResList(List<List<Integer>> resList, List<Integer> list, int[] candidates, int target, int k){
		if(target == 0){
			List<Integer> tempList = new ArrayList<Integer>(list);
			resList.add(tempList);
		} else if(target > 0){
			for(int i=k; i<candidates.length; i++){
				list.add(candidates[i]);
				getResList(resList, list, candidates, target-candidates[i], i);
				list.remove(list.size()-1);
			}
		}
	}

}
