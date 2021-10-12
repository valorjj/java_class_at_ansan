package Day09;

public class Bank implements ATM {
	
	String account;
	int balance;

	@Override
	public void accountEnroll() {
		System.out.println(" [ 계좌 등록 ] ");
		
	}

	@Override
	public void withdraw() {
		System.out.println(" [ 계좌 출금 ] ");
		
	}

	@Override
	public void deposit() {
		System.out.println(" [ 계좌 예금 ] ");
		
	}

	@Override
	public void balance() {
		System.out.println(" [ 계좌 잔고 ]");
		
	}

}
