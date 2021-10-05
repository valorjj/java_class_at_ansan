package Day05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_5_Board {
	
	// 1. 서로 다른 자료형을 동일한 배열에 저장할 수 없음
		// 서로 다른 자료형을 하나의 자료형으로 묶기 => '클래스' 
	
	// 2. 배열선언과 동시에 메모리 할당 => 프로그램 실행시 메모리 변경 '불가' 

	public static void main(String[] args) {


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

				System.out.print("1번. 글쓰기 || 2번. 글상세페이지 || 3번. 게시물삭제 4. 프로그램 종료 >>> ");
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
						System.out.println("몇번째 게시물을 삭제하시겠습니까 ? ");
						// 배열만으로 게시판을 작성하기에는 많은 문제가 생긴다.
						// 서로 다른 자료형을 담는다거나
						// 게시물을 지울때 어떻게 할래 ? 1번 지우면 나머지 게시판 글들이 한칸씩 당겨져야한다.
						// ArrayList 를 사용해서 
					case 4:
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
