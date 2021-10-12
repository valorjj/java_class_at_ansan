package Day08;

public class DmbCellPhone extends CellPhone {
	// field

	int channel;

	public DmbCellPhone(String model, String color) {
		super(model, color);
	}

	DmbCellPhone(String model, String color, int channel) {
		super(model, color); // 부모클래스 내 생성자를 호출한다.
		this.channel = channel;

	}

	// method

	void turnOnDmb() {
		System.out.println("channel : " + channel + " broadcast has been started ... ");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel; // this.channel : member of current class : parameter
		// channel : argument
		// argument : value which is delivered to the function when function is called
		System.out.println("channel :" + channel + " has been changed ... ");
	}

	void turnOffDmb() {
		System.out.println("dmb broadcast has been stopped ... ");
	}

	@Override // @ => Annotation 너무 많이 써서 생략이 가능함
	void powerOn() {
		super.powerOn(); // 부모 메소드 호출 
		System.out.println("전원 메소드 재정의 : dmb 폰 켭니다. ");
		
	}

}
