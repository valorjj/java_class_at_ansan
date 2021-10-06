package Day06;

public class Calculator {

	void powerOn() {
		System.out.println("power is now on ... ");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	void powerOff() {
		System.out.println("now power is off ... ");
	}
}
