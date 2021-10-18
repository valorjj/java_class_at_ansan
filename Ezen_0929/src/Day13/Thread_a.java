package Day13;

public class Thread_a extends Thread {

	public void setThreadName() {
		super.setName("강아지 스레드");

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

			System.out.println("강아지소리 ");

		}

	}

}
