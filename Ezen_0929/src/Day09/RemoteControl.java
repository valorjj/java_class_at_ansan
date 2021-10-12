package Day09;

public interface RemoteControl {

	// 1. 상수 필드 [ 반드시 초기값 존재]

	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// 2. 추상 메소드 [ 메소드 선언만한다. 정의 X ]
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	// 3. 디폴트 메소드

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다. ");
		} else {
			System.out.println("무음 해제합니다. ");
		}
	}
	
	// 4. 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다. ");
	}

}
