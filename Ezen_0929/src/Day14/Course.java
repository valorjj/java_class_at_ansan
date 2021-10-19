package Day14;

public class Course<T> {

	private String name;
	private T[] students;

	// 제네릭 자체적으로 New 연산자 사용 불가 !!!
	// 일단 Object 로 받고, T 로 형변환

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];
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
