package Day02;

import java.util.Scanner;

public class Day02_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 문제1 : 급여 명세서
		/*
		 * [조건] 입력받기 : 기본급 , 수당 [출력] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
		 * 
		 */

		System.out.println("급여 명세서");
		System.out.print("기본급을 입력하세요 :");
		int monthylSalary = Integer.parseInt(sc.next());
		System.out.print("수당을 입력하세요 :");
		int allowance = Integer.parseInt(sc.next());
		int total = (int) (monthylSalary + allowance * 0.9);	
		System.out.println("총 급여는 다음과 같습니다. " + total + "원");
//
//		// 문제2 : 지폐 개수 세기
//		/*
//		 * [조건] : 십만원 단위의 금액을 입력 [출력] : 입력받은 금액의 지폐수 세기 [출력 예 ] : 356789 십만원 : 3장 만원 :
//		 * 5장 천원 : 6장 백원 : 7개
//		 */
//
		System.out.println("지폐 갯수 세기");
		System.out.print("전체 금액을 입력하세요. (단위 만원) :");
		// 십만원 만원 백원 4개
		int[] moneyStack = new int[5];
		int totalCash = Integer.parseInt(sc.next());
		int n10 = totalCash / 100000;
		totalCash -= 100000 * n10;
		int n1 = totalCash / 10000;
		totalCash -= 10000 * n1;
		int n1000 = totalCash / 1000;
		totalCash -= 1000 * n1000;
		int n100 = totalCash / 100;
		System.out.println(n10 + " " + n1 + " " + n1000 + " " + n100);
//		
		// 문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
		
		System.out.println("하나의 정수를 입력받아서 7의 배수인치 출력하라 ");
		System.out.print("정수 하나를 입력하세요 -> ");
		int x = Integer.parseInt(sc.next());
		int y = x % 7;
		boolean isRight = y==0 ? true : false;
		System.out.println(isRight);
		
//		boolean isSeven;
//		if(x % 7 == 0) {
//			isSeven = true;
//			System.out.println(isSeven);
//			System.out.println("입력받은 수는 7의 배수입니다. ");
//			
//		} else {
//			isSeven = false;
//			System.out.println(isSeven);
//			System.out.println("입력받은 수는 7의 배수가 아닙니다. ");
//		}

		// 문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
		System.out.println("홀수인지 판별하는 코드입니다. ");

		System.out.print("정수 하나를 입력하세요 -> ");
		int z = Integer.parseInt(sc.next());
		boolean isOdd = (z%2!=0) ? true : false;
		System.out.println(isOdd);

		// 문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		System.out.println("7의 배수이면서 짝수인지 판별하는 코드입니다. ");
		System.out.print("정수 하나를 입력하세요 -> ");
		int w = Integer.parseInt(sc.next());
		boolean isSevenAndEven = ((w%2==0) && (w%7==0)) ? true : false;
		System.out.println(isSevenAndEven);

		// 문제6 : 두개의 정수를 입력받아 더 큰지 출력 [ true , false ]
		
		System.out.println("두개의 수를 입력받아 더 큰수를 출력하는 코드입니다. ");
		System.out.print("정수를 입력하세요 정수1 -> ");
		int s1 = Integer.parseInt(sc.next());
		System.out.print("정수를 입력하세요 정수2 -> ");
		int s2 = Integer.parseInt(sc.next());
		System.out.println("입력받은 수는 각각 " + s1 + " " + s2 + " 입니다. ");
		
		int s3 = s1 > s2 ? s1 : s2;
		System.out.println("더 큰수는 " + s3 + " 입니다. ");

		// 문제7 : 반지름을 입력받아 원 넓이 출력하기
		// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		
		System.out.print("반지름을 입력하세요-> ");
		float radius = Float.parseFloat(sc.next());
		float circleArea =  (float) (radius * radius * 3.14);
		System.out.println("원의 넓이는 다음과 같습니다. : " + circleArea);
		// 문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		// 예) 54.5 84.3 이면 64.285714%
		
		System.out.println("두 실수를 입력받아서 앞실수의 값이 뒷값의 몇 % 인지 출력하는 코드입니다. ");
		System.out.println("실수를 각각 입력하세요. ");
		System.out.print("실수1 -> "); float f1 = Float.parseFloat(sc.next());
		System.out.print("실수2 -> "); float f2 = Float.parseFloat(sc.next());
		float relativePercent = (f1 / f2) * 100;
		System.out.println(relativePercent+"%");

	}

}
