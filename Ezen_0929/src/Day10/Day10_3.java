package Day10;

public class Day10_3 {
	
	public static void main(String[] args) {
		
		A a = new A(); // A 클래스가 메모리 할당될 때, 중첩된 클래스들은 메모리 할당이안된다 ----> 호출 불가 !, 메모리 할당을 아래코드처럼 따로 해줘야한다. 
		
		A.B b = a.new B();
		
	}
}
