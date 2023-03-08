package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> { 
// int는 key 값으로 선언 불가. Integer로 사용
	
	@Override
	public void insert(ItemDTO v) throws Exception  {
		connect();
		System.out.println(v);
		System.out.println("Inserted...");
		close();
	}

	// int 값을 k값으로 치환하여 출력
	@Override
	public void delete(Integer k) throws Exception {
		connect();
		System.out.println(k);
		System.out.println("Deleted...");	
		close();
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		System.out.println(v);
		System.out.println("Updated...");
	}

}
