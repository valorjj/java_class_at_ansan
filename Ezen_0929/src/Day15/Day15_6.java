package Day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day15_6 {

	public static void main(String[] args) {

		HashMap<String, ArrayList<String>> 관리명단 = new HashMap<>();

		ArrayList<String> 의류명단 = new ArrayList<>();
		ArrayList<String> 신발명단 = new ArrayList<>();

		의류명단.add("나이키");
		의류명단.add("아이다스");

		관리명단.put("의류", 의류명단);
		관리명단.put("신발", 신발명단);

		Scanner scanner = new Scanner(System.in);
		
		
		// 여러개의 리스트를 관리 ? 
		// 

		while (true) {

			System.out.println("--- 제품 현황 --- ");

			for (int i = 0; i < 의류명단.size(); i++) {
				System.out.println(관리명단.get("의류").get(i));
			}
			System.out.println("제품 등록 1. 의류 2. 신발 : ");
			int ch = scanner.nextInt();
			if (ch == 1) {
				System.out.println("제품명 : ");
				String item = scanner.next();
				관리명단.get("의류").add(item);
			} else if (ch == 2) {
				System.out.println("제품명 : ");
				String item = scanner.next();
				관리명단.get("신발").add(item);

			}

		}

	}

}
