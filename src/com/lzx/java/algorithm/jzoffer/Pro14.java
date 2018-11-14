package com.lzx.java.algorithm.jzoffer;

/**
 * 剪绳子问题:给你一根长度为n的绳子，请把绳子剪成m段 (m和n都是整数，n>1并且m>1)每段绳子的长度记为k[0],k[1],...,k[m].请问k[0]*k[1]*...*k[m]可能的最大乘积是多少？
 * Created by liuzhixiong on 2018/11/7.
 */
public class Pro14 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(maxProductAfter(n));
    }

    private static int maxProductAfter(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int times3Of = n / 3;

        if (n % 3 == 1) {
            return (int) Math.pow(3, (times3Of - 1)) * 4;
        }
        if (n % 3 == 0) {
            return (int) Math.pow(3, times3Of);
        }
        return (int) Math.pow(3, times3Of) * 2;
    }
}
