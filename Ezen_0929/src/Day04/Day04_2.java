package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2 {

	static int human_victoryCount = 0;
	static int computer_victoryCount = 0;
	static int drawCount = 0;
	static float winningRate = 0;
	static int total = 0;

	public static void main(String[] args) {

		Random random = new Random(); // new 를 이용해서 생성된 객체는 heap 메모리에 저장된다.
		Scanner sc = new Scanner(System.in);

		// 가위바위보
		// 1. 사용자로부터 가위바위보 중 하나를 입력 받기
		// 2. 컴퓨터는 랜덤으로 가위바위보 중 하나 선택
		// 3. 승리한 플레이어 호출
		// 종료를 눌렀다면 게임 종료
		
		// 같은 문제를 switch 문으로 풀었습니다. 

		System.out.println("가위바위보 게임");
		boolean run = true;

		long beforeTime = System.currentTimeMillis();
		while (run) {
			System.out.println("");
			System.out.println("가위는 '1', 바위는 '2', 보는 '3', 종료는 '-1' 을 입력하세요. "); // 1 < 2, 2 < 3, 3 < 1
			System.out.print("가위바위 보 중 하나를 입력하세요 >");
			int userInput = sc.nextInt();
			int computerInput = random.nextInt(3) + 1;
			String[] testcase = { "가위", "바위", "보" };

			switch (userInput) { // 1. 사용자의 입력을 받는다.
				case 1: // 2. 사용자 입력이 1일 때
					switch (computerInput) { // 3. 컴퓨터의 입력에 따라 케이스 3가지로 나눈다.
					case 1: // 3. 컴퓨터의 입력이 1인 경우
						System.out.println("당신은 " + testcase[userInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터는 " + testcase[computerInput - 1] + " 을 냈습니다. ");
						System.out.println("무승부입니다. ");
						drawCount++;
						break;
					case 2: // 3. 컴퓨터의 입력이 2인 경우
						System.out.println("당신은 " + testcase[userInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터는 " + testcase[computerInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터가 이겼습니다. ");
						computer_victoryCount++;
						break;
					case 3: // 3. 컴퓨터의 입력이 3인 경우
						System.out.println("당신은 " + testcase[userInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터는 " + testcase[computerInput - 1] + " 을 냈습니다. ");
						System.out.println("당신이 이겼습니다. ");
						human_victoryCount++;
						break;
					}
					break; // 2. 사용자 입력이 1인 경우 종료
	
				case 2: // 2. 사용자 입력이 2인 경우 시작
					switch (computerInput) { // 3. 컴퓨터 입력에 따른 3가지 케이스
					case 1: // 3. computerInput == 1
						System.out.println("당신은 " + testcase[userInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터는 " + testcase[computerInput - 1] + " 을 냈습니다. ");
						System.out.println("당신이 이겼습니다. ");
						human_victoryCount++;
						break;
					case 2: // 3. computerInput == 2
						System.out.println("당신은 " + testcase[userInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터는 " + testcase[computerInput - 1] + " 을 냈습니다. ");
						System.out.println("무승부입니다. ");
						drawCount++;
						break;
					case 3: // 3. computerInput == 3
						System.out.println("당신은 " + testcase[userInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터는 " + testcase[computerInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터가 이겼습니다. ");
						computer_victoryCount++;
						break;
					}
					break; // 2. userInput == 2 case ends
	
				case 3: // 2. userInput == 3 case starts
					switch (computerInput) {
					case 1: // 3. computerInput == 1
						System.out.println("당신은 " + testcase[userInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터는 " + testcase[computerInput - 1] + " 을 냈습니다. ");
						System.out.println("이런 졌네요 ㅜㅜ ");
						computer_victoryCount++;
						break;
	
					case 2: // 3. computerInput == 2
						System.out.println("당신은 " + testcase[userInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터는 " + testcase[computerInput - 1] + " 을 냈습니다. ");
						System.out.println("역시 컴퓨터는 멍청하죠 당신이 이겼어요. ");
						human_victoryCount++;
						break;
					case 3: // 3. computerInput == 3
						System.out.println("당신은 " + testcase[userInput - 1] + " 을 냈습니다. ");
						System.out.println("컴퓨터는 " + testcase[computerInput - 1] + " 을 냈습니다. ");
						System.out.println("무승부입니다. ");
						drawCount++;
						break;
					}
					break; // 2. userInput == 3 case ends
	
				case -1: // when userInput == -1, print result
					System.out.println("게임이 종료됐습니다. ");
					System.out.println("통계를 한번 살펴 볼까요? >>>>>>>>>>");
					total = human_victoryCount + computer_victoryCount + drawCount;
					winningRate = ((float) (human_victoryCount * 1.0 / total * 1.0)) * 100;
					System.out.println("총 게임수는 " + total);
					System.out.println("승리 횟수  " + human_victoryCount);
					System.out.println("패배 횟수 " + computer_victoryCount);
					System.out.println("무승부 횟수 " + drawCount);
					System.out.println("승률은 " + winningRate + "%");
	
					if (human_victoryCount > computer_victoryCount) {
						System.out.println("당신이 승리했습니다 !!");
					} else if (human_victoryCount < computer_victoryCount) {
						System.out.println("컴퓨터가 이겼습니다. ㅜ.ㅜ ");
					} else {
						System.out.println("무승부입니다. ");
					}
	
					run = false;
	
					long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
					long secDiffTime = (afterTime - beforeTime) / 1000; // 두 시간에 차 계산
					System.out.println("시간차이(m) : " + secDiffTime);
	
				default:
					System.out.println("올바른 숫자를 입력하세요. ");
			}

		}
	}

}
