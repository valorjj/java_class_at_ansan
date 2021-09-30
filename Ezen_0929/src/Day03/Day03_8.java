package Day03;

public class Day03_8 {

	public static void main(String[] args) {
		Integer a = 10;
		System.out.println("Before: " + a);
		changeInteger(a);
		System.out.println("After: " + a);
		

		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				int sum=(4*x + 5*y) % 60;
				if(sum % 60 == 0) {
					System.out.println(x + " " + y);
				}
			}
		}
	}

	public static void changeInteger(Integer param) {
		param += 10;
	}
	
	// 4x + 5y = 60
	


}
