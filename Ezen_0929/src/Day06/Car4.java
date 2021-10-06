package Day06;

public class Car4 {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("running out of gas");
			return false;
		}
		System.out.println("gas is enough");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas 잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas 잔량:" + gas + ")");
				return;
			}
		}
	}
	
	// 내부 클래스 호출 
	
	void start() {
		run();
	}
	
	
}
