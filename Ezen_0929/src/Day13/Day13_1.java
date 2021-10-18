package Day13;

import java.awt.Toolkit;

public class Day13_1 {

	// 1. CPU : 메모리 (사실상 저장 장치가 없다. 레지스터 명령어 제외하고)
	// 2. 메모리 [주기억장치]

	public static void main(String[] args) {

		// 1. main : 메인 스레드 포함
			// 1. 첫 코드부터 순차적으로 실행
			// 2. return 만나면 실행 종료

		// 2. 멀티스레스 [ 병렬 작업 ]
			// * 운영체제가 스레드에게 자원을 할당 받는다 --> 스케쥴링
			// 스케쥴링을 받아서 스레드가 멀티가 아니라, 순차적으로 처리한다.
	
			// 1. 여러 개 스레드 중 하나라도 남아 있으면 프로세스 종료되지 않음
		
			// 2. 멀티 스레드 구현 방법
		
				// 1. Runnable : 스레드 인터페이스
					// implements Runnable
					// Runnable runnable = new 구현클래스명(); 
					// Thread thread = new Thread(Runnable);
					// Thread.start();
		
				// 2. Thread : 스레드 클래스 
					// 구현클래스명 extends Thread
						// Thread thread = new 구현클래스명();
						// Thread.start();
				
				// 3. 익명 구현 객체 [ 일회성 ]
		
				// 4. 람다식 이용 
		
			// * 인터페이스 : 객체 X, 여러개 상속 가능 , 추상메소드에 대한 구현 필수 

		Toolkit toolkit = Toolkit.getDefaultToolkit();

//		for (int i = 0; i < 5; i++) {
//			toolkit.beep();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println("띵");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

		// p.582 소리와 동시에 출력

		// 인터페이스는 혼자서 할수 있는게 없다
		// 객체를 구현해서 메모리 할당을 받아야 한다.
		Runnable runnable = new BeepTask();
		// 스레드 클래스에 인터페이스 연결
		Thread thread = new Thread(runnable);
		// 스레드 시작
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// p.583 [ 멀티스레드 : 익명 구현 객체 runnable ]
		// 익명 객체 : 인터페이스명 변수명 = new 클래스명 ( new 인터페이스명() { 구현 } );

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		thread2.start();

		Thread thread3 = new BeepThread();
		
		System.out.println(thread3.getName());

		thread3.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
