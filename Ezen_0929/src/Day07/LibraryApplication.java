package Day07;

import java.util.Scanner;

public class LibraryApplication {

	// 조건1 : 객체지향 [ 회원 클래스, 도서 클래스 ]
	// 설계 : 필드, 생성자, 메소드
	// 조건2 : 객체는 배열에 저장
	// 조건3 : 회원만 프로그램 이용
	// 회원기능 : 로그인, 회원가입, 대여, 반납
	// 조건4 : 관리자[ID : admin pw : 1234]만 도서 등록 가능
	// 조건5 :

	protected static Scanner scanner = new Scanner(System.in);
	protected static Member[] members = new Member[100];
	protected static Books[] books = new Books[100];

	public static void main(String[] args) {

		System.out.println("도서 대여 프로그램 입니다. ");
		main_menu();

	}

	public static void main_menu() {

		while (true) {
			System.out.println("-------------로그인 페이지-------------------");
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 아이디찾기 | 4. 비밀번호찾기");
			System.out.print("선택 >>> ");
			int ch = scanner.nextInt();
			if (ch == 1) {
				// 로그인 메소드 호출
				String loginId = Member.logIn();
				// static 으로 하게되면 문제가
				// 
				// 1. 로그인 실패
				if (loginId == null) {
					System.out.println("동일한 회원정보가 없습니다. ");
				}
				// 2. 관리자 메뉴
				else if (loginId.equals("admin")) {
					admin_menu();
				}
				// 3. 일반회원 메뉴
				else {
					member_menu(loginId);
				}
			}
			if (ch == 2) {
				// 회원가입 메소드 호출
				// 1. 다른 클래스 메소드 호출 방법
				// 1. 객체 생성 후 객체로부터 멤버 접근
				// 2. 해당 메소드 static
				Member.signup();

			}
			if (ch == 3) {
				// 아이디 찾기 메소드 호출
				String searchId = Member.searchId();
				if (searchId == null) {
					System.out.println("입력한 아이디를 찾을 수 없습니다. ");
				} else {
					System.out.println(" 회원님의 아이디는 [ " + searchId + " ] 입니다. ");
				}
			}
			if (ch == 4) {
				// 비밀번호 찾기 메소드 호출
				String searchPassword = Member.searchPassword();
				if (searchPassword == null) {
					System.out.println("입력한 아이디를 찾을 수 없습니다. ");
				} else {
					System.out.println(" 회원님의 비밀번호는 [ " + searchPassword + " ] 입니다. ");
				}
			}
		}

	}

	public static void admin_menu() {
		Books book = new Books();

		while (true) {
			System.out.println("------ 관리자 메뉴 ------");
			System.out.print("1. 도서등록 | 2. 도서목록 | 3. 종료 : ");
			int adminSelect = scanner.nextInt();

			if (adminSelect == 1) {
				System.out.println("도서등록 ");
				// ISBN, 도서명, 대여여부, 대여한 회원 아이디
				book.book_add();

			}
			if (adminSelect == 2) {
				System.out.println("도서목록 ");
				book.book_list();
			}
			if (adminSelect == 3) {
				System.out.println("현재 화면 종료 ");
				return;
			}
		}

	}

	public static void member_menu(String loginId) {
		Books book = new Books();
		System.out.println("------ 메뉴 -------");
		System.out.print("1. 대여 | 2. 반납 3. 대출목록 | 4. 로그아웃 : ");
		int userSelect = scanner.nextInt();
		while (true) {
			// static 을 안쓰려면 Book 클래스의 인스턴스를 만든다.

			if (userSelect == 1) {
				System.out.println("도서 대여 ");
				book.book_rental(loginId);
			}
			if (userSelect == 2) {
				System.out.println("도서 반납 ");
				book.book_return(loginId);
			}
			if (userSelect == 3) {
				System.out.println("대출 도서 목록  ");
				book.book_list();
				break;
			}
			if (userSelect == 4) {
				System.out.println("로그아웃 ");
				break;
			}
		}

	}

}
