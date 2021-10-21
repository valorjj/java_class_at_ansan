package view;

import java.util.Scanner;

// 원래는 여기 Front 가 들어가야한다. html/css/js
// Scanner 는 여기서만 받는다. 백엔드로는 데이터 전달, 혹은 호출만 ! 

public class Application {
	// 0. 설정 [ scanner 를 main 밖에 만드는 이유 : ]

	public static Scanner scanner = new Scanner(System.in);
	// public : 모든 접근을 허용하는 '접근 제한자'
	// static : static 영역에 생성해서 프로그램이 종료되기 전까지 사용할 수 있도록 한다.

	public static void main(String[] args) {

		mainmenu(); // 메인 메뉴 메소드 호출 

	}

	// 1. 메인 메뉴 메소드
	public static void mainmenu() {

	}

	// 2. 회원 메뉴 메소드
	public static void membermenu(String id) {

	}

	// 3. 게시판 메뉴 메소드
	public static void boardmenu(String id) {

	}
	


}
