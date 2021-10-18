package Day13;

public class BoxExample {
	
	public static void main(String[] args) {
		Box2<String> box1 = new Box2<String>();
		box1.set("hello");

		String str1 = box1.get();
	}

}
