package Day15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Day15_8 {

	public static void main(String[] args) {

		// Entry 는 Key 값으로 정렬한다. (뒤에 걸로도 가능한 것 같음. 근데 복잡하나봐)

		TreeMap<Integer, String> scores = new TreeMap<>();

		scores.put(87, "학생1");
		scores.put(85, "학생2");
		scores.put(92, "학생3");
		scores.put(77, "학생4");
		scores.put(98, "학생5");

		// 내림 차순 정렬 - scores.descendingMap() 인터페이스에 연결시킨다.
		NavigableMap<Integer, String> desc = scores.descendingMap();

		// Set<Map.Entry<Integer, String>> set = desc.entrySet();

		for (Map.Entry<Integer, String> entry : desc.entrySet()) {
			// 엔트리 자료형 : 정렬된 엔트리
			System.out.println(entry.getKey() + " - - - " + entry.getValue());
		}

		// 오름 차순 정렬

		NavigableMap<Integer, String> asc = desc.descendingMap();
		for (Map.Entry<Integer, String> entry : asc.entrySet()) {
			System.out.println(entry.getValue() + " - - - " + entry.getKey());
		}
		
		

	}
}
