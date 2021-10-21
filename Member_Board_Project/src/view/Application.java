package view;

import java.util.Scanner;

import controller.MemberController;
import model.Member;

// import 패키지명.클래스명;

public class Application {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		mainmenu();

	}

	public static void mainmenu() {

		while (true) {

			try {

				System.out.println("\n+++++++++++++++++++ 회원 커뮤니티 +++++++++++++++++++++");
				System.out.println("1. 로그인 2. 회원가입 3. 아이디찾기 4. 비밀번호찾기");
				System.out.print("\r" + "선택 : ");
				int ch = scanner.nextInt();
				if (ch == 1) {
					System.out.println("+++++++++++++++++ 로그인 페이지 +++++++++++++++++++");
					System.out.println("id : ");
					String id = scanner.next();
					System.out.println("password : ");
					String password = scanner.next();

					boolean result = MemberController.login(id, password);
					if (result) {
						System.out.println("[알림] 로그인 성공 ");
						membermenu(id); // 회원메뉴 메소드 호출, 로그인 성공한 아이디를 인수로 전달
					} else {
						System.err.println("[알림] 로그인 실패");
					}

				} else if (ch == 2) {
					System.out.println("+++++++++++++++++ 회원가입 페이지 +++++++++++++++++++");
					// * 입력받기 -> 변수 저장 -> 객체 -> 객체가 많네 ? -> 배열 / 컬렉션 이용

					System.out.println("id [4글자이상]");
					String id = scanner.next();
					System.out.println("password [4글자만]");
					String password = scanner.next();
					System.out.println("name [2글자이상]");
					String name = scanner.next();
					System.out.println("email [@형식] : ");
					String email = scanner.next();
					// 4개 변수를 따로따로 저장하면 힘들다.... 객체를 만들어야지

					Member member = new Member(id, password, name, email, 0);

					// Controller 로 전달 [다른 클래스내 메소드를 호출하는 방법
					// 1. static
					// 2. 객체 생성

					boolean result = MemberController.sigup(member);

					if (result) {

						System.out.println("[알림] : 회원가입 성공");

					} else {

						System.out.println("[알림] : 회원가입 실패");

					}

				}

				else if (ch == 3) {
					System.out.println("+++++++++++++++++ 아이디찾기 페이지 +++++++++++++++++++");
					System.out.println("name : ");
					String name = scanner.next();
					System.out.println("email : ");
					String email = scanner.next();

					boolean result = MemberController.forgotid(name, email);
					if (result) {
						System.err.println("[알림] 회원님의 아이디를 메일로 전송하였습니다. ");
					} else {
						System.err.println("[알림] 동일한 회원정보가 없습니다. ");
					}

				} else if (ch == 4) {
					System.out.println("+++++++++++++++++ 비밀번호찾기 페이지 +++++++++++++++++");
					System.out.println("id : ");
					String id = scanner.next();
					System.out.println("email : ");
					String email = scanner.next();

					boolean result = MemberController.forgotpassword(id, email);
					if (result) {
						System.err.println("[알림] 회원님의 비밀번호를 메일로 전송하였습니다. ");
					} else {
						System.err.println("[알림] 동일한 회원정보가 없습니다. ");
					}

				} else {
					System.err.println("[알림] 유효하지 않은 입력입니다. [관리자에게 문의]");

				}
			} catch (Exception e) {
				scanner = new Scanner(System.in); // 입력객체 초기화
				System.err.println("[알림] 유효하지 않은 입력입니다. [관리자에게 문의]");
				// new 사용이유 ??? : 메모리를 초기화한다.
			}

		}

	}

	public static void membermenu(String id) {

	}

	public static void boardmenu(String id) {

	}

}
