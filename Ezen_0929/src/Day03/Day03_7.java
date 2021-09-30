package Day03;

import java.util.Scanner;

public class Day03_7 {
	public static void main(String[] args) {
		
		// p.127
		
		// 무한루프로 입력 계속 받기 
		Scanner sc = new Scanner(System.in);
		int keycode = 0;
		boolean run = true;
		
		while(run) {
			System.out.print("숫자를 입력하세요 >>");
			keycode = sc.nextInt();
			
			if(keycode == -1) {
				System.out.println("루프 종료 ");
				
				run = false;
			} else {

				
				System.out.println("현재 입력된 정수는 :" + keycode);
			}
		
			
			
			
		}
	}

}
