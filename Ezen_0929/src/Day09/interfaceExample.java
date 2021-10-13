package Day09;


public class interfaceExample {

	// 자식이 부모가 있는 자리로 가서 형변환 가능
	// 부모가 자식이 있는 자리로 가서 형변환은 불가능 !

	public static void main(String[] args) {

//		Car car = new Car();
//		
//		for(int i=1; i<=5; i++) {
//			int problemLocation = car.run();
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞 왼쪽 HanKookTire로 교체");
//				car.frontLestTire = new HanKookTire("앞왼쪽", 15);
//				break;
//			case 2:
//				System.out.println("앞 오른쪽 KumhoTire로 교체");
//				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
//				break;
//			case 3:
//				System.out.println("뒤 왼쪽 HanKookTire로 교체");
//				car.backLeftTire = new HanKookTire("뒤왼쪽", 12);
//				break;
//			case 4:
//				System.out.println("뒤 오른쪽 KumhoTire로 교체");
//				car.backRightTire = new KumhoTire("뒤오른쪽", 11);
//				break;
//			}
//			
//			System.out.println("--------------------------------------");
//		}

		// 1. 인터페이스 : RemoteControl
		// 2. 클래스 설계 : Television implements RemoteControl
		// 3. 클래스 설계 : Audio implements RemoteControl
		// -------------------------------------------------------------------------------------
		// 1. 메모리 할당 [X]
		// 1. 인터페이스는 혼자서 객체 할당 할 수 없다. 객체 할당 X

		// 인터페이스 사용
		// 1. 인터페이스 인터페이스이름 = new 클래스();
		// 2. 익명 구현 개체
		// 인퍼페이스 인터페이스명 = new 인터페이스명(){
		// 추상메소드 오버라이딩
		// }
		RemoteControl rc;

		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(20);
		
		// p.360 디폴트 메소드 재정의 
		rc.setMute(true);
		
		
		// p.362 정적 메소드 사용 
		RemoteControl.changeBattery(); // static 이라서 객체가 없어도 (메모리가 없어도 이미 static 에서 메모리 할당을 받았기 때문에) 사용가능하다. 

		// 익명 구현 개체를 왜 사용하는가 ? : 일회성 코드 !!
		
		RemoteControl rc2 = new RemoteControl() {
			@Override
			public void turnOn() {

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub

			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub

			}

		};

	}

}
