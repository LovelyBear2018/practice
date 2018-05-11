package com.lzx.java.jvm.constantpooloom;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.6之前可以出OutOfMemoryError
 * 常量池溢出 jvm参数: -XX:PermSize=10M -XX:MaxPermSize=10M
 * @author liuzhixiong
 * 2018年04月22日05:13:27
 */

public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		//使用List保存常量池引用，避免Full GC回收常量池行为
		List<String> list = new ArrayList<String>();
		//10MB的PermSize在Integer范围内足够产生OOM
		int i = 0;
		while(true){
			list.add(String.valueOf(i));
		}
	}
}
