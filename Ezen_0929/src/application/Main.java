package application;

import java.util.Scanner;

import controller.Customer;
import controller.Manager;
import model.Karaoke_Interface;

public class Main implements Karaoke_Interface {

	public static void main(String[] args) {

		Scanner scanner;

		// 혹시 가능하다면, 노래 출력 중에 종료하는 스레드를 위한 스위치입니다.
		// 현재 코드로는, 가사가 쭉 출력되는 중간에 가사 출력 스레드를 종료할 방법이 없습니다.
		boolean flag = true;
		final int REP = 50;

		while (flag) {
			star_main(REP);
			System.out.println("이젠 노래방에 오신걸 환영합니다");
			star_main(REP);
			System.out.println("| 발라드 | 댄스 | 힙합 |");
			star_main(REP);
			System.out.println("1. 시작 2. 종료");
			star_main(REP);
			System.out.print("선택 : ");
			// 9999 를 입력하면 관리자 모드가 실행됩니다.
			try {

				Customer customer = new Customer();
				Manager manager = new Manager();

				scanner = new Scanner(System.in);
				int ch1 = scanner.nextInt();

				if (ch1 == 1) {
					// 1. 노래 출력하는 메소드를 호출합니다.

					customer.customer_song();

				}

				else if (ch1 == 2) {
					// 3. 프로그램을 종료합니다.
					System.out.println("[알림] 프로그램 종료");
					break;

				} else if (ch1 == 9999) {
					// 3. 관리자 권한을 실행합니다.
					manager.data_input();

				}

			} catch (Exception e) {
				star_main(REP);
				System.out.println("[에러]" + e);
			}

		}

	}

	public static void star_main(int REP) {
		for (int i = 0; i < REP; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	@Override
	public void data_input() {
	}

	@Override
	public void data_print() {
	}

	@Override
	public void data_modify() {
	}

	@Override
	public void data_delete() {

	}

}
