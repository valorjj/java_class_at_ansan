package Day15;

import java.util.Iterator;

public class Station_status extends Thread {

	// 열차의 상태를 설정하는 클래스

	public void status_train(Station 역이름) {

		for (Subway s : 역이름.station) {
			System.out.println("[열차명]" + s.train_code + " [상태] " + s.train_status);
		}
	}

	@Override
	public void run() {
		System.out.println("Station_status");
	}

}
