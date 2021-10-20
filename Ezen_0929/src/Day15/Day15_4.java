package Day15;

import java.util.Hashtable;
import java.util.Scanner;

public class Day15_4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Hashtable<String, String> hashtable = new Hashtable<>();
		
		while(true) {
			System.out.println("1. 회원가입 2. 로그인 ");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("아이디 : "); String id = scanner.next();
				System.out.println("비밀번호 : "); String password = scanner.next();
				
				if(hashtable.containsKey(id)) {
					System.out.println("아이디 중복 ");
					
				} else {
					hashtable.put(id, password); System.out.println("회원 가입 성공 ");
				}
			}
			if(ch==2) {
				
			}
		}
	}

}
