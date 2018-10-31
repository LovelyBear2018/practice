package com.lzx.java.algorithm.jzoffer;

/**
 * 在一个长为n+1的数组里的所有数字都在1~n的范围内，所以数组中至少有一个数字是重复的，请找出数组中任意一个重复的数字，但不能修改输入的数组。例如输入长度为8的数组{2，3，5，4，3，2，6，7}
 * 那么对应的输出是重复的数字2或3。
 * Created by liuzhixiong on 2018/10/30.
 */
public class Pro3_2 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 3, 2, 6, 7};
        int res = getDuplication(nums);
        System.out.println("res=" + res);
    }

    private static int getDuplication(int[] nums) {
        int length = nums.length;
        int start = 1;
        int end = length - 1;
        while(start <= end){
            int mid = ((end - start) >> 1) + start;
            int count = countRange(nums, length, start, mid);
            if(end == start){
                if(count > 1){
                    return start;
                }else {
                    break;
                }
            }
            if(count > (mid - start + 1)){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    private  static int countRange(int[] nums, int length, int start, int mid){
        if(nums == null){
            return 0;
        }
        int count = 0;
        for(int i=0; i<length; i++){
            if(nums[i] >= start && nums[i] <= mid){
                ++ count;
            }
        }
        return count;
    }
}
