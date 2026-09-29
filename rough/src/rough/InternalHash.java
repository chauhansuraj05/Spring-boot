package rough;

import java.util.HashMap;

public class InternalHash {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(101, 27);
		map.put(102, 29);
		map.put(103, 105);
		map.put(505, 1);
		map.put(1001, 2);
		
		System.out.println(map);
	}
}
