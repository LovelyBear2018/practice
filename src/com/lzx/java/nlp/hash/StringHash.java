package com.lzx.java.nlp.hash;

/**
 * 传统String类的hash函数
 * @author liuzhixiong
 * 2017年11月17日10:08:39
 */

public class StringHash {
	public static void main(String[] args) {
		String s = "123";
		System.out.println(s.hashCode());
		System.out.println(hashCode(s));
	}
	
	public static int hashCode(String s){
		int h = 0;
		char[] value = s.toCharArray();
        if (h == 0 && value.length > 0) {
            for (int i = 0; i < value.length; i++) {
                h = 31 * h + value[i];
            }
        }
        return h;
	}
}
