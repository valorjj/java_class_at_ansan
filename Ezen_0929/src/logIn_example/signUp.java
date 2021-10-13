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

		boolean run = true;
		
		while (run) {

			int i = 0;

			try {

				Member member = null;
				System.out.print("아이디 입력 : ");
				String id = scanner.nextLine();
				id = id.replaceAll("\\s+", "");

				System.out.print("패스워드 입력 : ");
				String pw = scanner.nextLine();
				pw = pw.replaceAll("\\s+", "");

				System.out.print("이름 입력 : ");
				String name = scanner.nextLine();
				name = name.replaceAll("\\s+", "");

				member = new Member(id, pw, name);

				memberList[i++] = member;

				memberList[i++].setId(id);
				memberList[i++].setPw(pw);
				memberList[i++].setName(name);

				// i가 지정한 3을 넘어가면 예외가 발생한다고 생각하고 예외처리 해야함 -- 수정바람 

				break;

			} catch (Exception e) {
				System.out.println("예외발생");
				System.out.println(e);
			} 

		}

	}

}
