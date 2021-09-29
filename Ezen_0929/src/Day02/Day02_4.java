package Day02;

import java.util.Scanner;

public class Day02_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ����1 : �޿� ����
		/*
		 * [����] �Է¹ޱ� : �⺻�� , ���� [���] �Ǽ��ɾ� = �⺻�� + ���� - ����[ �⺻��10% ]
		 * 
		 */

		System.out.println("�޿� ����");
		System.out.print("�⺻���� �Է��ϼ��� :");
		int monthylSalary = Integer.parseInt(sc.next());
		System.out.print("������ �Է��ϼ��� :");
		int allowance = Integer.parseInt(sc.next());
		int total = (int) (monthylSalary + allowance * 0.9);
		System.out.println("�� �޿��� ������ �����ϴ�. " + total + "��");
//
//		// ����2 : ���� ���� ����
//		/*
//		 * [����] : �ʸ��� ������ �ݾ��� �Է� [���] : �Է¹��� �ݾ��� ����� ���� [��� �� ] : 356789 �ʸ��� : 3�� ���� :
//		 * 5�� õ�� : 6�� ��� : 7��
//		 */
//
		System.out.println("���� ���� ����");
		System.out.print("��ü �ݾ��� �Է��ϼ���. (���� ����) :");
		// �ʸ��� ���� ��� 4��
		int[] moneyStack = new int[5];
		int totalCash = Integer.parseInt(sc.next());
		int n10 = totalCash / 100000;
		totalCash -= 100000 * n10;
		int n1 = totalCash / 10000;
		totalCash -= 10000 * n1;
		int n1000 = totalCash / 1000;
		totalCash -= 1000 * n1000;
		int n100 = totalCash / 100;
		System.out.println("�ʸ������� : " + n10 + " �������� : " + n1 + " õ������ : " + n1000 + " ������� : " + n100);
//		
		// ����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]

		System.out.println("�ϳ��� ������ �Է¹޾Ƽ� 7�� �����ġ ����϶� ");
		System.out.print("���� �ϳ��� �Է��ϼ��� -> ");
		int x = Integer.parseInt(sc.next());
		int y = x % 7;
		boolean isRight = y == 0 ? true : false;
		System.out.println(isRight);

		// ����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
		System.out.println("Ȧ������ �Ǻ��ϴ� �ڵ��Դϴ�. ");

		System.out.print("���� �ϳ��� �Է��ϼ��� -> ");
		int z = Integer.parseInt(sc.next());
		boolean isOdd = (z % 2 != 0) ? true : false;
		System.out.println(isOdd);

		// ����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
		System.out.println("7�� ����̸鼭 ¦������ �Ǻ��ϴ� �ڵ��Դϴ�. ");
		System.out.print("���� �ϳ��� �Է��ϼ��� -> ");
		int w = Integer.parseInt(sc.next());
		boolean isSevenAndEven = ((w % 2 == 0) && (w % 7 == 0)) ? true : false;
		System.out.println(isSevenAndEven);

		// ����6 : �ΰ��� ������ �Է¹޾� �� ū�� ��� [ true , false ]

		System.out.println("�ΰ��� ���� �Է¹޾� �� ū���� ����ϴ� �ڵ��Դϴ�. ");
		System.out.print("������ �Է��ϼ��� ����1 -> ");
		int s1 = Integer.parseInt(sc.next());
		System.out.print("������ �Է��ϼ��� ����2 -> ");
		int s2 = Integer.parseInt(sc.next());
		System.out.println("�Է¹��� ���� ���� " + s1 + " " + s2 + " �Դϴ�. ");

		int s3 = s1 > s2 ? s1 : s2;
		System.out.println("�� ū���� " + s3 + " �Դϴ�. ");

		// ����7 : �������� �Է¹޾� �� ���� ����ϱ�
		// �� ���� ���� => ������ * ������ * ������[3.14]

		System.out.print("�������� �Է��ϼ���-> ");
		float radius = Float.parseFloat(sc.next());
		float circleArea = (float) (radius * radius * 3.14);
		System.out.println("���� ���̴� ������ �����ϴ�. : " + circleArea);
		// ����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
		// ��) 54.5 84.3 �̸� 64.285714%

		System.out.println("�� �Ǽ��� �Է¹޾Ƽ� �սǼ��� ���� �ް��� �� % ���� ����ϴ� �ڵ��Դϴ�. ");
		System.out.println("�Ǽ��� ���� �Է��ϼ���. ");
		System.out.print("�Ǽ�1 -> ");
		float f1 = Float.parseFloat(sc.next());
		System.out.print("�Ǽ�2 -> ");
		float f2 = Float.parseFloat(sc.next());
		double relativePercent = (f1 / f2) * 100;
		
		System.out.println(relativePercent + "%");
		String result = String.format("%.2f", relativePercent);
		System.out.println(result + "%");
		System.out.printf("%.3f%%", relativePercent);
		System.out.println("\n");
		System.out.println(Math.round(relativePercent * 100) / 100.0);

		// ����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
		// ��ٸ��� ���� = > (���� * �غ�) * ���� / 2

		System.out.println("��ٸ��� ���� ���ϴ� �ڵ��Դϴ�. ");
		System.out.println("����, �غ��� ���̸� �Է��ϼ���. ");
		System.out.print("���� ���� -> ");
		int l1 = sc.nextInt();
		System.out.print("�غ� ���� -> ");
		int l2 = sc.nextInt();
		System.out.print("���� -> ");
		int h1 = sc.nextInt();
		float trapizodeArea = (l1 + l2) * h1 / 2;
		System.out.println("��ٸ��� ���� : " + trapizodeArea);

		// ����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
		// ǥ��ü�� ���� = > (Ű - 100) * 0.9

		System.out.println("Ű�� �Է¹޾� ǥ��ü���� ���ϴ� �ڵ��Դϴ�. ");
		System.out.print("Ű�� ������ �Է��ϼ��� -> ");
		int height = sc.nextInt();
		float averageWeight = (float) ((height - 100) * 0.9);
		System.out.println("ǥ�� ü���� " + averageWeight + " �Դϴ�. ");

