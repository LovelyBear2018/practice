package com.lzx.java.effectivejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * 继承的弊端
 * @author liuzhixiong
 * 2018年05月11日10:24:29
 */

public class 第16条_InstrumentedHashSet_1<E> extends HashSet<E> {

	private static final long serialVersionUID = 1L;

	private int addCount = 0;
	
	public 第16条_InstrumentedHashSet_1(){
	}
	
	public 第16条_InstrumentedHashSet_1(int initCap, float loadFactor){
		super(initCap, loadFactor);
	}
	
	@Override
	public boolean add(E e){
		addCount ++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c){
		addCount += c.size();
		return super.addAll(c);
	}
	
	public int getAddCount(){
		return addCount;
	}
	
	public static void main(String[] args) {
		第16条_InstrumentedHashSet_1<String> s = new 第16条_InstrumentedHashSet_1<String>();
		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(s.getAddCount());
	}
}
