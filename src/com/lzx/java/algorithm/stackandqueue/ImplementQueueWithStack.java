package com.lzx.java.algorithm.stackandqueue;

import java.util.Stack;

/**
 * 两个栈实现一个队列
 * @author liuzhixiong
 * 2018年06月26日18:56:25
 */

public class ImplementQueueWithStack<T> {
	
	private Stack<T> stack1 = new Stack<T>();
	private Stack<T> stack2 = new Stack<T>();
	
	
	public static void main(String[] args) {
		ImplementQueueWithStack<Integer> iqws = new ImplementQueueWithStack<Integer>();
		
		iqws.push(1);
		iqws.push(2);
		iqws.push(3);
		iqws.push(4);
		
		System.out.println(iqws.pop());
		System.out.println(iqws.pop());
	}
	
	public boolean push(T ele){
		stack1.push(ele);
		return true;
	}
	
	public int size(){
		return stack1.size() + stack2.size();
	}
	
	public T pop(){
		
		if(size() != 0){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			
			T ele = stack2.pop();
			
			while(!stack2.isEmpty()){
				stack1.push(stack2.pop());
			}
			return ele;
		} else {
			return null;
		}
	}
}
