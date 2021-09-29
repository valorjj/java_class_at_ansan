package Day02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

// BFS Solution 
// 


public class Day02_algorithm_2 {

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
	    List<String> result = new ArrayList();
	    Queue<psString> q = new LinkedList();
	    psString ps = new psString("",0,0); 
	    q.offer(ps); // 큐에 저장한다.
	    
	    while(!q.isEmpty()){
	        psString curr = q.poll(); 
	        if(curr.openCount == n && curr.closedCount == n)
	            result.add(curr.str); // curr 의 str 값만 저장한다. 
	        else{
	            
	            if(curr.openCount < n){ 
	                psString ps1 = new psString(curr.str + "(", curr.openCount +1 ,curr.closedCount ); 
	                q.offer(ps1);
	            }
	            if(curr.openCount > curr.closedCount){ 
	                psString ps2 = new psString(curr.str + ")", curr.openCount, curr.closedCount+1); 
	                  q.offer(ps2); 
	            }
	              
	        }
	    }
	    
	    return result;
	}
}

class psString{
    String str;
    int openCount;
    int closedCount;
    public psString(String str, int openCount, int closedCount){
        this.str= str;
        this.openCount = openCount;
        this.closedCount= closedCount;
        
    }
}