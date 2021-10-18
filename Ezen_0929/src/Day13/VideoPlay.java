package Day13;

public class VideoPlay extends Thread {

	static boolean stop = true;

	public static void videoStop(boolean sw) {
		stop = sw;
		if (stop) {
			System.out.println(" [비디오 재생 중]");
		} else {
			System.out.println(" [비디오 재생 종료]");
		}
	}

	public VideoPlay() {

	}

	@Override
	public void run() {
		while (stop) {

			System.out.println("비디오 재생중입니다. ");
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
