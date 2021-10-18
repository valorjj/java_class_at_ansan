package Day13;

import java.util.Scanner;

public class Day13_5 {

	//

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean[] sw = new boolean[] { true, true };

		boolean run = true;


		while (run) {
			System.out.print("1. 음악 재생 | 2. 비디오 재생 : ");
			int ch = scanner.nextInt();
			System.out.println();

			if (ch == 1) {

				MusicPlay musicPlay = new MusicPlay();
				if (sw[0]) {
					musicPlay.musicStop(sw[0]);
					musicPlay.start();
					sw[0] = false;
				} else {
					musicPlay.musicStop(sw[0]);
					sw[0] = true;
				}

			} else if (ch == 2) {
				VideoPlay videoPlay = new VideoPlay();

				if (sw[1]) {
					videoPlay.videoStop(sw[1]);
					videoPlay.start();
					sw[1] = false;

				} else {
					videoPlay.videoStop(sw[1]);
					sw[1] = true;

				}

			}

		}
	}
}
