package com.lzx.java.jvm.monitor;

import java.util.ArrayList;
import java.util.List;

/**
 * JConsole之内存监控
 * @author liuzhixiong
 * 2018年04月24日15:56:05
 */

public class JConsole_Memory {

	/*
	 * 内存占位符对象，一个OOMObject大约占64KB
	 */
	static class OOMObject{
		public byte[] placeholder = new byte[64 * 1024];
	}
	
	public static void main(String[] args) throws InterruptedException{
		Thread.sleep(15000);
		fillHeap(1000);
	}
	
	public static void fillHeap(int num) throws InterruptedException{
		List<OOMObject> list = new ArrayList<OOMObject>();
		for(int i=0; i<num; i++){
			//稍作延时，令监视曲线的变化更加明显
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}
}
