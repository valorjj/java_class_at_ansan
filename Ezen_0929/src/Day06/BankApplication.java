package Day06;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("--------------------");
		System.out.println("      계좌생성      ");
		System.out.println("--------------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();

		Account account = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("계좌가 생성되었습니다. ");
				break;
			}
		}
	}

	// 계좌 목록 출력
	private static void accountList() {
		System.out.println("--------------------");
		System.out.println("      계좌목록      ");
		System.out.println("--------------------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			System.out.println("계좌번호 : " + accountArray[i].getAno());
			System.out.println("성함 : " + accountArray[i].getOwner());
			System.out.println("잔액 : " + accountArray[i].getBalance());

		}
	}

	private static Account findAccount(String ano) {

		Account account = null;

		for (int j = 0; j < accountArray.length; j++) {
			if (accountArray[j] != null) {
				if (accountArray[j].getAno().equals(ano)) {
					account = accountArray[j];
					break; // 불필요한 반복 X 
				}
			}
		}

		return account;

	}

	private static void deposit() {
		System.out.print("찾을 계좌 번호 입력 ");
		String ano = scanner.next();

		Account account = findAccount(ano);

		System.out.print("예금 금액 입력 ");
		int balance = scanner.nextInt();
		
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다. ");
			return; // 현재 메소드 강제 종료 
		}
		account.setBalance(account.getBalance() + balance);
		
		

	}

	private static void withdraw() {
		System.out.print("찾을 계좌 번호 입력 ");
		String ano = scanner.next();
		
		Account account = findAccount(ano);
		
		System.out.print("출금 금액 입력 ");
		int balance = scanner.nextInt();
		
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다. ");
			return; // 현재 메소드 강제 종료 
		}
		
		if( account.getBalance() < balance) {
			System.out.println("예금액이 요청하신 금액보다 적습니다. ");
			return;
		}
		account.setBalance(account.getBalance() - balance);
	}

}
