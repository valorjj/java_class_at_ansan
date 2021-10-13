package logIn_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			Scanner scanner = new Scanner(System.in);

			try {
				System.out.println("1. 회원가입 | 2. 로그인 | 3. 아이디 찾기 | 4. 종료 ");

				int number = scanner.nextInt();

				if (number == 1) {
					signUp su = new signUp();
					su.signUp();

				}

				else if (number == 2) {
					signIn si = new signIn();
					si.signIn();
				}

				else if (number == 4) {
					System.out.println("종료");
					run = false;
				} else if (number == 3) {
					findId f = new findId();
					f.find_Id();
				}

				else {
					System.out.println("1부터 3사이의 숫자를 입력해주십시오. ");
				}

			} catch (InputMismatchException e) {
				System.out.println("알수없는 오류 발생. 오류 항목 : " + e);
				System.out.println("1부터 3사이의 숫자를 입력해주십시오. ");
			}
		}

	}

}
