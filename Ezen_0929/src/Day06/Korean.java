package Day06;

public class Korean {
	
	// 1. 필드
	
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 2. 생성자
	
	// 여기서 String name, String ssn 은 외부변수 취급을 받기 때문에 
	public Korean(String name, String ssn) {
		// 객체 선언 시, 생성자로부터 n, s 값을 입력받는다. 
		// 생성자로부터 들어온 n 을 현재 필드에 저장한다. 
		this.name = name;
		this.ssn = ssn;
	}

}
