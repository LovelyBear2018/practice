package com.lzx.java.base.common;

public class HashMapDemo<K, V> {
	int size = 0;
	double loadFactor = 0.75;
	int threshold;
	int modCount;
	static int MAXIMUM_CAPACITY = Integer.MAX_VALUE;
	
	Entry<K, V>[] table = null;
	
	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		int hash;
		
		public Entry(int h, K k, V v, Entry<K, V> n){
			key = k;
			value = v;
			next = n;
			hash = h;
		}
	}
	
	public HashMapDemo(int initialCapacity, float loadFactor){
		if(initialCapacity < 0){
			throw new IllegalArgumentException("Illegal initial capacity:" + initialCapacity);
		}
		
		if(initialCapacity > MAXIMUM_CAPACITY){
			initialCapacity = MAXIMUM_CAPACITY;
		}
		
		if(loadFactor <= 0 || Float.isNaN(loadFactor)){
			throw new IllegalArgumentException("Illegal loadFactor:" + loadFactor);
		}
		
		this.loadFactor = loadFactor;
		threshold = tableSizeFor(initialCapacity);
	}
	
	public V put(K key, V value){
		return putVal(hash(key), key, value);
	}
	
	private V putVal(int hash, K key, V value) {
		if(table == null){
			inflateTable(threshold);
		}
		
		if(key == null){
			return putForNullKey(threshold);
		}

		int i = indexFor(hash, table.length);
		
		for(Entry<K, V> e = table[i]; e != null; e = e.next){
			Object k;
			if(e.hash == hash && ((k = e.key) == key || key.equals(k))){
				V oldValue = e.value;
				e.value = value;
				return oldValue;
			}
		}
		
		modCount ++;
		addEntry(hash, key, value, i);
		return null;
	}

	private void addEntry(int hash, K key, V value, int i) {
		if(size >= threshold && null != table[i]){
			resize(2 * table.length);
			hash = (null != key) ? hash(key): 0;
			i = indexFor(hash, table.length);
		}
		
		createEntry(hash, key, value, i);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void resize(int newCapacity) {
		Entry[] oldTable = table;
		int oldCapacity = oldTable.length;
		if(oldCapacity == MAXIMUM_CAPACITY){
			threshold = Integer.MAX_VALUE;
			return;
		}
		
		Entry<K, V>[] newTable = new Entry[newCapacity];
		transfer();
		table = newTable;
		threshold = (int)Math.min(newCapacity * loadFactor, MAXIMUM_CAPACITY + 1);
	}

	private void transfer() {
		
	}

	private void createEntry(int hash, K key, V value, int i) {
		
	}

	private int indexFor(int hash, int length) {
		return hash & (length - 1);
	}

	private V putForNullKey(int threshold2) {
		return null;
	}

	@SuppressWarnings("unchecked")
	private void inflateTable(int toSize) {
		int capacity = roundUpToPowerOf2(toSize);
		threshold = (int) Math.min(capacity * loadFactor, MAXIMUM_CAPACITY + 1);
		table = new Entry[capacity];
		initHashSeedAsNeeded(capacity);
	}

	private void initHashSeedAsNeeded(int capacity) {
		
	}

	private int roundUpToPowerOf2(int number) {
		return number >= MAXIMUM_CAPACITY ? MAXIMUM_CAPACITY : (number > 1 ? Integer.highestOneBit(number - 1): 1);
	}

	int hash(K key){
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}
	
	 static final int tableSizeFor(int cap) {
	        int n = cap - 1;
	        n |= n >>> 1;
	        n |= n >>> 2;
	        n |= n >>> 4;
	        n |= n >>> 8;
	        n |= n >>> 16;
	        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	 }
}
