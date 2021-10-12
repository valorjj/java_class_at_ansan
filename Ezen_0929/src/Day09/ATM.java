package Day09;

// 계좌 프로그램 [ 상속, 인터페이스 사용 ] 
// ATM [ 인터페이스 ]
// 추상 메소드 : 계좌 등록, 예금, 출금, 이체, 잔고 
// 1. 은행 [ superclass ]
// 2. 국민은행 [ subclass ]
// 1. 필드 : 계좌번호, 예금액
// 3. 신한은행 [ subclass ] 

public interface ATM {

	public void accountEnroll();

	public void withdraw();

	public void deposit();

	public void balance();

	default void run() {
		System.out.println("ATM 실행 ... ");
	}

}
