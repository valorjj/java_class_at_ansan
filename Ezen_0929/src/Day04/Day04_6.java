package Day04;

import java.util.Scanner;

public class Day04_6 {
	public static void main(String[] args) {
		// 3목 게임을 만든다.
		// 배열을 이용한 틱택토게임

		Scanner sc = new Scanner(System.in);

		String[][] gameBoard = new String[3][3]; // 3x3 행렬을 생성한다.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				gameBoard[i][j] = "[ ]";
			}
		}

		printBoard(gameBoard);

		// 보드를 출력해서 확인한다.

		System.out.println("틱택토 게임 시작 ");
		// 이미 선택한 위치에 입력값이 있을 경우, 새롭게 입력을 받아야 한다.
		int count = 9;
		while (count > 0) {

			while (true) {
				System.out.print("플레이어1 x좌표 :");
				int x1 = sc.nextInt();
				System.out.print("플레이어1 y좌표 :");
				int y1 = sc.nextInt();

				if ((x1 >= 0 && x1 <= 2) && (y1 >= 0 && y1 <= 2)) {
					if (playerSelect1(gameBoard, x1, y1)) {
						count--;
					} else {
						break;
					}
				}

				System.out.print("플레이어2 x좌표 :");
				int x2 = sc.nextInt();
				System.out.print("플레이어2 y좌표 :");
				int y2 = sc.nextInt();

				if ((x2 >= 0 && x2 <= 2) && (y2 >= 0 && y2 <= 2)) {
					if (playerSelect2(gameBoard, x2, y2)) {
						count--;
					} else {
						break;
					}
				}
				printBoard(gameBoard);
			}
		}
	}

	// 플레이어의 입력을 받는다.
	// 매번 둘때마다 보드를 출력한다.

	// 보드를 출력하는 함수를 선언해서 불필요한 중복코드를 막는다.

	public static void printBoard(String[][] board) {
		for (String s[] : board) {
			for (String k : s) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}

	public static boolean playerSelect1(String[][] board, int i, int j) {
		if (board[i][j].equals("[ ]")) { // 빈칸일 때만 체크한다.
			board[i][j] = "[O]"; // 제대로 체크가 됐을 때 true 값을 반환한다.
		} else {
			System.out.println("이미 입력된 곳입니다. 다른 좌표를 입력하세요. ");
			return false;
		}
		return true;
	}

	public static boolean playerSelect2(String[][] board, int i, int j) {
		if (board[i][j].equals("[ ]")) {
			board[i][j] = "[X]";
		} else {
			System.out.println("이미 입력된 곳입니다. 다른 좌표를 입력하세요. ");
			return false;
		}
		return true;
	}

	public static void findWinner(String[][] board) {
		int player1_count = 0;
		int player2_count = 0;
		
		int count = 0;
		
		// 가로, 세로, 대각선
		boolean isCorrect = true;
		// for player 1 'O' 
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i][j].equals("[O]")) {
					count++;
				} 
			}

		}
		

		System.out.println("승리는 플레이어1 입니다.");
		System.out.println("승리는 플레이어2 입니다.");
	}
}
