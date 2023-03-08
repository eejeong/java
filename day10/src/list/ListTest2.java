package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// List<Integer> list = new LinkedList<Integer>();
		Random r = new Random();
		
		// 1~10까지의 숫자를 20개 입력한다.
		// 단 while문을 이용한다
		while(list.size() < 20) {
			int num = r.nextInt(10)+1;
			list.add(num);
		}
		// list 정보를 출력하시오
		System.out.println(list.size());
		System.out.println("-----------------------------");
		for(int data:list) {
			System.out.println(data);
			} 
		}
	}


