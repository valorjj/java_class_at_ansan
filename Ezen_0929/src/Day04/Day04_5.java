package Day04;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Day04_5 {
	public static void main(String[] args) {
		// 변수 이름이 첫번째 메모리 주소를 가르킨다.
		// 학생 점수관리 프로그램
		Scanner sc = new Scanner(System.in);
		int[] studentList = null;
		float sum = 0;
		int tmp = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		// 등수와 평균을 구한다.
		while (true) {
			System.out.println("1. 학생수 2. 점수입력 3. 분석 4. 종료 입니다. 원하시는 메뉴를 선택하세요 >> ");
			int selectedNumber = sc.nextInt();
			if (selectedNumber == 1) {
				System.out.print("학생 수를 입력하세요 : ");
				int studentNumber = sc.nextInt();
				studentList = new int[studentNumber];
			}
			if (selectedNumber == 2) {
				for (int i = 0; i < studentList.length; i++) {
					System.out.print(i + "번째 학생의 점수를 입력하세요 : ");
					studentList[i] = sc.nextInt();
					sum += studentList[i];
				}
			}
			if (selectedNumber == 3) {
				// 평균 구하고, 내림차순으로 정렬
				System.out.println("평균은 " + (float) (sum / studentList.length));
//				for (int i = 0; i < studentList.length - 1; i++) {
//					for (int j = i + 1; j < studentList.length; j++) {
//						if (studentList[i] < studentList[j]) {
//							tmp = studentList[i];
//							studentList[i] = studentList[j];
//							studentList[j] = tmp;
//						}
//					}
//				}
				
				Arrays.sort(studentList);
				// Collection 쓰려면 ArrayList 여야한다. 

				for (int s : studentList) {
					System.out.println(s);
				}

			}
			if (selectedNumber == 4) {
				System.out.println("프로그램 종료중입니다 ... ");
				break;
			}

		}

	}
}
