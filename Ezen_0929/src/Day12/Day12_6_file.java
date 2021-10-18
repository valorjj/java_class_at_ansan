package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_6_file {

	public static void main(String[] args) throws Exception {

		// 파일처리 클래스

		// 메모리
		// [주기억장치=RAM] : 변수, 배열, 개체 등등 ----> 프로그램 종료 시 다 초기화
		// 보조기억장치 : File, DB 등

		// 파일 <--- 스트림 (단위 : 바이트) ----- > JAVA 프로그램
		// new String( ) --- getBytes( )
		// stream 말 자체로 bytes 들의 흐름이다.

		// fileOutputStream : 파일 출력 스트림 [해당 파일 없으면 생성]

		FileOutputStream fileOutputStream = new FileOutputStream(
				"C:/Users/505/git/java_ezen/Ezen_0929/src/Day12/test.txt");
		// 입출력 클래스 -> 무조건 예외처리 발생

		String str = "이클립에서 작성된 문서입니다. ";

		//
		fileOutputStream.write(str.getBytes());

		FileInputStream fileInputStream = new FileInputStream(
				"C:/Users/505/git/java_ezen/Ezen_0929/src/Day12/test.txt");

		byte[] byteList = new byte[1024]; // 1bit [0,1] -> 8bit[1byte] -> 1024byte[1kb]

		fileInputStream.read(byteList); // 파일 읽어오기

		// System.in.read(); // 키보드 읽어오기

		// byte 를 문자열로 형변환

		String readStr = new String(byteList);

		System.out.println("현재 파일의 내용은 :" + readStr);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("메모장에 입력할 데이터 : ");
			String outstr = scanner.next();
			outstr = outstr + "\n"; // 한줄에 하나의 회원데이터라고 가정
			fileOutputStream.write(outstr.getBytes());
		}

	}

}
