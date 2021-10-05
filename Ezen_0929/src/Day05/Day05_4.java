package Day05;

import java.util.Scanner;

public class Day05_4 {

	public static void main(String[] args) {

		// pr9.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {

			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("------------------------------------------------------------");

			System.out.print("선택 >>>> ");

			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				System.out.print("학생수를 입력하세요 >>> ");
				studentNum = sc.nextInt(); // 학생수를 입력받는다.
				scores = new int[studentNum]; // 학생수 만큼의 배열을 생성한다.
			} else if (selectNo == 2) {
				for (int j = 0; j < studentNum; j++) {
					System.out.print("점수를 입력하세요 >>> ");
					int score = sc.nextInt();
					for (int i = 0; i < studentNum; i++) {
						if (scores[i] == 0) {
							scores[i] = score;
							break;
						}
					}
				}

			} else if (selectNo == 3) {
				System.out.println("점수 리스트 출력화면입니다. ");
				for (int k : scores) {
					System.out.println("[" + k + "]");
				}
			} else if (selectNo == 4) {
				System.out.println("입력결과입니다. ");
				int max = 0;
				int sum = 0;
				for (int k : scores) {
					sum += k;
					if (k > max)
						max = k;
				}
				System.out.println("최고점수는 " + max + " 입니다. ");
				System.out.println("평균점수는 " + (float) sum / studentNum);
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료 ");

	}
}
