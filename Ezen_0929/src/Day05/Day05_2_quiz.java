package Day05;

import java.util.Scanner;

public class Day05_2_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] userList = new String[100][2]; // 1. 회원 100명의 아이디, 패스워드를 저장할 배열 선언

		Scanner sc = new Scanner(System.in);

		String[][] userLog = new String[100][2];

		while (true) {

			System.out.println("\t -- 회원제 프로그램 -- ");
			System.out.println("-------------------------------------------");
			System.out.print("[[ 1. 회원가입 2. 로그인 선택 ]] >>> ");

			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				// 회원가입 실행
				System.out.println("회원가입 화면입니다. ");
				System.out.print("아이디를 입력하세요 >>> ");
				String id = sc.next();
				System.out.print("비밀번호를 입력하세요 >>> ");
				String pw = sc.next();
				// 아이디 중복 체크 !
				boolean idCheck = true;
				for (int i = 0; i < 100; i++) {
					if (userList[i][0] != null && userList[i][0].equals(id)) {
						System.out.println("아이디 중복임 ");
						idCheck = false;
						break; // 중복 찾기 for 문 종료
					}
				}

				// 중복체크 변수가 true 일때 => 중복 없을 때만 배열에 저장한다.
				if (idCheck) {
					for (int i = 0; i < userList.length; i++) {
						if (userList[i][0] == null) { // i번째가 공백일 때,
							userList[i][0] = id;
							userList[i][1] = pw;
							System.out.println("회원가입 성공임  ");
							break; // 저장하기 for 문 종료

						}
					}
				}
				break;

			case 2:
				// 로그인 실행
				System.out.println("회원가입 화면입니다. ");
				boolean isCheck = true;

				System.out.print("아이디를 입력하세요 ");
				String inputID = sc.next();
				System.out.print("비밀번호를 입력하세요 ");
				String inputPW = sc.next();
				// 회원 정보가 있는지 확인하는 반복문 실행
				for (int i = 0; i < userList.length; i++) {
					if (inputID.equals(userList[i][0]) && inputPW.equals(userList[i][1]) && userList[i][0] != null) {
						// 회원 정보가 일치하는 경우
						System.out.println("로그인 성공 ");
						while (true) {
							System.out.println("\n\t 회원메뉴 ");
							System.out.print("[[ 1. 방문록 2. 방문록 확인 3. 로그아웃 ]] 선택 >>> ");
							int ch2 = sc.nextInt();

							if (ch2 == 1) {
								sc.nextLine();
								System.out.print("방문록 내용 >>> ");
								String logs = sc.nextLine();
								// ArrayList 를 쓰지 않으니 빈 공간을 찾아야 한다.
								for (int j = 0; j < userList.length; j++) {
									if (userList[j][0] != null) {
										userLog[i][0] = logs; // 방문록 저장
										userLog[i][1] = inputID;
										break; 
									}
								}

							} else if (ch2 == 2) {
								System.out.println(" 방문록 목록 ------- ");
								for (int j = 0; j < userLog.length; j++) {
									if (userLog[j][0] == null) {
										break;
									}
									System.out.printf("%10s \t %s \n", userLog[j][1], userLog[j][0]);
								}

							} else if (ch2 == 3) {
								System.out.println(" [알림] : 로그아웃 ");
								break;
							} else {
								System.out.println("[알림] 알 수 없는 행동입니다. ");
							}
						}
						isCheck = false;
						break;
					}
				}

				if (isCheck) { // 아이디 비밀번호 모두 동일할 때만 로그인 진행
					System.out.println("로그인 실패 (동일한 회원 정보가 없습니다. ) ");
					break;
				}

			default:
				System.out.println("유효하지 않은 입력입니다. ");

			}

		}

	}

}
