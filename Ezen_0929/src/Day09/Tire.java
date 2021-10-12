
package Day09;

public class Tire {

	public int maxRotation; // 최대 회전수
	public int accumulatedRotation; // 누적 회전수
	public String location;

	public Tire() {
		// TODO Auto-generated constructor stub
	}

	public Tire(String location, int maxRotation) {
		super();
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() { // 타이어 회전 메소드 
		
		++accumulatedRotation; // 누적 회전수 증가 

		if (accumulatedRotation < maxRotation) { 
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}

	}

}
