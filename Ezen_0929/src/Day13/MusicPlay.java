package Day13;

public class MusicPlay extends Thread {

	static boolean stop = true;

	public static void musicStop(boolean sw) {

		stop = sw;

		if (stop) {
			System.out.println(" [음악 재생 중]");
		} else {
			System.out.println(" [음악 재생 종료]");
		}
	}

	public MusicPlay() {
	}

	@Override
	public void run() {
		while (stop) {

			System.out.println("음악이 재생중입니다. ");
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
