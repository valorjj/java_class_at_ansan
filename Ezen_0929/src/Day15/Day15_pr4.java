package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_pr4 {

	// 스택구조를 이용한 문자열 역순 출력
	// 조건 1 : 스택 구조
	// 조건 2 : 입력받은 문자열을 순서대로 스택에 저장
	// 조건 3 : 문자열 반대로 출력
	// 출력 예시 : ABC ---> CBA

	public static void main(String[] args) {

		Stack<String> str = new Stack<String>();

		Stack<Character> str1 = new Stack<>();

		System.out.print("문자열 입력 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		String userinput = scanner.next();
		
		for(int i =0; i<userinput.length(); i++) {
			str1.push(userinput.charAt(i));
		}
		
		for(int i=0; i<userinput.length(); i++) {
			System.out.print(str1.pop()); 
			
		}
		

		while (true) {
			System.out.print("문자열을 입력하세요 : (종료는 -1) : ");
			String inputStr = scanner.next(); // 예 : abcde
			if (inputStr.equals("-1")) {
				break;
			}
			str.add(inputStr);
		}
		System.out.println("입력된 문자열 : ");
		System.out.println(str);
		
		while (!str.isEmpty()) {
			String tmp = str.pop();
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------");

		String s1 = "a";
		String s2 = "b";
		String s3 = "c";

		str.add(s1);
		str.add(s2);
		str.add(s3);

		System.out.println("str 의 사이즈 : " + str.size());

		for (int i = 0; i < str.size(); i++) {
			System.out.print(str.pop());
		}

	}

}
