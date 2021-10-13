package logIn_example;

import java.util.Scanner;

// 회원가입 
public class signUp extends logInClass {

	logInClass c = new logInClass();
	Scanner scanner = new Scanner(System.in);

	public void signUp() {

		signUp s = new signUp();

		s.user_input();

	}

	@Override
	public void user_input() {
		System.out.println("회원가입 화면입니다. ");

		for (int i = 0; i < 3; i++) {

			try {

				System.out.print("아이디 입력 : ");
				String id = scanner.next();

				c.signUpList_ID[i] = id;

				System.out.print("패스워드 입력 : ");
				String pw = scanner.next();

				c.signUpList_Password[i] = pw;

			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

}
