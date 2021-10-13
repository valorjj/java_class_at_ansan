package Day10;

public class AnonymousExample2 {

	public static void main(String[] args) {
		
		Vehicle vv= new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("씽씽이 ");
				
			}
		};

		Anonymous2 anony = new Anonymous2();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {

			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
			
		});
		
		anony.method2(vv);
		
		// 6. 중첩 클래스 안에서 사용되는 

	}

}
