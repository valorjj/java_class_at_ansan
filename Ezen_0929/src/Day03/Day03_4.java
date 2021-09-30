package Day03;

public class Day03_4 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		//
		printHypen(45);
		int sum = 0;

		for (int i = 0; i <= 100; i += 7) {
			sum += i;
			System.out.println(sum);
		}

		printHypen(45);
		for (int i = 1; i <= 9; i++) {
			System.out.println(2 * i);
		}

		printHypen(45);

		System.out.println("구구단");
		for (int i = 2; i <= 15; i++) {
			System.out.println("[" + i + "]" + " 단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
				// System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			printHypen(15);
		}

	}

	public static void printHypen(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println("");
	}

}
