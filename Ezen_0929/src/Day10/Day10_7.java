package Day10;

public class Day10_7 {

	public static void main(String[] args) {

		// 예외 처리
		// 프로그램의 정상화
		// finally -> 예외 상관없이 무조건 실행

		try {
			String data = "보리";
			System.out.println(data.toString());

		} catch (NullPointerException e) {
			System.out.println("null 값이 검출되었습니다. ");
			System.out.println("예외 정보 : " + e);
		} finally {
			System.out.println("SMILE");
		}

		try {
			String[] 문자열배열 = new String[2];
			문자열배열[0] = "유재석";
			System.out.println(문자열배열[0]);
			문자열배열[1] = "강호동";
			System.out.println(문자열배열[1]);
			문자열배열[2] = "신동엽";
			System.out.println(문자열배열[2]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 공간 부족 ");
			System.out.println("예외 정보 : " + e);
		}

	}


}
