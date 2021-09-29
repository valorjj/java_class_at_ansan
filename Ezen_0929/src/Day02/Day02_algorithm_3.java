package Day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/* BackTracking Solution
 * 
 * 
 * */

public class Day02_algorithm_3 {

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
        int left = 0; String ele;
        //to store '(' number in each possible combination of'(  )'
        HashMap<String,Integer> pt = new HashMap<String,Integer>();
        pt.put("",0);
        List<String> res = new ArrayList<String>();
        res.add("");
        for(int i=0;i<2*n;i++){
            int length = res.size();
            for(int j=0;j<length;j++){
                //Backtracking
                ele = res.remove(0);
                left = pt.get(ele);
                //no ')' before '(' following a complete '( )'
                if(2*left==i) {ele+='('; pt.put(ele,left+1); res.add(ele);}  
                //not enough '('
                else if(left==n) {ele+=')'; pt.put(ele,left); res.add(ele);}
                //Whatever you want to add!
                else{
                    pt.put(ele+'(',left+1);
                    res.add(ele+'(');
                    pt.put(ele+')',left);
                    res.add(ele+')');                    
                }
            }
        }
        return res;
    }
}
