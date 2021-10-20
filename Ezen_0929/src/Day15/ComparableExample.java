package Day15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {

		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("사람1", 20));
		treeSet.add(new Person("사람2", 15));
		treeSet.add(new Person("사람3", 29));
		treeSet.add(new Person("사람4", 8));
		treeSet.add(new Person("사람5", 12));
		treeSet.add(new Person("사람6", 27));

		// Set 니까 iterator 를 써야한다.
		// iterator 를 안쓰고는 어떻게 할 수 있을까?

		Iterator<Person> iterator = treeSet.iterator();

		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " - - -  " + person.age);
		}
		
		for(Person person : treeSet) {
			System.out.println(person.name + " / " + person.age);
		}

	}

}
