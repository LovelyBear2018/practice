package com.lzx.java.algorithm.jzoffer;

import java.util.Stack;

/**
 * 两个栈实现一个队列
 * @author liuzhixiong 
 * 2018年08月17日10:27:23
 */

public class Pro9 {
	
	Stack<Integer> stackMain = new Stack<Integer>();
	Stack<Integer> stackSub = new Stack<Integer>();
	
	public static void main (String args[]) {
		Pro9 pro7 = new Pro9();
		pro7.push(1);
		pro7.push(2);
		System.out.println(pro7.pop());
		
	}
	
	public Integer push(int val){
		if(stackMain.isEmpty()){
			stacSub2StackMain();
		}
		
		stackMain.push(val);
		return val;
	}
	
	public Integer pop(){
		
		if(size() != 0){
			if(stackSub.isEmpty()){
				stackMain2stackSub();
			}
			return stackSub.pop();
		}else{
			return -1;
		}
	}
	
	public Integer peek(){
		if(size() != 0){
			if(stackSub.isEmpty()){
				stackMain2stackSub();
			}
			return stackSub.peek();
		}else{
			return -1;
		}
	}
	
	public int size(){
		return stackMain.size() + stackSub.size();
	}
	
	public void stacSub2StackMain(){
		while(!stackSub.isEmpty()){
			stackMain.add(stackSub.pop());
		}
	}
	
	public void stackMain2stackSub(){
		while(!stackMain.isEmpty()){
			stackSub.add(stackMain.pop());
		}
	}
}
