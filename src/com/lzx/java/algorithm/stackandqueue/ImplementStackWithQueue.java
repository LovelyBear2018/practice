package com.lzx.java.algorithm.stackandqueue;

import java.util.LinkedList;

/**
 * 两个队列实现一个栈
 * @author liuzhixiong
 * 2018年06月26日18:56:25
 */

public class ImplementStackWithQueue<T> {
	
	private LinkedList<T> queue1 = new LinkedList<T>();
	private LinkedList<T> queue2 = new LinkedList<T>();
	
	
	public static void main(String[] args) {
		ImplementStackWithQueue<Integer> iqws = new ImplementStackWithQueue<Integer>();
		
		iqws.push(1);
		iqws.push(2);
		iqws.push(3);
		iqws.push(4);
		
		System.out.println(iqws.pop());
		System.out.println(iqws.pop());
	}
	
	public boolean push(T ele){
		queue1.add(ele);
		return true;
	}
	
	public int size(){
		return queue1.size() + queue2.size();
	}
	
	public T pop(){
		
		if(size() > 0){
			while(queue1.size() != 1){
				queue2.add(queue1.pollFirst());
			}
			
			T ele = queue1.pollFirst();
			
			while(!queue2.isEmpty()){
				queue1.add(queue2.pollFirst());
			}
			return ele;
		} else {
			return null;
		}
	}
}
