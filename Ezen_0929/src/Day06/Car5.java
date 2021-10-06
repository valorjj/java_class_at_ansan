package Day06;

public class Car5 {

	private String model;
	private int speed;

	// 필드 - 생성자 - 메소드

	// 필드는 데이터를 저장
	// 생성자는 데이터들의 초기값
	// 메소드는 데이터들의 행동
	// 생성자 [데이터 초기값]
	public Car5(String model) {
		// 외부로부터 들어온 데이터 [인수] 를 내부 변수에 저장
		// model = model; // [내부변수 == 인수변수] : 충돌 발생
		this.model = model; // [ this.내부변수 = 인수]
	}

	// 안정성 때문에 간접 호출
	// private, protected 등 접근 제한자를 붙여서 데이터에 대한 직접 접근을
	// 막는다.
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 0; i <= 50; i += 10) {
			this.setSpeed(i); // 내부 Class 에서는 Method 바로 호출 가능
			System.out.println(this.model + " 가 달립니다. (시속 : " + this.speed + " km/h)");
		}
	}

}
