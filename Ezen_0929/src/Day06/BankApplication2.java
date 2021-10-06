package Day06;

import java.util.Scanner;

public class BankApplication2 {

	private static Account2 accountList[] = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean flag = true;

		while (flag) {
			System.out.print("메뉴 선택 : ");
			int userSelect = scanner.nextInt();
			if (userSelect == 1) {
				createAccount();
			} else if (userSelect == 2) {
				accountList();
			} else if (userSelect == 3) {
				deposit();
			} else if (userSelect == 4) {
				withdraw();
			} else if (userSelect == 5) {
				System.out.println("프로그램 종료 ");
				flag = false;
			}

		}

	}

	private static void createAccount() {

		System.out.println("계정 생성 화면입니다. ");
		System.out.println("성함 : ");
		String owner = scanner.next();
		System.out.println("계좌 번호 : ");
		String ano = scanner.next();
		System.out.print("초기 예치금액 : ");
		int balance = scanner.nextInt();

		Account2 account = new Account2(ano, owner, balance);

		for (int i = 0; i < accountList.length; i++) {
			if (accountList[i] == null) {
				accountList[i] = account;
			}
		}

	}

	private static void accountList() {

		for (int j = 0; j < accountList.length; j++) {
			if (accountList[j] == null)
				break;
			System.out.println(accountList[j].getOwner());
			System.out.println(accountList[j].getOwner());
			System.out.println(accountList[j].getOwner());
		}
	}

	private static Account2 findAccount(String ano) {
		Account2 account = null;

		for (int i = 0; i < accountList.length; i++) {
			if (accountList[i] != null) {
				if (accountList[i].getAno().equals(ano)) {
					// 계좌가 일치하는 경우
					account = accountList[i];
					break;
				}
			}
		}
		
		return account;

	}
	
	private static void deposit() {
		
	}
	
	private static void withdraw() {
		
	}

}
