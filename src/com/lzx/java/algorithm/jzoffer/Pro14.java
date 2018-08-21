package com.lzx.java.algorithm.jzoffer;

import java.util.Arrays;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 
 * @author liuzhixiong 2018年08月17日10:27:23
 */

public class Pro14 {
	public static void main(String[] args) throws Exception {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		Pro14 test = new Pro14();
		test.order(array);
		System.out.println(Arrays.toString(array));
	}

	public void order(int[] array) {
		int i = 0;
		int j = array.length - 1;
		while(i < j){
			while(array[i] % 2 == 1){
				i ++;
			}
			while(array[j] % 2 == 0){
				j --;
			}
			if(i < j){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
}
