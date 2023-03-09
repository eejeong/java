package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		Collection<String> col = map.values();
		System.out.println(col.size());
		System.out.println("----------------------");
		
		for(String data: col) {
			System.out.println(data);
		}
	}

}