//		// ����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
//		// BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))

		System.out.println("Ű�� �����Ը� �Է��ϼ���. ");
		System.out.print("Ű�� �Է��ϼ��� -> ");
		double height2 = sc.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� -> ");
		double weight2 = sc.nextDouble();
		double bmiStat = weight2 / ((height2 / 100) * (height2 / 100));
		System.out.println("bmi ������ ������ �����ϴ�. " + "BMI : " + String.format("%.2f", bmiStat));

//		// ����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ�

		System.out.println("inch �� cm �� ��ȯ�մϴ�. ");
		System.out.print("inch �� �Է��ϼ��� -> ");
		float inch = sc.nextFloat();
		inch = (float) (inch / 2.54);
		System.out.println(String.format("%.3f", inch) + " ��ġ �Դϴ�. ");

//		// ����13: �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
//		// �Ҽ� ��° �ڸ� ���� ���� ����ϱ�
//		// �߰���� �ݿ����� => 30 %
//		// �⸻��� �ݿ����� => 30 %
//		// ������ �ݿ����� => 40 %
		
		System.out.println("�������� �ݿ� ���� ����ϱ� ");
		System.out.println("�Ҽ� ��°¥�� �� ���� ����Ͻÿ�. ");
		System.out.print("�߰���� ������ �Է��Ͻÿ� -> "); float midTerm = sc.nextFloat();
		System.out.println("�⸻��� ������ �Է��Ͻÿ� -> "); float finalTerm = sc.nextFloat();
		System.out.println("������ ������ �Է��Ͻÿ� ->"); float extraScore = sc.nextFloat();
		float totalScore = (float) ((midTerm*0.3) + (finalTerm * 0.3) + (extraScore * 0.4));
		System.out.println("�ݿ� ���� �� ������ ������ �����ϴ�. " + String.format("%.2f", totalScore));
		

		// ����14 : ���� ���� ���� �ϰ� x�� y�� �����ϱ�
		// int x = 10;
		// int y = x-- + 5 + --x;
		// printf(" x�� �� : %d , y�ǰ� : %d ", x, y)
		
		int X = 10;
		int Y = 5;
		
		Y = X-- + 5 + --X;
		
		// 10 + 5 = 15 // ������ �ϴ� ��� �� ���� 
		// x-- => 10- => 9
		// (X-- + 5)
		// --X => 9- => 8
		
		

	}

}
