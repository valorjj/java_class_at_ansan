package Day03;

import java.util.Scanner;

public class Day03_3 {

	public static void main(String[] args) {

		int score = 90;
		switch (score) {
		case 90:
			System.out.println("A ����Դϴ�. ");
			break;
		case 80:
			System.out.println("B ����Դϴ�. ");
			break;
		case 70:
			System.out.println("C ����Դϴ�. ");
			break;
		default:
			System.out.println("Ż���Դϴ�. ");
		}

		// p.118 char switch ��
		char grade = 'B';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ���Դϴ�. ");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ���Դϴ�. ");
			break;

		default:
			System.out.println("ȸ���� �ƴմϴ�.");
		}

		// ���� : �� ������ �Է¹޾Ƽ� ����� ���϶�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���������� �Է��ϼ��� >>");
		int d1 = sc.nextInt();
		System.out.print("���������� �Է��ϼ��� >>");
		int d2 = sc.nextInt();
		System.out.print("���������� �Է��ϼ��� >>");
		int d3 = sc.nextInt();

		int avg = (d1 + d2 + d3) / 3;
		avg = avg / 10; // �ڿ� �ִ� ���ڸ� ������. 
		// ���ڸ� ���� �������� ������ 10 !!! 

		switch (avg) {
		case 9:
			System.out.println("90�� �̻��Դϴ�. A ���");
			break;
		case 8:
			System.out.println("80�� �̻��Դϴ�. B ���");
			break;
		default:
			System.out.println("Ż���Դϴ�. ");

		}

	}

}
