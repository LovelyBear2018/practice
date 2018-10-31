package com.lzx.java.algorithm.leetcode;

import java.util.Arrays;

/**
 * Created by liuzhixiong on 2018/10/24.
 */
public class SetMatrixZero {

    public static void main(String[] args) {

        int[][] array = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int m = 4;
        int n = 4;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (0 == array[i][j]) {
                    array[i][0] = 0;
                    array[0][j] = 0;
                }
            }
        }
        for (int i = 0; i < m; ++i) {
            if (0 == array[i][0]) {
                for (int j = 0; j < n; ++j) array[i][j] = 0;
            }
        }
        for (int j = 0; j < n; ++j) {
            if (0 == array[0][j]) {
                for (int i = 0; i < m; ++i) array[i][j] = 0;
            }
        }

        for(int i=0; i<m; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
