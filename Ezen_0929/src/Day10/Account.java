package Day10;

public class Account {
	
	private long balance;
	
	public Account() {
	}
	
	public void deposit(int money) {
		
		balance += money;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족" + (money - balance) + " 부족합니다. ");
		}
		
		balance -= money;
		
	}
	
}
