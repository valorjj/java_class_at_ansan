package Day15;

import java.util.HashSet;
import java.util.Iterator;

public class Day15_2 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("java");
		set.add("jdbc");
		set.add("servlet/jsp");
		set.add("java"); // 여기서 중복 발생 
		set.add("ibatis");
		
//		System.out.println(set);
//		System.out.println(set.size());

		// Iterator 인터페이스를 이용한 set 내 객체 호출 [인덱스가 존재하지 않기 때문에]
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		
	}

}
