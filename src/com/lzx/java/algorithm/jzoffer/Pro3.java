package com.lzx.java.algorithm.jzoffer;

/**
 * 数组中重复的数字:在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3。
 * Created by liuzhixiong on 2018/10/29.
 */
public class Pro3 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        int res = duplicate(array);
        System.out.println(res);
    }

    private static int duplicate(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] < 0 || array[i] > length - 1) {
                return -1;
            }
        }
        for (int i = 0; i < length; i++) {
            while (array[i] != i) {
                if (array[i] == array[array[i]]) {
                    return array[i];
                }
                int temp = array[i];
                array[i] = array[temp];
                array[temp] = temp;
            }
        }
        return -1;
    }
}
