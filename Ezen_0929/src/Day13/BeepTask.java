package Day13;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	// 인터페이스 ----> 추상 메소드 존재 !!
	// 해당 메소드를 구현해야한다

	@Override
	public void run() { // 멀티 스레드 시작 메소드 

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep();
		}

	}

}
