package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {

	public static void main(String[] args) {
		
		// 무한루프 while 
		
		
		// 랜덤[난수] 생성 
			// 1. random // Math 클래스
				// Random 객체
					// .nextInt() : int형 표현할 수 있는만큼 난수 생성 
		
		Random random = new Random(); // new 를 이용해서 생성된 객체는 heap 메모리에 저장된다. 
		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("값을 입력하세요. ");
//			int n = sc.nextInt();
//			if(n == -1) {
//				break;
//			} else {
//				System.out.println(random.nextInt(10)); // 0부터 n 전까지 범위의 난수 생성 
//				
//			}
//		}
		
		// 가위바위보
			// 1. 사용자로부터 가위바위보 중 하나를 입력 받기 
			// 2. 컴퓨터는 랜덤으로 가위바위보 중 하나 선택
			// 3. 승리한 플레이어 호출
				// 종료를 눌렀다면 게임 종료 
		
		System.out.println("가위바위보 게임");
		boolean run = true;
		while(run) {
			System.out.println("");
			System.out.println("가위는 '1', 바위는 '2', 보는 '3', 종료는 '-1' 을 입력하세요. "); // 1 < 2, 2 < 3, 3 < 1
			System.out.print("가위바위 보 중 하나를 입력하세요 >");
			int userInput = sc.nextInt();
			int computerInput = random.nextInt(3)+1;
			String[] testcase = { "가위", "바위", "보"};			
			if(userInput == 1) {
				if(computerInput == 2) {
					System.out.println("당신은 " + testcase[userInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터는 " + testcase[computerInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터가 이겼습니다. ");
				} else if (computerInput == 3){
					System.out.println("당신은 " + testcase[userInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터는 " + testcase[computerInput-1] + " 을 냈습니다. ");
					System.out.println("당신이 이겼습니다. ");
				} else {
					System.out.println("당신은 " + testcase[userInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터는 " + testcase[computerInput-1] + " 을 냈습니다. ");
					System.out.println("무승부입니다. ");
				}
				
			} else if (userInput == 2) {
				if(computerInput == 1) {
					System.out.println("당신은 " + testcase[userInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터는 " + testcase[computerInput-1] + " 을 냈습니다. ");
					System.out.println("당신이 이겼습니다. ");
				} else if (computerInput == 2){
					System.out.println("당신은 " + testcase[userInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터는 " + testcase[computerInput-1] + " 을 냈습니다. ");
					System.out.println("무승부입니다. ");
				} else {
					System.out.println("당신은 " + testcase[userInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터는 " + testcase[computerInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터가 이겼습니다. ");
				}
				
			} else if(userInput == 3){
				if(computerInput == 1) {
					System.out.println("당신은 " + testcase[userInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터는 " + testcase[computerInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터가 이겼습니다. ");
				} else if (computerInput == 2){
					System.out.println("당신은 " + testcase[userInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터는 " + computerInput + " 을 냈습니다. ");
					System.out.println("당신이 이겼습니다. ");
				} else {
					System.out.println("당신은 " + testcase[userInput-1] + " 을 냈습니다. ");
					System.out.println("컴퓨터는 " + computerInput + " 을 냈습니다. ");
					System.out.println("무승부입니다. ");
				}
				
			} else if (userInput == -1) {
				run = false;
			}
			
			
		}
	}

}
