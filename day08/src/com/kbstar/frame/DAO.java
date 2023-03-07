package com.kbstar.frame;

public interface DAO<K,V> {       // key 값과 value
	String IP = "127.0.0.1"; // public static final 생략
	
	public void insert(V v);
	public void delete(K k);
	public abstract void update(V v);
	
	default void connect() {
		System.out.println(IP+"에 접속하였습니다.");
	}	
	default void close() {
		System.out.println(IP+"에 접속을 해제하였습니다.");
	}
}
