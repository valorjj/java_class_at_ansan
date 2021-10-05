package Day05;

public class Day05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 1 : 0-49 까지 첫번째 행에 저장 50-99 까지는 두번째 행에 저장
		int[][] numList1 = new int[2][50]; // 1칸당 4바이트, 총 400바이트 !
		int[][] numList2 = new int[2][50];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 50; j++) {
				numList1[i][j] = j + i * 50;

			}
		}

		for (int i = 0; i < 100; i++) {
			if (i < 50)
				numList2[0][i] = i;
			else
				numList2[1][i - 50] = i;
		}

		for (int i = 0; i < 100; i++) {
			if (i < 50)
				System.out.printf("[%2d]", numList2[0][i]); // 자릿수 맞추기 
			else 
				System.out.printf("[%2d]", numList2[1][i - 50]);
			if (i == 49)
				System.out.println();
		}

	}

}
