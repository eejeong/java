package com.kbstar.frame;

public interface DAO<K,V> {       // key 값과 value
	public void insert(V v);
	public void delete(K k);
	public void update(V v);
}
