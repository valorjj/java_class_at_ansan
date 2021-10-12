package Day08;

public class CellPhone {

	// field 
	String model;
	String color;
	
	

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	// 접근제한자 생략하면 [default] 값이 자동으로 들어간다.
	void powerOn() {
		System.out.println("power is on ... ");
	}

	void powerOff() {
		System.out.println("power is off ... ");
	}

	void bell() {
		System.out.println("bell is now rigning ... ");
	}

	void sendVoice(String message) {
		System.out.println("from me : " + message);
	}

	void receiveVoice(String message) {
		System.out.println("to you : " + message);
	}

	void hangUp() {
		System.out.println("call has been terminated ... ");
	}
}
