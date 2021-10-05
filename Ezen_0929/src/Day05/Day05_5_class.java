package Day05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// class 를 사용해서 조금 더 효율적으로 작성해보자. 
public class Day05_5_class {

	// 1. 서로 다른 자료형을 하나로 묶기
	public static void main(String[] args) {

		// 2. 작성한 클래스로 배열 선언
		Board[] boards = new Board[100];

		Scanner sc = new Scanner(System.in);

		// 작성자, 제목, 내용, 조회수, 날짜, 인덱스

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
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.printf(" %2d \t %10s \t %10s \t     %10s \t %s \n", i, boards[i].title,
								boards[i].writer, boards[i].date, boards[i].count);
					}

				}

				System.out.print("1번. 글쓰기 || 2번. 글상세페이지 || 3번. 게시물삭제 4. 프로그램 종료 >>> ");
				int choice = sc.nextInt();

				if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
					switch (choice) {
					case 1: // 글쓰기 화면

						System.out.println("글을 작성하는 페이지입니다. ");
						System.out.print("작성자 >>> ");
						String writer = sc.next(); // 게시물 작성자 입력
						System.out.print("제목 >>> ");
						String title = sc.next(); // 게시물 제목 입력
						sc.nextLine();
						System.out.print("내용 입력 >>>");
						String content = sc.nextLine(); // 게시물 내용 입력

						DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
						Date date = new Date();
						String currDate = dateFormat.format(date); // 날짜 저장

						for (int i = 1; i < boards.length; i++) {

							if (boards[i] == null) {
								Board board = new Board(); // 새로운 객체를 생성한 뒤에, 새로운 배열에 집어넣는다.
								board.title = title;
								board.contents = content;
								board.date = currDate;
								board.writer = writer;
								board.count = 1;
								boards[i] = board;
								break;
							}

						}
						break;

					case 2: // 글 상세페이지 출력화면
						System.out.print(" >>> 게시물 번호 선택 : ");
						int ch2 = sc.nextInt();
						boards[ch2].count++;
						System.out.println("--------------- 게시물 상세페이지 -----------------");
						System.out.println(" >>> 제목 : " + boards[ch2].title);
						System.out.println(" >>> 작성자 :" + boards[ch2].writer + "\t작성일 : " + boards[ch2].date
								+ "\t조회수 : " + boards[ch2].count);
						System.out.println(" >>> 내용 : " + boards[ch2].contents);
						System.out.println("-----------------------------------------------");
						break;

					case 3:
						System.out.println("몇번째 게시물을 삭제하시겠습니까 ? ");
						break;

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
