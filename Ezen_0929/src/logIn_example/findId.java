package logIn_example;

import java.util.Scanner;

public class findId extends logInClass {

	Scanner scanner = new Scanner(System.in);

	logInClass c = new logInClass();

	public void find_Id() {

		System.out.println("아이디 찾는 화면임 ");
		user_search();

	}

	@Override
	public void user_search() {

		// 배열에 저장된 아이디를 리턴한다.

		try {
			System.out.print("이름 : ");

			String name = scanner.next();
			name = name.replaceAll("\\s+", "");

			for (int i = 0; i < 3; i++) {

				if (memberList[i] != null && memberList[i].equals(name)) {
					// 해당하는 아이디가 존재한다.
					System.out.println("아이디는 : " + memberList[i].getName());
					break;
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
