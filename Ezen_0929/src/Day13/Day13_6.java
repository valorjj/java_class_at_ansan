package Day13;

public class Day13_6 {

	public static void main(String[] args) {

		// 비제네릭 :
		// 1. 제네릭이 없을 경우, 타입 변환을 사용해야 한다.
		// 1. 객체 생성

		Box box = new Box();
		box.set("홍길동"); // 홍길동은 String // [자동 형변환]
		String name = (String) box.get(); // 부 -> 자식 이렇게는 못 간다. 더 좁은 박스로 못들어감

		box.set(new Apple());
		Apple apple = (Apple) box.get();

		// 제네릭 :

		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("Smart TV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<>();

		product2.setKind(new Car());
		product2.setModel("Diesel");
		Car car = product2.getKind();
		String carmodel = product2.getModel();

	}

}
