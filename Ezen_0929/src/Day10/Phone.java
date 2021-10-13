package Day10;

public abstract class Phone {
	// abstract : 추상 클래스 선언

	// 1. 필드
	public String owner;

	// 2. 생성자

	public Phone(String owner) {
	}
	// 3. 메소드

	public void turnOn() {
		System.out.println("핸드폰 전원을 켭니다. ");
	}

	public void turnOff() {
		System.out.println("핸드폰 전원을 끕니다. ");
	}
}
