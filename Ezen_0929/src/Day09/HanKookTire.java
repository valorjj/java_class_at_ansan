package Day09;

public class HanKookTire extends Tire {

	// 필드
	public HanKookTire(String location, int maxRotation) {
		// 부모 관계인 Tire
		super(location, maxRotation);
	}

	// 메소드 재정의
	@Override
	public boolean roll() {
		++accumulatedRotation;

		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HanKookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " HanKookTire 펑크 ***");
			return false;
		}

	}

}
