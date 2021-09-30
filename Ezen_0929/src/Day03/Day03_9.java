package Day03;

import java.util.Scanner;

public class Day03_9 {

	public static void main(String[] args) {
		// ATM 프로그램

		boolean run = true;

		int balance = 1000000; // 예금액

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.println("선택> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("얼마를 넣으시겠습니까 ? > ");
				int money = sc.nextInt();
				balance += money;
				System.out.println("귀하의 잔액은 총 " + balance + " 입니다. ");
			}
			else if (choice == 2) {
				System.out.print("원하시는 출금 액수를 입력하세요> ");
				int withdraw = sc.nextInt();
				if(balance < withdraw) {
					System.out.println("잔액이 부족합니다. 다시 시도해주시길 바랍니다. ");
				} else {
					balance -= withdraw;
				}

				System.out.println("인출되는 금액은 " + withdraw + " 이고, 남은 금액은 " + balance + " 입니다. ");
			}
			else if (choice == 3) {
				System.out.println("귀하의 잔액은 다음과 같습니다. ");
				System.out.println(balance);
			}
			else if (choice == 4) {
				System.out.println("화면을 종료합니다. ");
				run = false;
			} else {
				System.out.println("[경고] 알 수 없는 번호입니다. ");
			}

		}

	}

}
