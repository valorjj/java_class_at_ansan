package Day10;

public class Day10_8 {

	public static void main(String[] args) {

		try {
			findClass();

		} catch (Exception e) {
			System.out.println("클래스가 존재하지 않습니다. ");
		}

	}
	// ClassNotFoundException 을 쓰는 이유
		// 모든 메소드에 try - catch 문을 사용하면 너무 코드가 지저분해진다.
			// 한곳에서 예외처리를 한다. 

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		// Class.forName : 클래스명 찾기 [존재여부 탐색 ] =>
	}

}
