package Day10;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();

		anony.field.wake(); // 익명 자식 객체 내 메소드 호출

		anony.method1(); // 객체 내 메소드 호출 ----> 메소드 내 익명 객체

		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다. ");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다. ");
				study();
			}
		});

	}

}
