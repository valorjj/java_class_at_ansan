package Day13;

public class Thread_b extends Thread {

	public void setThreadName() {
		super.setName("고양이 메소드");

	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println("고양이 소리 ");
		}

	}

}
