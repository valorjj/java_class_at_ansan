package Day13;

public class Day13_4 {

	public static void main(String[] args) {
		// 3개의 스레드를 만들어서 3개의 출력을 동시에 출력

		Thread_name thread_name = new Thread_name();

		Thread_a thread_a = new Thread_a();
		thread_a.start();

		Thread_b thread_b = new Thread_b();
		thread_b.start();

		Thread_c thread_c = new Thread_c();
		thread_c.start();
		
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
		}
		
		System.out.println("스레드1 이름 : " + thread_a.getName());
		System.out.println("스레드2 이름 : " + thread_b.getName());
		System.out.println("스레드3 이름 : " + thread_c.getName());

	}

}
