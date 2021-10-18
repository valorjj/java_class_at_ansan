package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {

	// 차량번호를 랜덤으로 0000-9999 사이의 난수 10개 생성
	// 1. 모든 차량을 배열에 저장
	// 2. 차량 끝자리 번호가 홀수 배열
	// 3. 차량 끝자리 번호가 짝수 배열

	public static void main(String[] args) {

		//
		String[] carlist = new String[100];
		String[] carlist_even = new String[100];
		String[] carlist_odd = new String[100];

		Random random = new Random();

		Scanner sc = new Scanner(System.in);

		int count = 0;

		while (count++ < 100) {

			System.out.println("1. 차량 번호 생성 | 2. 종료 ");

			int choice = sc.nextInt();

			if (choice == 1) {

				int rnum = random.nextInt(10000); // 0 - 9999 까지의 랜덤 변수
				// 4자릿수 문자로 변환
				String strnum = String.format("%04d", rnum);
				// String.format (형식, 데이터) : 문자열 형식 메소드
				// 형식 : %d -> 형식대상의 데이터가 정수
				// %4d : 4자리수
				// %04d : 비어있는 자릿수는 0으로 메꿈

				for (int i = 0; i < carlist.length; i++) {
					if (carlist[i] == null) {
						carlist[i] = strnum;

						int typeChange = Integer.parseInt(carlist[i]);
						if (typeChange % 2 == 0) {
							for (int j = 0; j < carlist_even.length; j++) {
								if (carlist_even[j] == null) {
									carlist_even[j] = strnum;
									break;
								}
							}

						} else {

							for (int j = 0; j < carlist_odd.length; j++) {
								if (carlist_odd[j] == null) {
									carlist_odd[j] = strnum;
									break;
								}
							}
						}
						break;
					}
				}

				System.out.println("********************* 현재 주차중인 차량 ***********************");
				for (String s : carlist) {
					if (s != null) {
						System.out.println(s);
					}
				}

				System.out.println("********************* 짝수 번호 차량 ****************************");

				for (String s : carlist_even) {
					if (s != null) {
						System.out.println(s);
					}
				}

				System.out.println("********************* 홀수 번호 차량 ****************************");
				for (String s : carlist_odd) {
					if (s != null) {
						System.out.println(s);
					}
				}

			}
			if (choice == 2) {
				System.out.println("종료 ");
				break;
			}

		}

	}

}
