package Day03;

import java.util.Scanner;

public class Day03_5 {
	public static void main(String[] args) {
		
		// 입력받은 정수만큼 별 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 문제 1
		
		System.out.println("문제1 ");
		System.out.print("n을 입력하세요 >>"); int end = sc.nextInt();

		
		for(int i=0; i<end; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");
		
		for(int i=0; i<end; i++) {
			for(int j=end-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("---------------------");
		
		// [공백] [별표]
		// 공백 * i개 : 별표 * (전체-i) 개
		
		for(int k=1; k<=end; k++) {
			for(int i=1; i<=end-k; i++) { // 공백 찍기 
				System.out.print(" ");
			}
			for(int j=1; j<=k; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");
		
		for(int k=0; k<end; k++) {
			for(int i=0; i<k; i++) { 
				System.out.print(" ");
			}
			for(int j=end-k; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");
		
		System.out.println("피라미드 : \n");
		for(int k=0; k<end; k++) {
			for(int i=0; i<end-k; i++) {
				System.out.print(" "); // 공백 출력 
			}
			for(int j=1; j<=2*k+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");
	
		for(int k=0; k<end; k++) {
			for(int i=0; i<end-k; i++) {
				System.out.print(" "); // 공백 출력 
			}
			for(int j=1; j<=2*k+1; j++) {
				System.out.print(k+1);
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");
		
		System.out.println("역 피라미드 : \n");
		
		for(int k=end; k>0; k--) {
			for(int i=0; i<=end-k; i++) {
				System.out.print(" "); // 공백 출력 
			}
			for(int j=(2*k-1); j>=1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");

		for(int k=0; k<end; k++) {
			for(int i=0; i<end-k; i++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*k+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int k=end-1; k>0; k--) {
			for(int i=0; i<=end-k; i++) {
				System.out.print(" "); // 공백 출력 
			}
			for(int j=(2*k-1); j>=1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");
		
		
		for(int i=0; i<end; i++) {
			
			for(int j=0; j<end; j++) {
				
				if(i==j || (i+j == end-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");
		
		
		
		
		
	}
}
