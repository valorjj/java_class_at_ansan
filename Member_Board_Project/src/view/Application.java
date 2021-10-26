package view;

import java.util.Scanner;

import controller.BoardController;
import controller.MemberController;
import controller.ReplyController;
import database.File;
import model.Board;
import model.Member;
import model.Reply;

// import 패키지명.클래스명;

public class Application {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		File.fileroad(1);

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

		while (true) {

			try {
				System.out.println("회원 페이지");
				System.out.println("1. 회원정보. 2. 커뮤니티 3. 로그아웃");
				System.out.println("\t 선택 : ");
				int ch = scanner.nextInt();
				if (ch == 1) {
					System.out.println("회원 정보 페이지");
				}
				if (ch == 2) {

					boardmenu(id);

				}
				if (ch == 3) {
					System.out.println("로그아웃 되었습니다. ");
					return;
				}

			} catch (Exception e) {
				System.err.println("[에러] 관리자 문의 ");
				scanner = new Scanner(System.in);
			}
		}

	}

	public static void boardmenu(String id) {

		while (true) {

			try {

				System.out.println("게시판 페이지");
				System.out.println("\n번호\t\t타이틀\t작성자\t작성일\t조회수");
				int i = 1; // for 반복 횟수 => 게시물 번호
				for (Board board : BoardController.boardlist) {

//					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
//					String date = simpleDateFormat.format(board.getDate());
					System.out.println(i++ + "\t" + board.getTitle() + "\t\t" + board.getWriter() + "\t"
							+ board.getDate() + "\t" + board.getView());
				}

				System.out.println("게시판 페이지");
				System.out.println("1. 게시물  등록 . 2. 게시물 상세페이지 3. 뒤로가기");
				System.out.println("\t선택 : ");
				int ch = scanner.nextInt();

				if (ch == 1) {
					scanner.nextLine();
					System.out.println("게시물 등록");

					System.out.println("제목 : ");
					String title = scanner.nextLine();
					System.out.println("내용 : ");
					String contents = scanner.nextLine();
					BoardController.add(new Board(title, contents, id));

				}
				if (ch == 2) {
					System.out.println("게시물 번호 : ");
					int index = scanner.nextInt();
					Board board = BoardController.detail(index - 1);
					if (board == null) {
						System.out.println("알림 : 게시물 번호가 없습니다. ");

					} else {
						System.out.println("----------------------------------------------");

						System.out.println("게시물 상세 ");
						System.out.println("게시물 제목 : " + board.getTitle());
						System.out.println("게시물 내용 : " + board.getContents());
						System.out.println("게시물 작성자 : " + board.getWriter());
						System.out.println("게시물 작성일 : " + board.getDate());
						System.out.println("게시물 조회수 : " + board.getView());
						System.out.println("----------------------------------------------");
						for (Reply reply : board.getReplylist()) {
							System.out.println("작성자\t댓글내용\t\t작성일");
						}
						System.out.println("1. 댓글쓰기 2. 뒤로가기 ");
						int ch2 = scanner.nextInt();
						if (ch == 1) {
							scanner.nextLine();
							System.out.println("내용 : ");
							String contents = scanner.nextLine();
							Reply reply = new Reply(contents, id);

							boolean result = ReplyController.add(index - 1, reply);

							if (result) {
								System.out.println("댓글 등록 성공 ");
							} else {
								System.out.println("댓글 등록 실패");
							}

						} else if (ch == 2) {
							return;
						}

					}

				}
				if (ch == 3) {
					return;
				}

			} catch (Exception e) {
				System.err.println("[에러] 관리자 문의 ");
				scanner = new Scanner(System.in);
			}
		}

	}

}
