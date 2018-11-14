package com.lzx.java.algorithm.jzoffer;

/**
 * 最长不含重复字符的子字符串,例如arabcacfr,最长字符串是rabc
 * Created by liuzhixiong on 2018/11/14.
 */
public class Pro48 {
    public static void main(String[] args) {
        String str = "arabcacfr";
        int res = new Pro48().subStr(str);
        System.out.println(res);
    }

    private int subStr(String str) {
        if (str == null || str.equals("")) return 0;
        int maxLength = 0;
        int curLength = 0;
        int[] positions = new int[26];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1; //初始化为-1，负数表示没出现过
        }
        for (int i = 0; i < str.length(); i++) {
            int curChar = str.charAt(i) - 'a';
            int prePosition = positions[curChar];
            //当前字符与它上次出现位置之间的距离
            int distance = i - prePosition;
            //当前字符第一次出现，或者前一个非重复子字符串中没有包含当前字符
            if (prePosition < 0 || distance > curLength) {
                curLength ++;
            } else {
                //更新最长非重复子字符串的长度
                if (curLength > maxLength) {
                    maxLength = curLength;
                }
                curLength = distance;
            }
            positions[curChar] = i; //更新字符出现的位置
        }
        if (curLength > maxLength) {
            maxLength = curLength;
        }
        return maxLength;
    }
}
