package Day15;

public class Station_Time extends Thread {

	static boolean stop = true;

	public static void stop_train(boolean sw) {

		stop = sw;

		if (stop) {
			System.out.println("[열차 이동 가능]");
		} else {
			System.out.println("[열차 통행 중지]");
		}

	}

	@Override
	public void run() {
		// 2초 동안 이동합니다.

		System.out.println("열차가 이동 중 입니다. ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public Station_Time() {
	}

}
