package Day15;

public class Person implements Comparable<Person> {

	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return o.age - this.age;
	}

}
