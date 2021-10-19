package Day14;

import java.util.Scanner;

public class Day14_member_list {

	public static void main(String[] args) {
	
		
		// 회원제 프로그램
			// 1. 리스트를 이요해서 회원가입, 로그인, 회원정보, 회원수정, 회원탈퇴 
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. 회원가입 2. 로그인 ");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("아이디 : "); String id = scanner.next();
				System.out.println("비밀번호 : "); String password = scanner.next();
				System.out.println("이름 : "); String name = scanner.next();
				
				User user = new User(id, password, name);
				
				
			}
			
			
		}
		

	}

}
