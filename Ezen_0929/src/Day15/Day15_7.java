package Day15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Day15_7 {

	public static void main(String[] args) {

		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(99);
		scores.add(65);
		scores.add(98);
		scores.add(91);
		scores.add(55);
		scores.add(66);
		scores.add(84);

		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());

		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 위 점수 : " + scores.higher(95));
		System.out.println("90점 이거나 바로 아래 점수 " + scores.floor(90));
		System.out.println("85점 이거나 바로 위 점수 : " + scores.ceiling(85));

		while (!scores.isEmpty()) {
			scores.pollFirst(); // 가장 낮은 점수 삭제
			System.out.println("남은 객체 수 : " + scores.size());
		}

		NavigableSet<Integer> decendingSet = scores.descendingSet();
		for (int score : decendingSet) {
			System.out.println(score + " ");
		}

		System.out.println();

		NavigableSet<Integer> ascendingSet = decendingSet.descendingSet();
		for (int score : decendingSet) {
			System.out.println(score + " ");
		}

	}

}
