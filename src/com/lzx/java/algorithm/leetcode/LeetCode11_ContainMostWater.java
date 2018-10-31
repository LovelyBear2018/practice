package com.lzx.java.algorithm.leetcode;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。画 n 条垂直线，使得垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * @author liuzhixiong
 * 2018年04月23日05:23:53
 */

public class LeetCode11_ContainMostWater {
	public int maxArea(int[] height) {
        
        if(height.length < 2)return 0;
        
        int i = 0;
        int j = height.length - 1;
        
        int max = 0;
        
        while(i < j){
            int water = (j - i) * Math.min(height[i], height[j]);
            if(water > max){
                max = water;
            }
            
            if(height[i] > height[j]){
                j --;   
            }else{
                i ++;   
            }
        }
        
        return max;
    }
}
