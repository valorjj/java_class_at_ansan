package Day15;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Day15_pr2 {
	public static void main(String[] args) {
		// 로또 프로그램
		// 6개 입력받아서 set 컬렉션에 저장하여 출력, 중복 X

		HashSet<Integer> hs = new HashSet<Integer>();

		Random random = new Random();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 선택 ");
			int N = scanner.nextInt();

			if (N < 1 || N > 45) {

			} else {

				if (hs.contains(N)) {

				} else {
					hs.add(N);
					System.out.println(hs);
				}
			}

			if (hs.size() == 6) {
				System.out.println(hs);
				break;
			}
		}

	}

}
