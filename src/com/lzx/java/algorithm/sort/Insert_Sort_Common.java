package com.lzx.java.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author liuzhixiong
 * 2017年10月25日15:59:40
 */

public class Insert_Sort_Common {
	public static void main(String[] args) {
		int[] array = new int[]{4,5,1,3,2,9,7,8,6,5};
		insertSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void insertSort(int[] array){
		for(int i=2; i<array.length; i++){
			int key = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > key){
				array[j+1] = array[j];
				j --;
			}
			array[j+1] = key;
		}
	}
}
