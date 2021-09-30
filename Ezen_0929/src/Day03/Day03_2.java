package Day03;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제1 : 2개의 정수를 입력받아서 더 큰 수를 출력하시오.

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("2개의 정수를 입력받아서 더 큰 수를 출력하시오.");
		 * 
		 * System.out.print("정수1 : "); int n1 = sc.nextInt();
		 * System.out.print("정수2 : "); int n2 = sc.nextInt();
		 * 
		 * if (n1 > n2) System.out.println("정수1이 더 큽니다. " + n1); else
		 * System.out.println("정수2가 더 큽니다. " + n2);
		 */

		// 문제2 : 3개의 정수를 입력받아서 더 큰 수를 출력하시오.

		/*
		 * System.out.println("3개의 정수를 입력받아서 더 큰 수를 출력하시오.");
		 * 
		 * System.out.print("정수1 : "); int m1 = sc.nextInt();
		 * System.out.print("정수2 : "); int m2 = sc.nextInt();
		 * System.out.print("정수3 : "); int m3 = sc.nextInt();
		 * 
		 * if (m1 > m2) { if (m1 > m3) { if (m2 > m3) {
		 * System.out.println("가장 큰 수는 정수1 입니다. " + m1); } else {
		 * 
		 * } } else if (m1 < m3) { System.out.println("가장 큰 수는 정수1 입니다. " + m1); } }
		 * else if (m1 < m2) { if (m1 > m3) { System.out.println("가장 큰 수는 정수2 입니다. " +
		 * m2);
		 * 
		 * } else if (m1 < m3) { if (m2 > m3) { System.out.println("가장 큰 수는 정수2 입니다. " +
		 * m2); } } else { System.out.println("가장 큰 수는 정수3 입니다. " + m3);
		 * 
		 * } }
		 * 
		 */

		// 문제3 : 4개의 정수를 입력받아 가장 큰 수를 출력하시오.

		/*
		 * System.out.println("4개의 정수를 입력받아 가장 큰 수를 출력하시오. ");
		 * 
		 * System.out.print("정수1 : "); int s1 = sc.nextInt();
		 * System.out.print("정수2 : "); int s2 = sc.nextInt();
		 * System.out.print("정수3 : "); int s3 = sc.nextInt();
		 * System.out.print("정수4 : "); int s4 = sc.nextInt();
		 * 
		 * int max1 = 0; int max2 = 0;
		 * 
		 * if (s1 > s2 && s3 > s4) { max1 = s1; max2 = s3; if (max1 > max2) {
		 * System.out.println("최대값은 " + max1); } else { System.out.println("최대값은 " +
		 * max2);
		 * 
		 * } } else if (s2 > s1 && s3 > s4) { max1 = s2; max2 = s3; if (max1 > max2) {
		 * System.out.println("최대값은 " + max1); } else { System.out.println("최대값은 " +
		 * max2);
		 * 
		 * } } else if (s1 > s2 && s4 > s3) { max1 = s1; max2 = s4; if (max1 > max2) {
		 * System.out.println("최대값은 " + max1); } else { System.out.println("최대값은 " +
		 * max2);
		 * 
		 * }
		 * 
		 * } else { // s1 < s2 && s3 < s4 max1 = s2; max2 = s4; if (max1 > max2) {
		 * System.out.println("최대값은 " + max1); } else { System.out.println("최대값은 " +
		 * max2);
		 * 
		 * } }
		 * 
		 */

		/*
		 * max = number1; if(max < number2) max = number2; if(max < number3) max =
		 * number3; if(max < number4) max = number4;
		 * 
		 * 
		 */

		/*
		 * int m = Math.max(s1, s2); int n = Math.max(s3, s4); int l = Math.max(m, n);
		 */

		/*
		 * 
		 * int[] findingMax = new int[4]; // 지정해주지 않는다면 '0' 으로 초기화
		 * 
		 * for(int i=0; i<findingMax.length; i++) { System.out.print("정수[" + i +
		 * "] 번째를 입력하시오. "); findingMax[i] = sc.nextInt(); }
		 * 
		 * int max = 0;
		 * 
		 * for(int w : findingMax) { if ( w > max ) { max = w; } }
		 * System.out.println("최댓값은 " + max);
		 */

		// 문제4 : 4개 받아서 오름차순으로 출력

		System.out.println("4개의 정수를 입력받아 가장 큰 수를 오름차순으로 출력하시오. ");

		System.out.print("정수1 : ");
		int d1 = sc.nextInt();
		System.out.print("정수2 : ");
		int d2 = sc.nextInt();
		System.out.print("정수3 : ");
		int d3 = sc.nextInt();
		System.out.print("정수4 : ");
		int d4 = sc.nextInt();

		int tmp;

		if (d1 > d2) {
			tmp = d1;
			d1 = d2;
			d2 = tmp;
		}
		if (d1 > d3) {
			tmp = d1;
			d1 = d3;
			d3 = tmp;
		}
		if (d1 > d4) {
			tmp = d1;
			d1 = d4;
			d4 = tmp;
		}

		if (d2 > d3) {
			tmp = d2;
			d2 = d3;
			d3 = tmp;
		}
		if (d2 > d4) {
			tmp = d2;
			d2 = d4;
			d4 = tmp;
		}

		if (d3 > d4) {
			tmp = d3;
			d3 = d4;
			d4 = tmp;
		}

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		// 내림차순은

		System.out.println("4개의 정수를 입력받아 가장 큰 수를 내림차순으로 출력하시오. ");

		System.out.print("정수1 : ");
		d1 = sc.nextInt();
		System.out.print("정수2 : ");
		d2 = sc.nextInt();
		System.out.print("정수3 : ");
		d3 = sc.nextInt();
		System.out.print("정수4 : ");
		d4 = sc.nextInt();

		tmp = 0;

		if (d1 < d2) {
			tmp = d1;
			d1 = d2;
			d2 = tmp;
		}
		if (d1 < d3) {
			tmp = d1;
			d1 = d3;
			d3 = tmp;
		}
		if (d1 < d4) {
			tmp = d1;
			d1 = d4;
			d4 = tmp;
		}

		if (d2 < d3) {
			tmp = d2;
			d2 = d3;
			d3 = tmp;
		}
		if (d2 < d4) {
			tmp = d2;
			d2 = d4;
			d4 = tmp;
		}

		if (d3 < d4) {
			tmp = d3;
			d3 = d4;
			d4 = tmp;
		}

		System.out.printf(" 내림차순 : %d  %d  %d  %d ", d1, d2, d3, d4);

		
		System.out.println("로그인 페이지 >>>>>    ");
		System.out.println(" 아이디 : ");
		String Id = sc.next();
		System.out.println(" 패스워드 : ");
		int pw = sc.nextInt();
		
		if(Id.equals("admin")) {
			// id 가 admin 이면
			if (pw == 1234) {
				System.out.println("로그인 성공");
				return; // 함수를 종료시킨다. 
			} else {
				System.out.println("패스워드가 다릅니다. ");
			}
		} else {
			System.out.println("아이디가 없습. ");
		}

	}

}
