package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;
import com.kbstar.frame.MakeMessage;

public class AppItem {

	public static void main(String[] args) {
		Service<Integer, ItemDTO> service = new ItemService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q,i,d,u)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if(cmd.equals("i")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.println("Input price...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input qt...");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
			
			} else if(cmd.equals("d")) {
				System.out.println("Input ID...");
				String id = sc.next();
				       
			} else if(cmd.equals("u")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.println("Input price...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input qt...");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
			}
		}
		sc.close();
	}
}