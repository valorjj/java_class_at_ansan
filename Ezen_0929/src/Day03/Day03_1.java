package Day03;

public class Day03_1 {

	public static void main(String[] args) {
		if (3 > 1)
			System.out.println("3�� 1���� ũ��");
		
		
		// p.111
		int score2 = 85;
		if( score2>=90) {
			System.out.println("������ 90���� Ů�ϴ�. ");
			System.out.println("����� A �Դϴ�.");
		} else {
			System.out.println("������ 90���� �۽��ϴ�. ");
			System.out.println("����� B �Դϴ�.");
		}
		
		// p.112
		
		int score3 = 75;
		if(score3 >= 90) {
			System.out.println("������ 90-100�� �����Դϴ�. ");
			System.out.println("����� A �Դϴ�. ");

		} else if ( score3 >=80) {
			System.out.println("������ 80-89�� �����Դϴ�. ");
			System.out.println("����� B �Դϴ�. ");

		} else if (score3>=70) {
			System.out.println("������ 70-79�� �����Դϴ�. ");
			System.out.println("����� C �Դϴ�. ");

		} else {
			System.out.println("������ 70�� �̸��Դϴ�. ");
			System.out.println("����� D �Դϴ�. ");
		}
	}

}
