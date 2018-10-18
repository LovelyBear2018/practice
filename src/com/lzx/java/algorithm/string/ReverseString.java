package com.lzx.java.algorithm.string;

/**
 * 给定字符串以空格分隔，打印单词反转后结果
 * Created by liuzhixiong on 2018/10/18.
 */
public class ReverseString {

    public static void main(String[] args) {
        String str = "i am a good boy";
        String res = reverseString(str);
        System.out.println(res);
    }

    private static String reverseString(String str){
        String[] array = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String temp:array){
            sb.append(reverse(temp) + " ");
        }

        return sb.toString().trim();
    }

    private static String reverse(String temp){
        char[] chararray = temp.toCharArray();
        for(int i=0; i<chararray.length/2; i++){
            char tempchar = chararray[i];
            chararray[i] = chararray[chararray.length-i-1];
            chararray[chararray.length-i-1] = tempchar;
        }
        return new String(chararray);
    }

}
