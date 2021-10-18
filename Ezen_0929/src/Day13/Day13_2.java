package Day13;

public class Day13_2 {

	// 스레드 우선순위
	// p.590

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			// 2. 멀티스레드 생성 [ 이름 부여 ]
			Thread thread = new CalcThread("thread" + i);
			// System.out.println(i + "번째 스레드 생성 ");

			// 3. 우선 순위

			if (i != 10) { // 스레드 번호가 10이 아니면
				// 해당스레드를 낮은 우선순위로 설정
				thread.setPriority(Thread.MIN_PRIORITY);

			} else {
				// 높은 우선순위, 근데 항상 1등은 아냐
				thread.setPriority(Thread.MAX_PRIORITY);
			}

			// thread.start();

			// 스레드 동기화 메소드
			// 동기화 : 여러 스레드가 동일한 메소드 접근할 때 먼저 접근한 메소드부터 처리
			// 먼저 접근한 메소드부터 처리, 나머지는 hold

		}
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}

}
