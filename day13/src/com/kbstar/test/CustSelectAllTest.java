package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustSelectAllTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
		List<Cust> list = null;
		try {
			list = crudService.get();
			for(Cust obj: list) {
				System.out.println(obj);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
