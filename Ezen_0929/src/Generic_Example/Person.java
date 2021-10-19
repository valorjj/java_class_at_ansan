package Generic_Example;

public class Person {

	// 객체의 필드 
	
	// 회원의 이름 
	private String name;
	// 회원의 나이 
	private int age;

	// 생성자 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
