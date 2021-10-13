package Day10;

public class Anonymous2 {

	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("자전거가 달립니다. ");

		}

	};

	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
			
			

		};
		
		localVar.run();
	}

	// 매개변수를 '익명 구현 객체' 로 받겠다 ! Argument 
	void method2(Vehicle v) {
		v.run();
	}

}
