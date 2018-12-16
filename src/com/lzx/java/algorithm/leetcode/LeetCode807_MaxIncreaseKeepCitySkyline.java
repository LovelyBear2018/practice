package com.lzx.java.algorithm.leetcode;

/**
 * Created by liuzhixiong on 2018/12/16.
 */
public class LeetCode807_MaxIncreaseKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row = new int[grid[0].length];
        int[] col = new int[grid.length];

        for(int i=0; i<grid.length; i++){
            int max = 0;
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] > max){
                    max = grid[i][j];
                }
            }
            col[i] = max;
        }

        for(int i=0; i<grid[0].length; i++){
            int max = 0;
            for(int j=0; j<grid.length; j++){
                if(grid[j][i] > max){
                    max = grid[j][i];
                }
            }
            row[i] = max;
        }

        int total = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                int max = Math.min(col[i], row[j]);
                int sub = max - grid[i][j];
                total += sub;
            }
        }

        return total;
    }
}
