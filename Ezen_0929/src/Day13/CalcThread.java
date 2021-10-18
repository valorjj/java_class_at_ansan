package Day13;

public class CalcThread extends Thread {

	public CalcThread(String name) {
		super.setName(name);
		// super.메소드 : superclass 내 메소드에 접근하는 것
		// super() : 생성자
	}

	@Override
	public void run() {

		for (int i = 0; i < 2000000000; i++) {

		}

		System.out.println("반복문 종료 : " + getName());

	}

}
