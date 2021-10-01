package Day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day04_Quiz1 {

	public static void main(String[] args) {

		Random rand = new Random(); // 1. 랜덤숫자를 생성하는 메서드를 불러온다.

		int[] rotNumber = new int[6]; // 2. rotNumber => 로또 번호
		int[] userInput = new int[6]; // 2. 유저가 입력하는 번호가 담기는 배열

		Scanner sc = new Scanner(System.in); // 키보드 입력 

		// 3. 로또 번호 생성 
		for (int i = 0; i < 6; i++) {
			
			Random random2 = new Random();
			int rotNum = random2.nextInt(45) + 1; // 1부터 45까지 숫자를 랜덤하게 생성한다. 
			// 바로 저장하지 않고, 변수를 선언해 저장해둔다. 
			// 제어문을 이용해서 특정 상황에만 배열에 저장되도록 만들어야한다. 
			
			boolean flag = true; // 중복이 있는지 체크하는 변수이다. 
			
			for(int j=0; j<6; j++) { // 배열의 길이가 6
				if(rotNum == rotNumber[j]) { // 생성된 난수가 중복되는 지 검사한다. 
					i--; // 가장 밖에 있는 for 문을 한번 더 돌린다 => 난수를 새롭게 생성한다. 
					flag = false; // 중복 발견 !
					break; // 현재 for 문을 종료시키고, 가장 밖에 있는 for 문을 다시 돈다. 
				}
			}
			if(flag) { // 중복이 아닌 경우에만 로또 배열에 값을 저장한다. 
				rotNumber[i] = rotNum;
			}
		}

		// 사용자로부터 번호를 입력받도록 하자.

		System.out.println("1부터 45까지의 숫자 6개를 입력하세요. ");
		for (int i = 0; i < 6; i++) {
			System.out.print((i + 1) + " 번째 번호를 입력하세요. ");

			int tmp = sc.nextInt();

			if (tmp < 1 || tmp > 45) { // 숫자는 1부터 45까지만 입력받도록 제한해야한다. 
				System.out.print("1부터 45까지의 숫자만 입력하세요. ");
				i--; // i가 증가되지 않도록 => for 문을 다시 돌리기 위함이다. 
				continue;
			}

			boolean flag = true; // 중복이 없다면 true 유지, 중복이 생기면 false

			for (int j = 0; j < 6; j++) {
				if (tmp == userInput[j]) { // 여기가 중복을 거르는 코드 블록 
					System.out.println("선택한 수는 이미 존재합니다. 다시 입력하세요. ");
					i--; 
					flag = false; // 중복 발견 ! 
					break;
				}
			}

			if(flag) { // true 인 경우, 즉 중복이 없을 경우에만 : 스위치를 하나 만드는 것 
				userInput[i] = tmp;
			}
			

		}

		// 6. 두 배열 내 같은 숫자가 몇개가 있는지 확인한다.
		int count = 0;

		// 7. 배열의 정렬 => 
		Arrays.sort(rotNumber);
		Arrays.sort(userInput);

		// 8. 사용자 입력값과 비교한다.

		for (int u1 : rotNumber) {
			for (int u2 : userInput) {
				if (u1 == u2)
					count++;
			}
		}
		// 9. 결과 출력 
		System.out.println("--------------------------------------");
		System.out.println("로또 번호는 다음과 같습니다. ");
		System.out.print(">>>>>> ");
		for(int value1 : rotNumber) {
			System.out.print(value1 + " ");
		}
		
		
		System.out.println("\n선택한 숫자는 다음과 같습니다. ");
		System.out.print(">>>>>> ");
		for(int value2 : userInput) {
			System.out.print(value2 + " ");
		}
		
		System.out.println("\n중복되는 숫자는 \"" + count + "\" 개 입니다.");
		if (count == 6) {
			System.out.println("1등입니다. ");
		} else if (count == 5) {
			System.out.println("2등입니다. ");
		} else if (count == 4) {
			System.out.println("3등입니다. ");
		} else if (count == 3) {
			System.out.println("4등입니다. ");
		} else {
			System.out.println("꽝입니다. ");
		}

	}

}
