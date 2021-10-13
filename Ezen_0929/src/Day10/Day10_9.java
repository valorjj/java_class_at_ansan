package Day10;

public class Day10_9 {

	public static void main(String[] args) {

		Account account = new Account();

		account.deposit(10000);

		System.out.println("예금액 : " + account.getBalance());

		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
		}
	}
}
