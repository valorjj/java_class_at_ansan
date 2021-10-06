package Day06;

public class Day06_1 {
	// p.195
		// 1. 객체 만들기 : 클래스 이용한 메모리 할당
	public static void main(String[] args) {
		Student student1 = new Student();
		// student1 => heap 영역에 메모리를 가리킨다. 
		Student student2 = new Student();
		
		
		// 근데 주소값 - 실제값은 어떤 관계지?
		// jvm 안에서 가상의 영역인건가? heap / stack 
		
		Car car1 = new Car();
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		System.out.println(car1.speed);
		
		// 객체 값 변경
		
		car1.speed = 60;
		System.out.println(car1.speed);
		
		// Car2 car2 = new Car2("black", 3000); // 왜 오류?
		
		Korean korean = new Korean("java", "494949-49494949");
		
		System.out.println(korean.name);
		System.out.println(korean.ssn);
		
		
		
		
	}
}
