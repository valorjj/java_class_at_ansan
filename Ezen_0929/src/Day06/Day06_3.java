package Day06;

public class Day06_3 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		calculator.powerOn();

		calculator.powerOff();

		// p.233

		Car4 myCar = new Car4();

		myCar.setGas(10);
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다 ");
			myCar.start();
		}
		if (myCar.isLeftGas()) {
			System.out.println("gas 를 주입할 필요가 없습니다. ");
		} else {
			System.out.println("gas 를 주입하세요. ");
		}
		
	
	}

}
