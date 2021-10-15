package Day12;

import java.util.Random;

public class Day12_2 {
	
	public static void main(String[] args) {
		
		// p.531 
		// 문자열 -> 기본타입
			// 1. Integer.parseInt
			// 2. Double.parseDouble
		
		
		// 기본타입 -> 문자열
			// 1. String.valueOf(String "...")
			// 바이트 배열 -> 문자열
			// 2. new 생성자(바이트 배열)
		
		// String a = "1234";
//		int a = 2134;
//		int c = Math.abs(a);
//		
//		System.out.println(String.valueOf(a));
//		String b= String.valueOf(a);
//		
//		System.out.println(b+"1234");
//		
//		System.out.println("반올림 " + Math.round(6.7777));
//		
//		System.out.println("비교 " +Math.min(-3, -3.5555));
//		System.out.println("비교 " +Math.max(-3, -3.5555));
//		
//		System.out.println("가까운 정수의 실수값 " + Math.rint(5.2332));
//		
//		System.out.println("랜덤 " + Math.random());
//		
//		double value = 12.3456;
//		double value2 = Math.round(value * 100);
//		System.out.println(value2 / 100);
		
		int num = (int)( Math.random() * 6 ) + 1;
		
		int[] selectNumber = new int[6];
		
		Random random = new Random();
		
		System.out.println("선택 번호 : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; // -+ 20억 ---> int 가 표현할 수 있는 만큼 난수 
			System.out.print(selectNumber[i] + " ");
		}

		
	}

}
