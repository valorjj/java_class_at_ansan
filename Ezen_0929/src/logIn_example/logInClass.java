package logIn_example;

public class logInClass implements loginInterface {

	Member[] memberList = new Member[3];

	@Override
	public void user_input() {
		System.out.println("[입력]");
	}

	@Override
	public void user_search() {
		System.out.println("[탐색]");

	}

}
