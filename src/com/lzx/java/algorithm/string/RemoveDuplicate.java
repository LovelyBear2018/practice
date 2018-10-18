package com.lzx.java.algorithm.string;

import java.util.LinkedHashSet;
import java.util.Map;

/**
 * 给定字符串，以空格分隔，去除其中重复的单词，并保持单词的顺序输出字符串
 * Created by liuzhixiong on 2018/10/18.
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "i am a good boy good";
        String res = removeDup(str);
        System.out.println(res);
    }

    private static String removeDup(String str) {
        String[] array = str.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for (String temp : array) {
            set.add(temp);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            sb.append(s + " ");
        }
        return sb.toString().trim();
    }
}
