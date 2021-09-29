package Day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// DFS Solution which is hard to fully understand


public class Day02_algorithm_1 {

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
	    List<String> result = new ArrayList<String>();
	    Stack<String> stack = new Stack<String>();
	    Stack<int[]> generate = new Stack<int[]>();
	    stack.push(""); // 공백처리 
	    generate.push(new int[]{n, 0});
	    while (!stack.isEmpty()) {
	        String s = stack.pop();
	        int open = generate.peek()[0];
	        int close = generate.pop()[1];
	        if (open == 0 && close == 0)
	            result.add(s);
	        if (open > 0) {
	            stack.push(s + "(");
	            generate.push(new int[]{open - 1, close + 1});
	        }
	        if (close > 0) {
	            stack.push(s + ")");
	            generate.push(new int[]{open, close - 1});
	        }
	    }
	    return result;
	}
}
