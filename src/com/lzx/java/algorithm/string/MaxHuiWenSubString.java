package com.lzx.java.algorithm.string;

import java.util.Arrays;

/**
 * 最长回文字串
 * Created by liuzhixiong on 2019/1/3.
 */
public class MaxHuiWenSubString {
    public static void main(String[] args) {
        String str = "dddababceee";
        String res = max(str);
        System.out.println(res);
    }

    public static String max(String str) {
        char[] chars = new char[2 * str.length() + 1];
        for (int i = 0; i < str.length(); i++) {
            chars[2 * i] = '#';
            chars[2 * i + 1] = str.charAt(i);
        }
        chars[chars.length - 1] = '#';

        int max = 0;
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            int k = 0;
            while (i - k >= 0 && i + k < chars.length && chars[i - k] == chars[i + k]) {
                k++;
            }
            if (k > max) {
                max = k;
                idx = i;
            }
        }

        String res = String.valueOf(chars).substring(idx - max + 1, idx + max);

        return res.replaceAll("#", "");
    }
}
