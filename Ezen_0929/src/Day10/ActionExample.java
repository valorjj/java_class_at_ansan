package Day10;

public class ActionExample {

	public static void main(String[] args) {

		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("[ 익명의 구현 객체 사용법 ] ");
				System.out.println("복사를 합니다. ");

			}

		};

		action.work();
	}

}
