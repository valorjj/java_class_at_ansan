package Generic_Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static ArrayList<Course> courseCollection = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Course 객체 생성 -> 이름과 배열크기를 받아서 인스턴스 생성
		Course<Person> generalCourse = new Course<>("[일반 과정]", 10);
		Course<Person> childCourse = new Course<>("[유아 과정]", 10);
		Course<Person> teenCourse = new Course<>("[청소년 과정]", 10);
		/* 코스가 계속해서 추가된다 */

		boolean run = true;

		while (run) {

			try {
				Scanner scanner = new Scanner(System.in);

				System.out.println("1. 명단 등록 | 2. 명단 출력 | 3. 종료 | 4. 코스 추가 : ");
				int ch = scanner.nextInt();

				if (ch == 1) {
					System.out.println("수강생 이름, 나이를 입력하세요. ");
					// 명단 입력
					System.out.print("이름 : ");
					String name = scanner.next();
					System.out.print("나이 : ");
					int age = scanner.nextInt();
					Person person = new Person(name, age);
					if (age < 8 && age > 0) {
						System.out.println("유아 과정 등록진행합니다. ");
						courseCollection.get(0).add(person);

					} else if (age >= 8 && age < 20) {
						System.out.println("청소년 과정 등록진행합니다. ");
						teenCourse.add(person);
					} else if (age > 20) {
						System.out.println("일반 과정 등록진행합니다. ");
						generalCourse.add(person);

					}

				} else if (ch == 2) {
					// 명단 출력
					registerCourse(childCourse);
					registerCourse(teenCourse);
					registerCourse(generalCourse);

				} else if (ch == 3) {
					System.out.println("[프로그램 종료]");
					run = false;
				} else if (ch == 4) {
					Course<Person> course = null;
					createCourse(course);
				}
			} catch (Exception e) {
				System.out.println("[오류발생] 유효하지 않은 입력입니다. " + e);
			}

		}

	}

	public static void registerCourse(Course<?> course) {

		System.out.println(course.getName() + " [수강생] : ");
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < course.getStudents().length; i++) {
			if (course.getStudents()[i] != null) {
				System.out.print((course.getStudents()[i].toString()) + " | ");
			}
		}

		System.out.println();
		System.out.println("---------------------------------------------------");
	}

	public static void createCourse(Course<?> course) {

		Course<Person> c;

		System.out.println("코스 명칭 : ");
		String courseName = sc.next();
		System.out.println("코스 정원 : ");
		int courseCapacity = sc.nextInt();

		c = new Course<Person>(courseName, courseCapacity);

		courseCollection.add(c);

	}

}
