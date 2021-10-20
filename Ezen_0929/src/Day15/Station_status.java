package Day15;

import java.util.Iterator;

public class Station_status extends Thread {

	// 열차의 상태를 설정하는 클래스

	public void status_train(Station 역이름) {

		Iterator iter = 역이름.station.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
	}

	@Override
	public void run() {
		System.out.println("Station_status");
	}

}
