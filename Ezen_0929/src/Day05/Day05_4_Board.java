package Day05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Day05_4_Board {

	public static void main(String[] args) {

		// 문제1: 게시판 만들기
		// 2차원 배열 사용 // 게시물 번호는 인덱스 번호
		// 1. 게시판 [ 제목, 내용, 작성자, 작성날짜, 조회수 ]
		// 예시 메뉴

		// 2. 해당 게시물 번호 선택에서 상세페이지로 이동 시 조회수 +1

		// 2. 메인 메뉴 열기

		// [게시판]

		// 순번 | 제목 | 작성자 | 작성일 | 조회수
		// 1 | 안녕 | ㄴㄴㄴ | 오늘 | 3

		// 선택 : 1. 글쓰기 2.글상세페이지

		// [글쓰기 했을 때]
		// 1. 제목, 내용, 작성자, 작성일 입력받아서 배열에 저장한다.
		// [글상세페이지]
		// 1. 상세페이지를 볼 게시물 번호 선택(index 순서대로)
		// 2. 선택한 게시물의 상세페이지 출력
		// 2. 상세페이지 예시
		// >> 제목 : 안녕
		// >> 작성자 : ㄴㄴㄴ 작성일 : 2021-10-05 : 조회수 : 3
		// >> 내용 : 안녕하세요
		// >> 선택 : 1. 뒤로가기

		// DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();

		Scanner sc = new Scanner(System.in);

		// 작성자, 제목, 내용, 조회수, 날짜, 인덱스

		String[][] board = new String[1000][6];

		String[] userInput = new String[6];

		boolean flag1 = true;
		int idx = 1; // 게시글 인덱스는 1번부터 시작합니다.
		System.out.println("****************************************************************");
		System.out.println("                           [[알림]] 숫자만 입력하세요.    ");
		System.out.println("****************************************************************");

		while (flag1) {

			boolean flag2 = true;

			while (flag2) {
				System.out
						.println("---------------------------------------[게시판]---------------------------------------");

				System.out.printf("%2s \t %10s \t %10s \t %10s \t      %s \n", "순번", "제목", "작성자", "작성일", "조회수");
				for (int i = 0; i < board.length; i++) {
					if (board[i][0] != null) {
						System.out.printf(" %2d \t %10s \t %10s \t     %10s \t %s \n", i, board[i][1], board[i][0],
								board[i][4], board[i][3]);
					}

				}

				System.out.print("1번. 글쓰기 || 2번. 글상세페이지 || 3번. 종료 >>> ");

				int choice = sc.nextInt();

				if (choice == 1 || choice == 2) {
					switch (choice) {
					case 1: // 글쓰기 화면

						System.out.println("글을 작성하는 페이지입니다. ");
						System.out.print("작성자 >>> ");
						String userName = sc.next(); // 게시물 작성자 입력
						System.out.print("제목 >>> ");
						String title = sc.next(); // 게시물 제목 입력
						sc.nextLine();
						System.out.print("내용 입력 >>>");
						String userlog = sc.nextLine(); // 게시물 내용 입력
						String currDate = dateFormat.format(date); // 날짜 저장

						// 작성자, 제목, 내용, 조회수, 날짜, 인덱스
						userInput[0] = userName; // 작성자
						userInput[1] = title; // 제목
						userInput[2] = userlog; // 내용
						userInput[3] = "1"; // 조회수는 1로 초기화
						userInput[4] = currDate; // 현재 날짜
						userInput[5] = Integer.toString(idx); // 순번 (index)

						for (int j = 0; j < 6; j++) {
							board[idx][j] = userInput[j];
						}
						idx++;
						break;

					case 2: // 글 상세페이지 출력화면
						System.out.println("글 상세페이지 출력화면입니다. ");
						System.out.print("몇번째 글을 보시겠습니까 ? >>> ");
						String userSelect = sc.next();
						for (int i = 0; i < board.length; i++) {
							if (board[i][0] != null) {
								if (board[i][5].equals(userSelect)) {
									// 상세페이지 출력한다.
									System.out.println("순번 : " + userInput[5]);
									System.out.println("제목 : " + userInput[1]);
									System.out.println("작성자 : " + userInput[0]);
									System.out.println("내용 : " + userInput[2]);
									System.out.println("작성일 : " + userInput[4]);
									// int + "" => String 으로 바뀐다. 
									int viewCount = Integer.parseInt(board[i][3]);
									
									// board[i][3] = Integer.toString(++viewCount);
									board[i][3] = ++viewCount + "";
									break;
								}
							}
						}
						break;
					case 3:
						System.out.println("프로그램 종료 "); // 프로그램 완전 종료
						flag2 = false;
						flag1 = false;
						break;
					default:
						System.out.println("잘못된 접근입니다. 메인 페이지 출력. ");
						flag2 = false;
					}

				} else {
					System.out.println("잘못된 접근입니다. 메인 페이지 출력. ");
					flag2 = false;
					break;
				}
			}
		}
	}
}
