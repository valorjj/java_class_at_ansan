package Day14;

import java.util.Arrays;

public class Day14_2 {

	public static void main(String[] args) {

		Course<Person> personCourse = new Course<>("일반인과정", 5);
		// Person 클래스로 배열 생성
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));

		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
//		workerCourse.add(new Person("일반인"));
//		workerCourse.add(new Student("학생"));
		workerCourse.add(new Worker("직장인"));

		// 자식은 부모에게 갈 수 있다
		// 부모는 자식에게 갈 수 없다

		// Worker 는 Person 의 자식이다. 자식에게 Person 은 갈 수 없다.

		Course<Student> studentCourse = new Course<>("학생과정", 5);
//		studentCourse.add(new Person("일반인"));
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));

		Course<HighStudent> HighStudentCourse = new Course<>("고등학생과정", 5);

//		HighStudentCourse.add(new Person("일반인"));
//		HighStudentCourse.add(new Worker("직장인"));
//		HighStudentCourse.add(new Student("학생"));
		HighStudentCourse.add(new HighStudent("고등학생"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(HighStudentCourse);
	}

	
	// ? : 와일드 카드 [ 모든 클래스 대응 ] 
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}

}
