package com.lzx.java.algorithm.jzoffer;

/**
 * 数组中出现次数超过一半的数字
 * Created by liuzhixiong on 2018/11/9.
 */
public class Pro39 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 1, 2, 4, 2};
        int res = new Pro39().compute(nums);
        System.out.println("res=" + res);
    }

    private int compute(int[] nums) {
        int num = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == num){
                count ++;
            } else if(nums[i] != num) {
                count --;
                if(count == 0){
                    num = nums[++i];
                    count = 1;
                }
            }
        }
        return num;
    }
}
