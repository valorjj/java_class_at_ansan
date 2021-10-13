package Day10;

public class SoundableExample {
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	// p.386 확인문제
		// 1. 3 [ 인터페이스는 상수와 메소드만 가진다 ] 
		// 2. 4 [ 구현객체는 인터페이스로 자동 변환 ]
	
	
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	
	

}
