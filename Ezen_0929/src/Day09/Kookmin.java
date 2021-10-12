package Day09;

public class Kookmin extends Bank {
	
	final String 은행코드 = "01";

	public static void main(String[] args) {


		// 1. 인터페이스 생성
		ATM atm;

		// 2. 인터페이스의 클래스 연결

		atm = new Kookmin();

		// 3. 인터페이스로부터 클래스 조작

		atm.accountEnroll();
		atm.deposit();
		atm.withdraw();
		atm.balance();

	}

	@Override
	public void withdraw() {
		// super.withdraw();
		System.out.println(" [국민은행] - [계좌 인출]");

	}

	@Override
	public void deposit() {
		// super.deposit();
		System.out.println(" [국민은행] - [계좌 출금]");
	}

	@Override
	public void balance() {
		// super.balance();
		System.out.println(" [국민은행] - [계좌 잔액]");

	}

	@Override
	public void accountEnroll() {
		// super.accountEnroll();
		System.out.println(" [국민은행] - [계좌 등록]");
	}

}
