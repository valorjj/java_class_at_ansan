package Day14;

import java.util.HashMap;

public class Course<T> {

	private String name;
	private T[] students;

	private HashMap<String, T[]> hashMap;

	public void create_newCourse(HashMap hashMap) {

		this.hashMap = hashMap;

	}

	// 제네릭 자체적으로 New 연산자 사용 불가 !!!
	// 일단 Object 로 받고, T 로 형변환

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];

		HashMap<String, T> hashMap = null;
		hashMap.put(name, (T) students);

		create_newCourse(hashMap);

	}

	public Course() {
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

}
