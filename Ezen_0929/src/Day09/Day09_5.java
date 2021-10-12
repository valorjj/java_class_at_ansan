package Day09;

public class Day09_5 {

	// 계좌 프로그램 [ 상속, 인터페이스 사용 ]
	// ATM [ 인터페이스 ]
	// 추상 메소드 : 계좌 등록, 예금, 출금, 이체, 잔고
	// 1. 은행 [ superclass ]
	// 2. 국민은행 [ subclass ]
	// 1. 필드 : 계좌번호, 예금액
	// 3. 신한은행 [ subclass ]

	public static Bank[] banklist = new Bank[100];

	public static void main(String[] args) {

		// 동일한 superclass 로부터 서로 다른 subclass 를 배열로 사용
		// super 클래스로 배열 선언해서 관리하자!!!

		Bank account1 = new Bank();
		banklist[3] = account1;

		banklist[0] = new Bank();
		banklist[1] = new Shinhan();
		banklist[2] = new Kookmin();

		Shinhan account2 = new Shinhan();
		banklist[4] = account2;

		Kookmin account3 = new Kookmin();
		banklist[5] = account3;

	}

}
