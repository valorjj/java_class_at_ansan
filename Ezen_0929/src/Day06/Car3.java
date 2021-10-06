package Day06;

public class Car3 {

	// 1. 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 2. 생성자

	public Car3() {
		// 빈 생성자
	}

	public Car3(String model) {

	}

	public Car3(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
