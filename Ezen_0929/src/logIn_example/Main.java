package logIn_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			// scanner = a;
			Scanner scanner = new Scanner(System.in);
			
			try {
				System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
				int number = scanner.nextInt();

				if (number == 1) {
					signUp su = new signUp();

					su.signUp();

				}

				if (number == 2) {
					signIn si = new signIn();

					si.signIn();
				}

				if (number == 3) {
					System.out.println("종료");
					run = false;
				}

			} catch (InputMismatchException e) {
				System.out.println(e);
			}
		}

	}

}
