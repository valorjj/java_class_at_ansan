package Day09;

public class Shinhan extends Bank {

	public static Bank[] banklist = new Bank[100];

	final String 은행코드 = "02";

	public static void main(String[] args) {

		ATM atm;

		atm = new Shinhan();

		atm.accountEnroll();
		atm.deposit();
		atm.withdraw();
		atm.balance();

	}

	@Override
	public void accountEnroll() {
		// TODO Auto-generated method stub
		super.accountEnroll();
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		super.withdraw();
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		super.deposit();
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		super.balance();
	}

}
