package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) {
		DAO<String, ItemDTO> itemDao = new ItemDAO();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Input command(q,i,d,u,s,sa)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.print("Bye");
				break;
			} else if(cmd.equals("i")) {
				System.out.print("Input id");
				String id = sc.next();
				System.out.print("Input name");
				String name = sc.next();
				System.out.print("Input price");
				double price = Double.parseDouble(sc.next());
				ItemDTO item = new ItemDTO(id, name, price);
				try {
					itemDao.insert(item);
				} catch (Exception e) {
					System.out.println("id가 존재합니다");
				}
			} else if(cmd.equals("d")) {
				System.out.print("Input id");
				String id = sc.next();
				try {
					itemDao.delete(id);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다");
				}
			} else if(cmd.equals("u")) {
				System.out.print("Input id");
				String id = sc.next();
				System.out.print("Input name");
				String name = sc.next();
				System.out.print("Input price");
				double price = Double.parseDouble(sc.next());
				ItemDTO item = new ItemDTO(id, name, price);
				try {
					itemDao.update(item);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다");
				}
			} else if(cmd.equals("s")) {
				System.out.print("Input id");
				String id = sc.next();
				ItemDTO item = null;
				try {
					item = itemDao.select(id);
					System.out.println(item);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다");
				}
			} else if(cmd.equals("sa")) {
				List<ItemDTO> list = null;
				try {
					list = itemDao.select();
					if(list.size() == 0) {
						System.out.println("조회된 내용이 없습니다.");
					} else if (list.size() != 0) {
						for(ItemDTO u:list) {
							System.out.println(u);}
					}
				} catch (Exception e) {
					System.out.println("조회된 내용이 없습니다.");
				}
			}
		
		} sc.close();
	}

}
