package Day12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day12_7 {

	// 로그인 & 회원가입 프로그램 [파일처리]

	// [조건] 회원가입 시 회원정보를 파일에 저장
	// [회원클래스] : 아이디, 비밀번호, 성명, 연락처
	// [조건] 로그인 시, 파일 내 회원정보가 존재하면 로그인 성공

	// 기존 데이터가 사라진다. txt 파일에 저장되어있던 정보를 어떻게 보존할 수 있을까?

	public static Scanner scanner = new Scanner(System.in);

	public static ArrayList<Member> members = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {

		boolean run = true;

		Member member = new Member();

		try {

			while (run) {

				System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료 ");
				int ch = scanner.nextInt();
				switch (ch) {

				case 1:
					member.signup();
					break;

				case 2:
					member.signin();
					break;

				case 3:
					System.out.println("종료");
					run = false;
					break;

				default:

				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
