package com.lzx.java.algorithm.jzoffer;

/**
 * 连续子数组的最大和
 * Created by liuzhixiong on 2018/11/9.
 */
public class Pro42 {
    public static void main(String[] args) {
        int[] nums = new int[]{31, -41, 59, 26, -53, 58, 97, -93, -23, 84};
        int res = new Pro42().sum(nums);
        System.out.println(res);
    }

    private int sum(int[] nums){
        int max = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            sum += nums[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
