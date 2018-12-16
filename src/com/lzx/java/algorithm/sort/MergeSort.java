package com.lzx.java.algorithm.sort;

import java.util.Arrays;

/**
 * Created by liuzhixiong on 2018/12/14.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4, 1, 8, 6, 7, 9, 5};
        System.out.println("排序前-" + Arrays.toString(nums));
        sort(nums, 0, nums.length - 1);
        System.out.println("排序后-" + Arrays.toString(nums));
    }

    public static void sort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int x = 0; x < temp.length; x++) {
            a[x + low] = temp[x];
        }
    }
}
