package com.lzx.java.algorithm.array;

/**
 * 给定一个正整型数组，将数组中各个元素组合成一个数，输出组合结果最大的那个数。
 * 正常排序,重写比较函数, 如 3和302比,则变成333与302比较大小
 * Created by liuzhixiong on 2018/10/30.
 */
public class MaxNumberofArray {
    public static void main(String[] args) {
        int[] nums = {9, 3, 32, 33, 303};
        int res = getMaxNumber(nums);
        System.out.println("res=" + res);
    }

    private static int getMaxNumber(int[] nums) {
        int len = nums.length;

        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(compare(nums[i], nums[j])){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        return genResult(nums);
    }

    private static boolean compare(int i, int j) {
        String strI = String.valueOf(i);
        String strJ = String.valueOf(j);
        int maxLen = Math.max(strI.length(), strJ.length());
        if (strI.length() == strJ.length()) return i < j;
        if(strI.length() != maxLen){
            while(strI.length() != maxLen){
                strI = strI + strI.charAt(strI.length()-1);
            }
        }
        if(strJ.length() != maxLen){
            while(strJ.length() != maxLen){
                strJ = strJ + strJ.charAt(strJ.length()-1);
            }
        }
        return Integer.valueOf(strI) < Integer.valueOf(strJ);
    }

    private static int genResult(int[] nums) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<nums.length; i++) {
            builder.append(nums[i]);
        }
        return Integer.valueOf(builder.toString());
    }
}
