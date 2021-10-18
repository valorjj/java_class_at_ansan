package Day13;

public class Day13_3 {

	// 스레드 제어
	// 1. Thread.sleep()
	// 2. Thread.yield() :

	public static void main(String[] args) {

//		ThreadA threadA = new ThreadA();
//		ThreadB threadB = new ThreadB();
//
//		threadA.start();
//		threadB.start();
//
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//		}
//		threadA.work = false; // threadA 가 양보 [ 스레드A 실행 X ] 
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//		}
//		threadA.work = true;
//
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//		}
//
//		threadA.stop = true;
//		threadB.stop = true;

		SumThread sumThread = new SumThread();

		sumThread.start();

		// main 스레드 sumThread 를 기다림

		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("1-100 까지의 합 : " + sumThread.getSum());
		
		
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		printThread1.setStop(true);
		
		// printThread1.stop(); // 권장하지 않음 -> 대규모 프로젝트에서 메모리가 정상적으로 종료되지 않아서 
		// 메모리 효율이 많이 떨어진다. 
		
		
		printThread1.interrupt(); 
		
		// 스레드를 멈추는 방식
			// stop -> true 값으로 간접적으로 종료시키는 방식
			// 스레드가 잠깐이라도 멈추면 종료 interrupt()
		
	}

}
