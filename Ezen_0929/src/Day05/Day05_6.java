package Day05;

import java.util.Scanner;

public class Day05_6 {
	// 쇼핑몰의 회원 설계
		// 1. 필드 : 속성
			 // 1. id, password, name, phone number 
		// 2. 메소드 : 동작
			// 1. 회원가입, 2. 로그인, 3. 회원탈퇴, 4. 회원수정 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Member member1 = new Member();
		// Member : 사용자가 만든 클래스
				// member1 : 클래스명 [Anything]
					// new : 객체의 메모리 할당 [메모리 할당시 무조건 new 생성자 사용]
					// 예외 : 기본 자료형 (primitive type) 
						// String 문자열 = "유재석" (영문 1바이트, 한글 2바이트)
						// 문자열도 크기가 정해져있기 때문에 생략 가능하다.
							// Member() : [생성자] 객체 생성 시, 초기값 
		System.out.print("아이디 입력 >> ");
		member1.ID = scanner.next();

		
		System.out.println(member1.getID());
		System.out.println(member1.ID);
	}

}
