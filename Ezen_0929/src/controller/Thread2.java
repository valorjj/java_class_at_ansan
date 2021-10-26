package controller;

import java.util.Scanner;

public class Thread2 extends Thread {

	public boolean stop;
	public boolean work = true;

	Scanner scanner = new Scanner(System.in);

	public void stopThread() {
		stop = true;
	}

	@Override
	public void run() {

		System.out.println("[알림] 10초내에 입력하세요");
		Thread1 thread1 = new Thread1();
		Thread thread = new Thread(thread1);
		thread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		while (!stop) {

			try {
				// 실제 기계로 대입해보면 물리적인 버튼 입력이기 때문에 출력되지 않는 부분
				// 현재 콘솔 프로젝트이기 때문에 안내를 위해 출력합니다.
				System.out.println("-------------------- Thread 2 ----------------------");
				System.out.println("1. 일시 정지 2. 재생 3. 강제종료 ");
				System.out.println("----------------------------------------------------");

				int ch = scanner.nextInt();

				if (ch == 1) {
					System.out.println("[스레드1] 일시정지 ");
					thread1.work = false;
				}

				else if (ch == 2) {
					System.out.println("[스레드1] 재생 ");
					thread1.work = true;
				}

				else if (ch == 3) {
					System.out.println("[스레드1] 종료 ");
					thread1.work = false;
					thread1.stop = true;
					stop = true;
					return;

				}

				Thread.sleep(100);

			} catch (Exception e) {
				scanner = new Scanner(System.in);
				System.err.println("[알림] 유효한 입력이 아닙니다. " + e);

			}

		}

	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

	public Thread2() {
	}

}
