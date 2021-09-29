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
		System.out.println("십만원지폐 : " + n10 + " 만원지폐 : " + n1 + " 천원지폐 : " + n1000 + " 백원동전 : " + n100);
//		
		// 문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]

		System.out.println("하나의 정수를 입력받아서 7의 배수인치 출력하라 ");
		System.out.print("정수 하나를 입력하세요 -> ");
		int x = Integer.parseInt(sc.next());
		int y = x % 7;
		boolean isRight = y == 0 ? true : false;
		System.out.println(isRight);

		// 문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
		System.out.println("홀수인지 판별하는 코드입니다. ");

		System.out.print("정수 하나를 입력하세요 -> ");
		int z = Integer.parseInt(sc.next());
		boolean isOdd = (z % 2 != 0) ? true : false;
		System.out.println(isOdd);

		// 문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		System.out.println("7의 배수이면서 짝수인지 판별하는 코드입니다. ");
		System.out.print("정수 하나를 입력하세요 -> ");
		int w = Integer.parseInt(sc.next());
		boolean isSevenAndEven = ((w % 2 == 0) && (w % 7 == 0)) ? true : false;
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
		float circleArea = (float) (radius * radius * 3.14);
		System.out.println("원의 넓이는 다음과 같습니다. : " + circleArea);
		// 문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		// 예) 54.5 84.3 이면 64.285714%

		System.out.println("두 실수를 입력받아서 앞실수의 값이 뒷값의 몇 % 인지 출력하는 코드입니다. ");
		System.out.println("실수를 각각 입력하세요. ");
		System.out.print("실수1 -> ");
		float f1 = Float.parseFloat(sc.next());
		System.out.print("실수2 -> ");
		float f2 = Float.parseFloat(sc.next());
		double relativePercent = (f1 / f2) * 100;
		
		System.out.println(relativePercent + "%");
		String result = String.format("%.2f", relativePercent);
		System.out.println(result + "%");
		System.out.printf("%.3f%%", relativePercent);
		System.out.println("\n");
		System.out.println(Math.round(relativePercent * 100) / 100.0);

		// 문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
		// 사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2

		System.out.println("사다리꼴 넓이 구하는 코드입니다. ");
		System.out.println("윗변, 밑변과 높이를 입력하세요. ");
		System.out.print("윗변 길이 -> ");
		int l1 = sc.nextInt();
		System.out.print("밑변 길이 -> ");
		int l2 = sc.nextInt();
		System.out.print("높이 -> ");
		int h1 = sc.nextInt();
		float trapizodeArea = (l1 + l2) * h1 / 2;
		System.out.println("사다리꼴 넓이 : " + trapizodeArea);

		// 문제10: 키를 정수를 입력받아 표준체중 출력하기
		// 표준체중 계산식 = > (키 - 100) * 0.9

		System.out.println("키를 입력받아 표준체중을 구하는 코드입니다. ");
		System.out.print("키를 정수로 입력하세요 -> ");
		int height = sc.nextInt();
		float averageWeight = (float) ((height - 100) * 0.9);
		System.out.println("표준 체중은 " + averageWeight + " 입니다. ");

//		// 문제11: 키와 몸무게를 입력받아 BMI 출력하기
//		// BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

		System.out.println("키와 몸무게를 입력하세요. ");
		System.out.print("키를 입력하세요 -> ");
		double height2 = sc.nextDouble();
		System.out.print("몸무게를 입력하세요 -> ");
		double weight2 = sc.nextDouble();
		double bmiStat = weight2 / ((height2 / 100) * (height2 / 100));
		System.out.println("bmi 지수는 다음과 같습니다. " + "BMI : " + String.format("%.2f", bmiStat));

//		// 문제12: inch 를 입력받아 cm 로 변환하기

		System.out.println("inch 를 cm 로 변환합니다. ");
		System.out.print("inch 를 입력하세요 -> ");
		float inch = sc.nextFloat();
		inch = (float) (inch / 2.54);
		System.out.println(String.format("%.3f", inch) + " 인치 입니다. ");

//		// 문제13: 중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
//		// 소수 둘째 자리 까지 점수 출력하기
//		// 중간고사 반영비율 => 30 %
//		// 기말고사 반영비율 => 30 %
//		// 수행평가 반영비율 => 40 %
		
		System.out.println("시험점수 반영 비율 계산하기 ");
		System.out.println("소수 둘째짜리 수 까지 출력하시오. ");
		System.out.print("중간고사 점수를 입력하시오 -> "); float midTerm = sc.nextFloat();
		System.out.println("기말고사 점수를 입력하시오 -> "); float finalTerm = sc.nextFloat();
		System.out.println("수행평가 점수를 입력하시오 ->"); float extraScore = sc.nextFloat();
		float totalScore = (float) ((midTerm*0.3) + (finalTerm * 0.3) + (extraScore * 0.4));
		System.out.println("반영 비율 별 점수는 다음과 같습니다. " + String.format("%.2f", totalScore));
		

		// 문제14 : 연산 순서 나열 하고 x와 y값 예측하기
		// int x = 10;
		// int y = x-- + 5 + --x;
		// printf(" x의 값 : %d , y의값 : %d ", x, y)
		
		int X = 10;
		int Y = 5;
		
		Y = X-- + 5 + --X;
		
		// 10 + 5 = 15 // 후위라서 일단 계산 후 감소 
		// x-- => 10- => 9
		// (X-- + 5)
		// --X => 9- => 8
		
		

	}

}
