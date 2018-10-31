package com.lzx.java.algorithm.leetcode;

import java.util.Stack;

/**
 * 给定一个数组，找出这个数组中每一个数右边的第一个比它大的数
 * Created by liuzhixiong on 2018/10/24.
 */
public class RightFirstMaxArray {
    public static void main(String[] args) {
        int[] arr = {9, 6, 5, 7, 3, 2, 1, 5, 9, 10};
        int[] res = get(arr);
        for (int ele : res) {
            System.out.print(ele + "  ");
        }
    }

    public static int[] get(int[] arr) {
        int[] max = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            int top = stack.peek();
            while (!stack.isEmpty() && arr[i] > arr[top]) {
                max[top] = arr[i];
                stack.pop();
                if (!stack.isEmpty()) {
                    top = stack.peek();
                }
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            max[top] = -1;
        }
        return max;
    }
}
