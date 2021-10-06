package test;

import java.util.Scanner;

public class BankApplication {

	private static Account accountList[] = new Account[100]; // 최대 100명까지 회원 정보 저장
	private static Scanner scanner = new Scanner(System.in); // 입력시 스캐너 클래스 호출

	public static void main(String[] args) {

		boolean flag = true; // flag => false 가 되면 loop 가 멈춘다.

		while (flag) {
			// 메인 메뉴 출력
			System.out.print("1. 계좌 생성 || 2. 계좌 목록 확인 || 3. 입금 || 4. 출금 || 5. 계좌 삭제 || 6. 프로그램 종료 : ");
			int userInput = scanner.nextInt(); // 유저 선택 값을 입력받는다.

			if (userInput == 1) { // 1번 선택 => 계좌 생성
				createAccount();
			} else if (userInput == 2) { // 2번 선택 => 저장된 계좌 출력
				accountListPrint();
			} else if (userInput == 3) { // 3번 선택 => 특정 계좌에 입금
				deposit();
			} else if (userInput == 4) { // 4번 선택 => 특정 계좌에서 출금
				withdraw();
			} else if (userInput == 5) { // 5번 선택 => 특정 계좌 삭제
				deleteAccount();
			} else if (userInput == 6) { // 6번 선택 => 프로그램 종료
				System.out.println("프로그램 종료 ");
				flag = false;
			}
		}
	}

	private static void createAccount() { // 유저가 1번 선택시 새로운 계좌를 등록한다.
		// 이름, 계좌번호, 비밀번호, 금액을 입력 받고 Account 클래스에 저장한다.
		System.out.println("계좌등록 화면입니다. ");
		for (int i = 0; i < accountList.length; i++) {
			if (accountList[i] == null) {
				System.out.print("예금주 성함 : ");
				String owner = scanner.next();
				System.out.print("예금계좌 : ");
				String ano = scanner.next();
				System.out.print("비밀번호 : ");
				int password = scanner.nextInt();
				System.out.print("예치금 : ");
				int balance = scanner.nextInt();
				// 입력받은 값을 account 라는 인스턴스에 저장한다.
				Account account = new Account(owner, ano, password, balance);
				accountList[i] = account; // account 인스턴스를 accountList 에 배열로 저장한다.
				break;
			}
		}
	}

	private static void accountListPrint() { // 유저가 2번 선택시, 저장된 리스트를 출력한다.
		System.out.println("현개까지 저장된 계좌를 출력합니다.  ");

		for (int i = 0; i < accountList.length; i++) {
			if (accountList[i] != null) {
				System.out.println("--------------------------------------");
				System.out.println("성함 : " + accountList[i].owner);
				System.out.println("계좌번호 : " + accountList[i].ano);
				System.out.println("잔액 : " + accountList[i].balance);
				System.out.println("--------------------------------------");
			}
		}
	}

	private static Account findAccount(String ano) { // 계좌번호를 입력해 회원이 존재하는지 확인한다.

		Account account = null;

		for (int i = 0; i < accountList.length; i++) {
			if (accountList[i] != null) { // null 값은 제외시킨다.
				if (accountList[i].getAno().equals(ano)) { // 입력된 계좌와 일치할 경우
					account = accountList[i]; 
					break;
				}
			}
		}
		return account; // 해당계좌 리턴
	}

	private static void deposit() { // 유저가 3번 선택 시, 입금과정 진행 

		Account account = null; // null 값으로 초기화된 account 인스턴스를 생성한다. 

		System.out.print("입금할 계좌를 입력하세요 : ");
		String ano = scanner.next();
		if (findAccount(ano) != null) { // account 값이 존재할 때 
			account = findAccount(ano); // account 인스턴스에 findAccount 리턴값을 할당한다. 리턴값은 Account 클래스의 생성자이다. 
			System.out.print("입금할 금액을 입력하세요 : ");
			int balance = scanner.nextInt();
			account.setBalance(account.getBalance() + balance);
			System.out.println("입금 후 잔액은" + account.getBalance() + " 원 입니다. ");
		}

	}

	private static void withdraw() { // 유저가 4번 선택 시 출금과정 진행 
		Account account = null;

		System.out.print("출금할 계좌를 입력하세요 : ");
		String ano = scanner.next();
		if (findAccount(ano) != null) {
			account = findAccount(ano);

			while (true) {
				System.out.print("출금할 금액을 입력하세요 : ");
				int balance = scanner.nextInt();
				if (account.getBalance() < balance) { // 만약 잔액이 부족하면 5번의 기회를 부여한다.
					for (int j = 0; j < 5; j++) {
						System.out.println("계좌의 잔액이 부족합니다. 계좌 잔액은 " + account.getBalance() + "원 입니다. 다시 시도해주세요. "
								+ (j + 1) + "/5 회 시도");
						System.out.print("출금할 금액을 입력하세요 : ");
						int balance2 = scanner.nextInt(); // 새롭게 입력되는 금액을 받아야 하므로 새로운 변수 선언
						if (account.getBalance() > balance2) { // 잔액이 충분하면 그대로 진행
							account.setBalance(account.getBalance() - balance);
							System.out.println("출금 후 잔액은" + account.getBalance() + " 원 입니다. ");
							break;
						}
					} // 5번의 기회에도 금액을 입력하지 않았다면 오류라고 판단하고 초기화면으로 돌아간다.
					System.out.println("초기 화면으로 돌아갑니다. ");
					break;

				} else { // 잔액이 부족하면 그대로 진행
					account.setBalance(account.getBalance() - balance);
					System.out.println("출금 후 잔액은" + account.getBalance() + " 원 입니다. ");
					break;
				}
			}
		}
	}

	private static void deleteAccount() { // 유저가 5번 선택시 계좌를 삭제시킨다. 

		Account account = null;

		// 비밀번호를 입력받아서 계좌 정보를 삭제한다.
		System.out.print("계좌번호 입력 : ");
		String ano = scanner.next();
		account = findAccount(ano);
		if (account != null) {
			System.out.print("비밀번호 입력 : ");
			int password = scanner.nextInt();
			if (account.getPassword() == password) {
				System.out.println("비밀번호 일치. 계좌정보를 삭제합니다. ");
				for (int i = 0; i < accountList.length; i++) {
					if (accountList[i] == account) {
						accountList[i] = null;
					}
				}
			}
		}
	}

}
