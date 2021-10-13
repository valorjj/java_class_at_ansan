package logIn_example;

public class logInClass implements loginInterface {

	static String[] signUpList_ID = new String[3];
	static String[] signUpList_Password = new String[3];
	
	@Override
	public void user_input() {
		System.out.println("[입력]");
	}

}
