package Day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_member_list {

	public static void main(String[] args) {

		ArrayList<User> users = new ArrayList<User>();

		ArrayList<String> user_fromFile = new ArrayList<String>();

		// [설정] 파일을 읽어와야 한다.

		try {

			FileInputStream fis = new FileInputStream("C:/Users/505/git/java_ezen/Ezen_0929/src/Day14/memberList.txt");
			// Strema 단위는 무조건 바이트 !~! 스트림은 byte 의 흐름이야
			int size = fis.available();
			byte[] bytelist = new byte[size];
			fis.read(bytelist);
			// 영문, 공백, 특수문자 : 1바이트
			// 한글 : 2바이트

			String readStr = new String(bytelist);
			String[] userCount = readStr.split("\n");
			for (String s : userCount) {

				String[] userData = s.split(",");
				if (userData.length == 1)
					break;
				User user = new User(userData[0], userData[1], userData[2]);
				users.add(user);
			}

		} catch (FileNotFoundException e1) {
			System.out.println(" [파일 불러오기 실패] " + e1);
		} catch (IOException e) {
			System.out.println(" [입/출력 오류] " + e);
		}

		// 회원제 프로그램
		// 1. 리스트를 이용해서 회원가입, 로그인, 회원정보, 회원수정, 회원탈퇴

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("1. 회원가입 | 2. 로그인 | 3. 종료 : ");
			int ch = scanner.nextInt();

			if (ch == 1) {
				System.out.println("아이디 : ");
				String id = scanner.next();
				System.out.println("비밀번호 : ");
				String password = scanner.next();
				System.out.println("이름 : ");
				String name = scanner.next();

				User user = new User(id, password, name);
				boolean idcheck = true;

				for (User temp : users) {
					if (temp.getId().equals(id)) {
						System.out.println("아이디 중복");
						idcheck = false;
						break;
					}
				}

				// 3. 리스트에 저장
				if (idcheck) {
					System.out.println(users.add(user));
					System.out.println("회원가입 성공 ");
					try {
						FileOutputStream fos = new FileOutputStream(
								"C:/Users/505/git/java_ezen/Ezen_0929/src/Day14/memberList.txt", true);

						String outName = user.getName();
						String outPassword = user.getPassword();
						String outId = user.getId();
						fos.write((outName + "," + outPassword + "," + outId + "\n").getBytes());

					} catch (IOException e) {
						e.printStackTrace();
					}

				}

				// 4. 파일 처리

			} else if (ch == 2) {
				System.out.println("아이디 : ");
				String id = scanner.next();
				System.out.println("비밀번호 : ");
				String password = scanner.next();

				boolean loginCheck = true;

				for (User temp : users) {
					if (temp.getId().equals(id) && temp.getPassword().equals(password)) {
						System.out.println("로그인 성공");
						loginCheck = false;

						//// 로그인 성공시 ////

						while (true) {

							System.out.print("1. 회원정보 | 2. 회원수정 | 3. 회원탈퇴 | 4. 로그아웃 : ");
							int ch2 = scanner.nextInt();

							if (ch2 == 1) {
								System.out.println("[회원 정보]");
								System.out.println("[아이디] : " + temp.getId());
								System.out.println("[이름] : " + temp.getName());
							} else if (ch2 == 2) {
								System.out.println("[회원 이름 수정]");
								System.out.println("수정할 이름 : ");
								String newName = scanner.next();
								temp.setName(newName);
							} else if (ch2 == 3) {
								System.out.println("[회원 탈퇴]");
								System.out.println("탈퇴할 아이디 : ");
								users.remove(temp);

								break;
							} else if (ch2 == 4) {
								System.out.println("[로그 아웃]");
								break;
							} else {
								System.out.println("[에러 발생]");
							}

						}

						break;
					}
				}

				if (loginCheck) {
					System.out.println("[에러] 일치하는 회원 정보가 없습니다. ");
				}
			}

			else if (ch == 3) {
				System.out.println("[프로그램 종료]");
				break;
			}

		}

	}

}
