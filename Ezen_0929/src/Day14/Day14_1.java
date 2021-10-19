package Day14;

public class Day14_1 {

	public static void main(String[] args) {

		// 제네릭 : 타입 변환
			// 불필요한 타입 변환을 제거 시키는게 목적이다. 
		Member<String> member = new Member<String>();

		// 제네릭 메소드 
		Box<Integer> box1 = Util.<Integer>boxing(100);
		System.out.println(box1.getT());
		// Integer, String 왔다갔다 하려면 Object 사용해서 강제 형변환을 해야한다.
		
		Box<String> box2 = Util.<String>boxing("홍길동");
		System.out.println( box2.getT());

	}

}
