package test;

public class Account {

	// 사용자 이름, 계좌, 잔액

	// 추가로 계좌번호 입력 -> 해당 계좌 삭제

	String ano;
	String owner;
	int password;
	int balance;

	public Account(String owner, String ano, int password, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.password = password;

	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
