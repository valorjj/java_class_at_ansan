package Day15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Day15_3 {

	public static void main(String[] args) {

		HashMap<String, Integer> hashmap = new HashMap<>();

		hashmap.put("유재석", 90);
		hashmap.put("강호동", 85);
		hashmap.put("하하", 96);

		System.out.println(hashmap);

		///////////////////////////////////////////
		Set<String> set = hashmap.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(hashmap.get(key));
		}
		///////////////////////////////////////////
		for( String key : hashmap.keySet()) {
			System.out.println(hashmap.get(key));
		}
		
		///////////////////////////////////////////
		Set<Map.Entry<String, Integer>> entryset = hashmap.entrySet();
		
		

	}

}
