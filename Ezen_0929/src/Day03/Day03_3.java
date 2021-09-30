package Day03;

import java.util.Scanner;

public class Day03_3 {

	public static void main(String[] args) {

		int score = 90;
		switch (score) {
		case 90:
			System.out.println("A 등급입니다. ");
			break;
		case 80:
			System.out.println("B 등급입니다. ");
			break;
		case 70:
			System.out.println("C 등급입니다. ");
			break;
		default:
			System.out.println("탈락입니다. ");
		}

		// p.118 char switch 문
		char grade = 'B';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원입니다. ");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원입니다. ");
			break;

		default:
			System.out.println("회원이 아닙니다.");
		}

		// 문제 : 세 정수를 입력받아서 평균을 구하라.

		Scanner sc = new Scanner(System.in);
		System.out.print("수학점수를 입력하세요 >>");
		int d1 = sc.nextInt();
		System.out.print("영어점수를 입력하세요 >>");
		int d2 = sc.nextInt();
		System.out.print("국어점수를 입력하세요 >>");
		int d3 = sc.nextInt();

		int avg = (d1 + d2 + d3) / 3;
		avg = avg / 10; // 뒤에 있는 숫자를 날린다. 
		// 앞자리 수만 받을때는 나누기 10 !!! 

		switch (avg) {
		case 9:
			System.out.println("90점 이상입니다. A 등급");
			break;
		case 8:
			System.out.println("80점 이상입니다. B 등급");
			break;
		default:
			System.out.println("탈락입니다. ");

		}

	}

}
