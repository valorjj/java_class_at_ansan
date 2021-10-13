package logIn_example;

import java.util.Scanner;

// 로그인

public class signIn extends logInClass {

	logInClass c = new logInClass();
	Scanner scanner = new Scanner(System.in);

	public void signIn() {

		signIn s = new signIn();

		s.user_input();

	}

	@Override
	public void user_input() {
		System.out.println("로그인 화면입니다. ");

		for (int i = 0; i < 3; i++) {

			try {
				System.out.print("아이디 입력 : ");
				String id = scanner.next();

				if (c.signUpList_ID[i] != null && id.equals(c.signUpList_ID[i])) {
					System.out.print("패스워드 입력 : ");
					String pw = scanner.next();

					if (c.signUpList_Password[i] != null && pw.equals(c.signUpList_Password[i])) {
						System.out.println("로그인 완료 ");
					}
					break;
				} else {
					System.out.println("아이디가 없어요 ");
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

}
