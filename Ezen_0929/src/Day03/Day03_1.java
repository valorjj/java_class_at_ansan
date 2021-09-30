package Day03;

public class Day03_1 {

	public static void main(String[] args) {
		if (3 > 1)
			System.out.println("3이 1보다 크다");
		
		
		// p.111
		int score2 = 85;
		if( score2>=90) {
			System.out.println("점수가 90보다 큽니다. ");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다. ");
			System.out.println("등급은 B 입니다.");
		}
		
		// p.112
		
		int score3 = 75;
		if(score3 >= 90) {
			System.out.println("점수는 90-100점 사이입니다. ");
			System.out.println("등급은 A 입니다. ");

		} else if ( score3 >=80) {
			System.out.println("점수는 80-89점 사이입니다. ");
			System.out.println("등급은 B 입니다. ");

		} else if (score3>=70) {
			System.out.println("점수는 70-79점 사이입니다. ");
			System.out.println("등급은 C 입니다. ");

		} else {
			System.out.println("점수는 70점 미만입니다. ");
			System.out.println("등급은 D 입니다. ");
		}
	}

}
