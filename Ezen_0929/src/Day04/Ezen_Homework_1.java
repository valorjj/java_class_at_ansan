package Day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Ezen_Homework_1 {

	public static void main(String[] args) {

		HashMap<String, String> userInfo = new HashMap<String, String>(); // 아이디 중복을 허용하지 않으므로 HashMap 을 이용한다.
		List<String> visitorLogs = new ArrayList<String>(); // 방명록을 저장할 배열을 선언한다.

		// StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		Scanner sc = new Scanner(System.in);

		String userID = "";

		boolean flag1 = true;

		while (flag1) { // 시작 메뉴를 출력할 첫번째 while loop
			System.out.println("초기 메뉴 화면 입니다. 메뉴를 선택해주세요. ");
			System.out.print("1번 : [로그인] 2번 : [회원가입] :  >>> ");
			int choice1 = sc.nextInt();

			if (choice1 == 1 || choice1 == 2) { // 로그인, 회원가입 화면으로 이동

				boolean flag2 = true; // 로그인, 혹은 회원가입 화면을 고른 후 두번째 while loop

				while (flag2) {

					switch (choice1) {
					case 2: // [회원가입] 을 선택했을 경우
						System.out.println("회원가입 화면입니다. ");
						System.out.println("아이디와 패스워드는 공백없는 영어와 숫자로만 입력해주세요. ");

						boolean flag3 = true;

						while (flag3) {
							System.out.print("아이디를 입력하세요. : ");
							userID = sc.next();
							userID = userID.toUpperCase();

							for (int i = 0; i < userID.length(); i++) {
								char ch = userID.charAt(i);
								if ((ch < 65 || ch > 90) && (ch < 48 && ch > 57)) {
									System.out.println("잘못입력하셨습니다. ");
									// 아이디에 영문 / 숫자가 아닌 값이 입력되면 다시 입력화면으로 돌아가야한다.
									flag3 = false;
									break;
								} 
							}
						}

						// 아이디에는 영문, 숫자만 입력받게 한다.

						if (userInfo.containsKey(userID)) { // 아이디값이 중복되었을 경우
							System.out.println("중복되는 아이디입니다. 다른 값을 입력해주세요. ");
							break; // 회원가입 화면으로 돌아가기
						}
						System.out.print("비밀번호를 입력하세요. : ");
						String userPassword = sc.next();
						userInfo.put(userID, userPassword); // 입력받은 아이디와 비밀번호를 저장한다.
						flag2 = false;
						break;

					case 1: // [로그인] 을 선택했을 경우
						System.out.println("로그인 화면입니다. ");
						System.out.print("아이디를 입력하세요. : ");
						String loginID = sc.next();
						System.out.print("비밀번호를 입력하세요. : ");
						String loginPassword = sc.next();

						if (userInfo.containsKey(loginID) && userInfo.containsValue(loginPassword)) {
							// 아이디와 비밀번호 모두 일치하는 경우에만 통과시킨다.

							System.out.println("성공적으로 로그인하셨습니다. 메뉴를 선택해주세요. ");
							System.out.print("1번 : [방명록 남기기] 2번 : [로그아웃]  : ");
							int choice2 = sc.nextInt();
							switch (choice2) {
							case 1:
								System.out.print("방명록을 남기는 화면입니다. 방명록을 작성해주세요 : ");
								sc.nextLine(); // nextInt 후 nextLine 을 추가해줘야 논리적 오류가 발생하지 않는다.
								String logs = sc.nextLine();
								visitorLogs.add(logs);
								for (String s : visitorLogs) { // 방명록 배열을 출력한다.
									System.out.println(s + " " + loginID + " 님에 의해 작성되었습니다. ");
								}
								System.out.println("");
								System.out.println("초기메뉴로 돌아갑니다. ");
								flag2 = false;
								break;
							case 2:
								System.out.println("로그아웃을 선택하였습니다.초기 화면으로 돌아갑니다. ");
								flag2 = false;
								break;
							}

						} else {
							System.out.println("아이디 혹은 비밀번호가 다릅니다. 초기 화면으로 돌아갑니다. ");
							flag2 = false;
							break;
						}

						break;
					}
				}
			} else { // 첫번째 메뉴에서 1, 2 번이 아닌 입력이 들어올 경우
				System.out.println("잘못입력하셨습니다. 프로그램 종료. ");
				flag1 = false;
			}

		}
	}

}