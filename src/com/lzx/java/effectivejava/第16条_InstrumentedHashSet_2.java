package com.lzx.java.effectivejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 复合模式 转发类
 * @author liuzhixiong
 * 2018年05月11日10:46:08
 */

public class 第16条_InstrumentedHashSet_2<E> extends ForwardingSet<E> {

	private int addCount = 0;
	
	public 第16条_InstrumentedHashSet_2(Set<E> s){
		super(s);
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
		第16条_InstrumentedHashSet_2<String> s = new 第16条_InstrumentedHashSet_2<String>(new HashSet<String>());
		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(s.getAddCount());
	}
}

class ForwardingSet<E> implements Set<E> {
	private final Set<E> s;
	public ForwardingSet(Set<E> s){
		this.s = s;
	}
	
	@Override
	public void clear(){
		s.clear();
	}
	
	@Override
	public boolean contains(Object o){
		return s.contains(o);
	}
	
	@Override
	public boolean isEmpty(){
		return s.isEmpty();
	}
	
	@Override
	public int size(){
		return s.size();
	}
	
	@Override
	public Iterator<E> iterator(){
		return s.iterator();
	}
	
	@Override
	public boolean add(E o){
		return s.add(o);
	}
	
	@Override
	public boolean remove(Object o){
		return s.remove(o);
	}
	
	@Override
	public boolean containsAll(Collection<?> c){
		return s.containsAll(c);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c){
		return s.addAll(c);
	}
	
	@Override
	public boolean removeAll(Collection<?> c){
		return s.removeAll(c);
	}
	
	@Override
	public boolean retainAll(Collection<?> c){
		return s.retainAll(c);
	}
	
	@Override
	public Object[] toArray(){
		return s.toArray();
	}
	
	@Override
	public <T> T[] toArray(T[] a){
		return s.toArray(a);
	}
	
	@Override
	public boolean equals(Object o){
		return s.equals(o);
	}
	
	@Override
	public int hashCode(){
		return s.hashCode();
	}
	
	@Override
	public String toString(){
		return s.toString();
	}
}
