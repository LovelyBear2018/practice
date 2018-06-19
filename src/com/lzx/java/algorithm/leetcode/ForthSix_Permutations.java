package com.lzx.java.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 整数的全排列
 * @author liuzhixiong
 * 2018年06月18日22:26:21
 */

public class ForthSix_Permutations {

	public static void main(String[] args) {
		List<ArrayList<Integer>> resList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int[] nums = new int[]{1, 2, 3};
		for(int i=0; i<nums.length; i++){
			list.add(nums[i]);
		}
		resList.add(list);
		
		getRes(resList, 0, nums.length);
	
		for(int i=0; i<resList.size(); i++){
			ArrayList<Integer> tempList = resList.get(i);
			System.out.println(tempList);
		}
	}

	private static void getRes(List<ArrayList<Integer>> resList, int k, int n) {
		if(k != n){
			int size = resList.size();
			for(int i=0; i<size; i++){
				ArrayList<Integer> list = resList.get(i);
				for(int j=k+1; j<n; j++){
					ArrayList<Integer> tempList = new ArrayList<Integer>(list);
					int kInt = tempList.get(k);
					tempList.set(k, tempList.get(j));
					tempList.set(j, kInt);
					resList.add(tempList);
				}
			}
			getRes(resList, k+1, n);
		}
	}
}
