package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<String, ItemDTO>{

	HashMap<String, ItemDTO> itemdb = null;
	
	public ItemDAO() {
		itemdb = new HashMap<>();
	}

	@Override
	public void insert(ItemDTO v) throws Exception {
		if(itemdb.containsKey(v.getId())) {
			throw new Exception();
		}
		itemdb.put(v.getId(), v);
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(!itemdb.containsKey(v.getId())) {
			throw new Exception();
		}
		itemdb.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!itemdb.containsKey(k)) {
			throw new Exception();
		}
		itemdb.remove(k);
	}

	@Override
	public ItemDTO select(String k) throws Exception {
		ItemDTO item = null;
		item = itemdb.get(k);
		return item;
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		Collection<ItemDTO> col = itemdb.values();
		for(ItemDTO u:col) {
			list.add(u);
		}
		return list;
	}
}
