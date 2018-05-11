package com.lzx.java.jvm.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出 jvm参数: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author liuzhixiong
 *
 */

public class OurOfMemoryError {

	static class HeapOOM{
		
	}
	
	public static void main(String[] args) {
		List<HeapOOM> list = new ArrayList<HeapOOM>();
		
		while(true){
			list.add(new HeapOOM());
		}
	}
}
