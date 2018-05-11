package com.lzx.java.jvm.stackoverflow;

/**
 * 栈内存溢出 JVM参数: -Xss2m
 * @author liuzhixiong
 * 2018年04月22日05:01:14
 */


public class JavaVMStackOF_2 {
	public void dontStop(){
		dontStop();
	}
	
	public void stackLeakByThread(){
		while(true){
			Thread thread = new Thread(new Runnable(){
					@Override
					public void run(){
						dontStop();
					}
				}	
			);
			thread.start();
		}
	}
	
	public static void main(String[] args) {
		JavaVMStackOF_2 oom = new JavaVMStackOF_2();
		oom.stackLeakByThread();
	}
}
