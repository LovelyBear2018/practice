package com.lzx.java.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
示例：
给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串
 * @author liuzhixiong
 * 2018年04月23日05:22:25
 */

public class LeetCode3_LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<Character>();
        
        int ans = 0;
        int i = 0;
        int j = 0;
        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j ++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i ++));
            }
        }
        
        return ans;
    }
}
