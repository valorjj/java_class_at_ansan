package Day15;

public class Subway {

	// Queue 에서 들어온 출발 신호에 따라서
	// 만약에 1이면, station1 에 있는 열차가 있다면, station2 로 옮긴다.

	String train_code;

	public Subway(String train_code) {
		this.train_code = train_code;
	}

	@Override
	public String toString() {
		return this.train_code;
	}
}