package Day07;

import Day06.Car; // 패키지명.클래스 

public class Day07_1 {

	// 클래스
	// 1. 필드 2. 생성자 3. 메소드

	public static void main(String[] args) {

		// p.238

		double result = 10 * 10 * Calculator.pi;

		// 해당 클래스의 멤버 접근 방법
		// 1. 객체 생성 [ 해당 클래스로부터 메모리 할당 ]
		// 2. static [ 정적변수 ] : 프로그램 시작 시 메모리 할당

		Person person1 = new Person("1234-1234", "AAA");

		System.out.println(person1.nation + " " + person1.ssn + " " + person1.name);

		// [final] 접근제한자가 붙으면 수정이 불가능하다.
		/*
		 * person1.nation = "usa"; person1.name = "BBB"; person1.ssn = "2345-2345";
		 */
		
		// 상속을 받으면 접근할 수 있다.
		
		
		

	}

}
