package Day03;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����1 : 2���� ������ �Է¹޾Ƽ� �� ū ���� ����Ͻÿ�.

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("2���� ������ �Է¹޾Ƽ� �� ū ���� ����Ͻÿ�.");
		 * 
		 * System.out.print("����1 : "); int n1 = sc.nextInt();
		 * System.out.print("����2 : "); int n2 = sc.nextInt();
		 * 
		 * if (n1 > n2) System.out.println("����1�� �� Ů�ϴ�. " + n1); else
		 * System.out.println("����2�� �� Ů�ϴ�. " + n2);
		 */

		// ����2 : 3���� ������ �Է¹޾Ƽ� �� ū ���� ����Ͻÿ�.

		/*
		 * System.out.println("3���� ������ �Է¹޾Ƽ� �� ū ���� ����Ͻÿ�.");
		 * 
		 * System.out.print("����1 : "); int m1 = sc.nextInt();
		 * System.out.print("����2 : "); int m2 = sc.nextInt();
		 * System.out.print("����3 : "); int m3 = sc.nextInt();
		 * 
		 * if (m1 > m2) { if (m1 > m3) { if (m2 > m3) {
		 * System.out.println("���� ū ���� ����1 �Դϴ�. " + m1); } else {
		 * 
		 * } } else if (m1 < m3) { System.out.println("���� ū ���� ����1 �Դϴ�. " + m1); } }
		 * else if (m1 < m2) { if (m1 > m3) { System.out.println("���� ū ���� ����2 �Դϴ�. " +
		 * m2);
		 * 
		 * } else if (m1 < m3) { if (m2 > m3) { System.out.println("���� ū ���� ����2 �Դϴ�. " +
		 * m2); } } else { System.out.println("���� ū ���� ����3 �Դϴ�. " + m3);
		 * 
		 * } }
		 * 
		 */

		// ����3 : 4���� ������ �Է¹޾� ���� ū ���� ����Ͻÿ�.

		/*
		 * System.out.println("4���� ������ �Է¹޾� ���� ū ���� ����Ͻÿ�. ");
		 * 
		 * System.out.print("����1 : "); int s1 = sc.nextInt();
		 * System.out.print("����2 : "); int s2 = sc.nextInt();
		 * System.out.print("����3 : "); int s3 = sc.nextInt();
		 * System.out.print("����4 : "); int s4 = sc.nextInt();
		 * 
		 * int max1 = 0; int max2 = 0;
		 * 
		 * if (s1 > s2 && s3 > s4) { max1 = s1; max2 = s3; if (max1 > max2) {
		 * System.out.println("�ִ밪�� " + max1); } else { System.out.println("�ִ밪�� " +
		 * max2);
		 * 
		 * } } else if (s2 > s1 && s3 > s4) { max1 = s2; max2 = s3; if (max1 > max2) {
		 * System.out.println("�ִ밪�� " + max1); } else { System.out.println("�ִ밪�� " +
		 * max2);
		 * 
		 * } } else if (s1 > s2 && s4 > s3) { max1 = s1; max2 = s4; if (max1 > max2) {
		 * System.out.println("�ִ밪�� " + max1); } else { System.out.println("�ִ밪�� " +
		 * max2);
		 * 
		 * }
		 * 
		 * } else { // s1 < s2 && s3 < s4 max1 = s2; max2 = s4; if (max1 > max2) {
		 * System.out.println("�ִ밪�� " + max1); } else { System.out.println("�ִ밪�� " +
		 * max2);
		 * 
		 * } }
		 * 
		 */

		/*
		 * max = number1; if(max < number2) max = number2; if(max < number3) max =
		 * number3; if(max < number4) max = number4;
		 * 
		 * 
		 */

		/*
		 * int m = Math.max(s1, s2); int n = Math.max(s3, s4); int l = Math.max(m, n);
		 */

		/*
		 * 
		 * int[] findingMax = new int[4]; // ���������� �ʴ´ٸ� '0' ���� �ʱ�ȭ
		 * 
		 * for(int i=0; i<findingMax.length; i++) { System.out.print("����[" + i +
		 * "] ��°�� �Է��Ͻÿ�. "); findingMax[i] = sc.nextInt(); }
		 * 
		 * int max = 0;
		 * 
		 * for(int w : findingMax) { if ( w > max ) { max = w; } }
		 * System.out.println("�ִ��� " + max);
		 */

		// ����4 : 4�� �޾Ƽ� ������������ ���

		System.out.println("4���� ������ �Է¹޾� ���� ū ���� ������������ ����Ͻÿ�. ");

		System.out.print("����1 : ");
		int d1 = sc.nextInt();
		System.out.print("����2 : ");
		int d2 = sc.nextInt();
		System.out.print("����3 : ");
		int d3 = sc.nextInt();
		System.out.print("����4 : ");
		int d4 = sc.nextInt();

		int tmp;

		if (d1 > d2) {
			tmp = d1;
			d1 = d2;
			d2 = tmp;
		}
		if (d1 > d3) {
			tmp = d1;
			d1 = d3;
			d3 = tmp;
		}
		if (d1 > d4) {
			tmp = d1;
			d1 = d4;
			d4 = tmp;
		}

		if (d2 > d3) {
			tmp = d2;
			d2 = d3;
			d3 = tmp;
		}
		if (d2 > d4) {
			tmp = d2;
			d2 = d4;
			d4 = tmp;
		}

		if (d3 > d4) {
			tmp = d3;
			d3 = d4;
			d4 = tmp;
		}

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		// ����������

		System.out.println("4���� ������ �Է¹޾� ���� ū ���� ������������ ����Ͻÿ�. ");

		System.out.print("����1 : ");
		d1 = sc.nextInt();
		System.out.print("����2 : ");
		d2 = sc.nextInt();
		System.out.print("����3 : ");
		d3 = sc.nextInt();
		System.out.print("����4 : ");
		d4 = sc.nextInt();

		tmp = 0;

		if (d1 < d2) {
			tmp = d1;
			d1 = d2;
			d2 = tmp;
		}
		if (d1 < d3) {
			tmp = d1;
			d1 = d3;
			d3 = tmp;
		}
		if (d1 < d4) {
			tmp = d1;
			d1 = d4;
			d4 = tmp;
		}

		if (d2 < d3) {
			tmp = d2;
			d2 = d3;
			d3 = tmp;
		}
		if (d2 < d4) {
			tmp = d2;
			d2 = d4;
			d4 = tmp;
		}

		if (d3 < d4) {
			tmp = d3;
			d3 = d4;
			d4 = tmp;
		}

		System.out.printf(" �������� : %d  %d  %d  %d ", d1, d2, d3, d4);

		
		System.out.println("�α��� ������ >>>>>    ");
		System.out.println(" ���̵� : ");
		String Id = sc.next();
		System.out.println(" �н����� : ");
		int pw = sc.nextInt();
		
		if(Id.equals("admin")) {
			// id �� admin �̸�
			if (pw == 1234) {
				System.out.println("�α��� ����");
				return; // �Լ��� �����Ų��. 
			} else {
				System.out.println("�н����尡 �ٸ��ϴ�. ");
			}
		} else {
			System.out.println("���̵� ����. ");
		}

	}

}
