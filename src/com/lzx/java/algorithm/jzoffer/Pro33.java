package com.lzx.java.algorithm.jzoffer;

import com.lzx.java.node.TreeNode;

/**
 * 给定某树的后续遍历，判断该树是否为二叉搜索树
 * Created by liuzhixiong on 2018/11/7.
 */
public class Pro33 {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 6, 9, 11, 10, 8};
        boolean res = new Pro33().getResult(nums, 0, nums.length - 1);
        System.out.println(res);
    }

    private boolean getResult(int[] nums, int start, int end) {
        if(nums == null){
            return false;
        }

        if(start == end){
            return true;
        }

        int base = nums[end];
        int i = 0;
        while(nums[i] < base) i ++;
        int j = i;
        while(nums[j] > base) j ++;
        if(j != end) {
            return false;
        }

        boolean left = false;
        if(i > start){
            left = getResult(nums, start, i - 1);
        }

        boolean right = false;
        if(i < end) {
            right = getResult(nums, i, end - 1);
        }

        return left && right;
    }
}
