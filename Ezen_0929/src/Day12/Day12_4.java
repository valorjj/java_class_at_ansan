package Day12;

import java.util.Random;

public class Day12_4 {

	// 차량번호를 랜덤으로 0000-9999 사이의 난수 10개 생성
	// 1. 모든 차량을 배열에 저장
	// 2. 차량 끝자리 번호가 홀수 배열
	// 3. 차량 끝자리 번호가 짝수 배열

	public static void main(String[] args) {

		int[] carlist = new int[10];

		int[] carlist_even = new int[10];
		int[] carlist_odd = new int[10];

		Random random = new Random();

		
		// 1. 그냥 하나씩 다 때려박기 
		
		for (int i = 0; i < 10; i++) {
			int a1 = random.nextInt(10);
			int a2 = random.nextInt(10);
			int a3 = random.nextInt(10);
			int a4 = random.nextInt(10);
			int a = a1 * 1000 + a2 * 100 + a3 * 10 + a4;
			carlist[i] = a;
			System.out.println(a);
		}

		// 2. 
		
		int i = 0;
		int j = 0;
		for (int s : carlist) {
			if (s % 2 == 0) {
				System.out.println("짝수배열 차량");
				carlist_even[i++] = s;

			} else {
				System.out.println("홀수배열 차량");
				carlist_odd[j++] = s;
			}

		}

		int count_even = 0;

		for (int k : carlist_even) {
			if (k != 0) {
				System.out.println("뒷자리 짝수 ");
				System.out.println(k);
				count_even++;
			}

		}

		System.out.println("짝수차량 총 " + count_even + " 개");

		int count_odd = 0;
		for (int w : carlist_odd) {
			if (w != 0) {
				System.out.println("뒷자리 홀수 ");
				System.out.println(w);
				count_odd++;
			}

		}

		System.out.println("홀수차량 총 " + count_odd + " 개 ");
		
		

	}

}
