package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Member {

	private String ID;
	private String Name;
	private String Password;
	private String Phonenumber;

	// 중요 데이터를 private 접근제한자 사용했으니
	// 외부 클래스가 접근하기 위해서는 getter / setter 가 필요하다

	public void signin() throws IOException {

		// 로그인
		Scanner scanner = Day12_7.scanner;
		System.out.println(" *** 로그인 페이지 *** ");
		System.out.println(" 아이디 : ");
		String id = scanner.next();
		System.out.println(" 비밀번호 : ");
		String password = scanner.next();

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"C:/Users/505/git/java_ezen/Ezen_0929/src/Day12/memberlist.txt");

			int bufferSize = fileInputStream.available();
			byte[] bufferArray = new byte[bufferSize];

			int readData = 0;
			
			while (fileInputStream.read(bufferArray) != -1) {

				String bufferArray_toString = new String(bufferArray);

				String[][] StringArray = new String[Day12_7.members.size()][4];

				for (String[] q : StringArray) {
					q = bufferArray_toString.split("\n");
					for (String k : q) {
						String[] p = k.split(",");
						
					}
				}
				
			
				
				

			}

		} catch (FileNotFoundException e) {
			System.out.println(" [알림 ] : 로그인 실패 " + e);
		}

	}

	public void signup() throws IOException {
		// 회원가입
		Scanner scanner = Day12_7.scanner;
		// 1. 입력
		System.out.println(" *** 회원가입 페이지 *** ");
		System.out.println(" 아이디 : ");
		String id = scanner.next();
		System.out.println(" 비밀번호 : ");
		String password = scanner.next();
		System.out.println(" 이름 : ");
		String name = scanner.next();
		System.out.println(" 연락처 : ");
		String phone = scanner.next();

		// 2. 객체 생성
		Member member = new Member(id, password, name, phone);

		Day12_7.members.add(member);

		// 3. 파일저장

		// 1. 회원별 [ \n ] 필드별 [ , ] 파일 저장 (있으면 contains)

		// 1. 파일 출력 객체
		// * 배열 내 모든 객체를 파일 처리

		try {
			for (Member m : Day12_7.members) {

				FileOutputStream fileOutputStream = new FileOutputStream(
						"C:/Users/505/git/java_ezen/Ezen_0929/src/Day12/memberlist.txt", true);

//				FileOutputStream fileOutputStream = new FileOutputStream(
//						"C:/Users/505/git/java_ezen/Ezen_0929/src/Day12/memberlist.txt", true);

				// true -> 이어쓰기

				// 2. 객체 내보내기 [ 필드 구분 ]
				String outString = m.ID + "," + m.Password + "," + m.Name + "," + m.Phonenumber + "\n";

				fileOutputStream.write(outString.getBytes());

			}

		} catch (Exception e) {
			System.out.println(" [알림] : 회원 DB 저장 실패 " + e);
		}

	}

	public Member() {
	}

	/**
	 * @param iD
	 * @param name
	 * @param password
	 * @param phonenumber
	 */
	public Member(String iD, String name, String password, String phonenumber) {
		super();
		ID = iD;
		Name = name;
		Password = password;
		Phonenumber = phonenumber;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}

}
