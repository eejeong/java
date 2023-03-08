package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
	// 기능 정의 CRUD (Create, Read, Update, Delete) 
	public void insert(V v) throws Exception; // Create
	public void update(V v) throws Exception; 
	public void delete(K k) throws Exception; 
	public V select(K k) throws Exception;    // Read : 특정 ID인 값 리턴
	public List<V> select() throws Exception; // Read : 전체 리스트 리턴
}
