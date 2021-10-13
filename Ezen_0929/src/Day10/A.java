package Day10;

/* 바깥 클래스 */
public class A {

	// 생성자 : 현재 클래스 이름과 동일하면 생성자 !!!
	A() {
		System.out.println("A 객체가 생성됨");
	}

	/* 인스턴스 멤버 클래스 */
	class B {

		// 1. 필드
		int field1;

		// 2. 생성자
		B() {
			System.out.println("B 객체가 생성됨");
		}

		// 3. 메소드
		void method1() {

		}
	}

	/* 정적 멤버 클래스 */
	static class C {
		C() {
			System.out.println("C 객체가 생성됨");
		}

		int field1;
		static int field2;

		void method() {
		}

		static void method2() {
		}

	}

	// 3. 메소드 [ A 클래스 내 메소드 ]
	void method() {
		/* 로컬 클래스 */
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}

			int field1;

			void method1() {

			}

		}

		// 메소드 내 지역변수
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
