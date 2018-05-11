package com.lzx.java.jvm.stackoverflow;

/**
 * 栈内存溢出 JVM参数: -Xss512k
 * @author liuzhixiong
 * 2018年04月22日05:01:14
 */


public class JavaVMStackOF {
	private int stackLength = 1;
	public void stackLeak(){
		stackLength ++;
		stackLeak();
	}
	
	public static void main(String[] args) {
		JavaVMStackOF oom = new JavaVMStackOF();
		try{
			oom.stackLeak();
		} catch (Throwable e){
			System.out.println("stack length:" + oom.stackLength);
			throw e;
		}
		
	}
}
