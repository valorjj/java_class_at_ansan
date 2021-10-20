package Day15;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {

		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("딸기", 5000));
		treeSet.add(new Fruit("사과", 2500));
		treeSet.add(new Fruit("배", 6000));

		for (Fruit fruit : treeSet) {
			System.out.println("과일 이름 : " + fruit.name + " 과일 가격 " + fruit.price);
		}

	}

}
