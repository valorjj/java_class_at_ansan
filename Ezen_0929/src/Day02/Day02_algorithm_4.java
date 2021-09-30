package Day02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/* 
 * 
 * 
 * */

public class Day02_algorithm_4 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("input n as an even number : ");
			int n = sc.nextInt();
			System.out.println(generateParenthesis(n));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static List<String> generateParenthesis(int n) {
		Set<String> ans = new HashSet<>();
		ans = createParenthesis(n, ans);
		System.out.println("Ans: " + ans);
		return new ArrayList<>(ans);
	}

	private static Set<String> createParenthesis(int n, Set<String> currentList) {
		java.util.Set<String> temp = new HashSet<>();
		if (n <= 0)
			return new HashSet<>();
		if (n == 1) {
			temp.add("()");
			return temp;
		}
		currentList = createParenthesis(n - 1, currentList); // 재귀 
		
		System.out.println("At n-1 " + String.valueOf(n - 1) + ": " + currentList);
		
		for (String parenthesis : currentList) {
			for (int i = 0; i <= parenthesis.length(); i++) {
				String newStr;
				if (i == 0) {
					// 기본 시작은 괄호 '()' 로 시작한다. 
					System.out.println("At 0 for " + parenthesis);
					newStr = "()" + parenthesis;
					System.out.println(newStr);
					
				} else if (i == parenthesis.length()) {
					// 마지막에는 '()' 로 닫는다. 
					System.out.println("At last for " + parenthesis);
					newStr = parenthesis + "()";
					System.out.println(newStr);
				} else {
					// 괄호를 중간에 껴넣는 과정
					// 
					System.out.println("At " + i + " for " + parenthesis);
					newStr = parenthesis.substring(0, i) + "()" + parenthesis.substring(i);
					System.out.println(newStr);
				}
				temp.add(newStr);
			}
		}
		currentList = temp;

		return currentList;
	}
}
