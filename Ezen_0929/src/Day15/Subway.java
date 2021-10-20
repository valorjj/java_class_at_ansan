package Day15;

public class Subway {

	// Queue 에서 들어온 출발 신호에 따라서
	// 만약에 1이면, station1 에 있는 열차가 있다면, station2 로 옮긴다.

	String train_code;
	String train_status;

//	public Subway(String train_code) {
//		this.train_code = train_code;
//	}

	public Subway(String train_code, String train_status) {
		this.train_code = train_code;
		this.train_status = train_status;
	}

	@Override
	public String toString() {
		return this.train_code;
	}

	public String getTrain_code() {
		return train_code;
	}

	public void setTrain_code(String train_code) {
		this.train_code = train_code;
	}

	public String getTrain_status() {
		return train_status;
	}

	public void setTrain_status(String train_status) {
		this.train_status = train_status;
	}
	
	
}