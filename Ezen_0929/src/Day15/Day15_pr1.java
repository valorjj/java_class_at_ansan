package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_pr1 {

	public static void main(String[] args) {
		// [손님] 명단 추가 / 인원수를 입력받아서 대기번호 반환
		// [손님] 대기번호 입력받아 명단 취소

		// [관리자] 명단 입장 - 대기1번 부터 입장, 없으면 없음 출력

		ArrayList<waitingList> wlist = new ArrayList<>();
		Scanner scanner;

		boolean run = true;

		while (run) {

			try {
				scanner = new Scanner(System.in);
				System.out.println("------------------------------------------");
				System.out.println("대기 현황 ");
				System.out.println("------------------------------------------");
				for (int i = 0; i < wlist.size(); i++) {
					System.out.println("[대기번호] " + (i + 1) + "번 " + " [인원] : " + wlist.get(i).getParty_number());
				}
				System.out.println("------------------------------------------");
				System.out.println("|1. 대기 신청 | 2. 대기 취소 | 3. 관리자 |");
				System.out.println("------------------------------------------");
				System.out.print("| 입력 : ");
				int ch = scanner.nextInt();

				if (ch == 1) {
					// 예약 신청
					int idx = wlist.size() + 1;
					System.out.println("------------------------------------------");
					System.out.println("| 예약 신청 화면입니다                   |");
					System.out.println("------------------------------------------");
					System.out.print("| 인원수 : ");
					int people_number = scanner.nextInt();
					System.out.println("------------------------------------------");
					System.out.println("| 대기 번호 : " + idx + "                          |");
					wlist.add(new waitingList(people_number, idx));

				} else if (ch == 2) {
					// 예약 취소
					System.out.println("------------------------------------------");
					System.out.println("| 예약 취소 화면입니다.                  |");
					System.out.println("------------------------------------------");
					System.out.print("| 대기 번호 : ");
					int waiting_number = scanner.nextInt();
					for (waitingList w : wlist) {
						if (w.getWaiting_number() == waiting_number) {
							wlist.remove(waiting_number - 1);
							break;
						}
					}
					System.out.println("------------------------------------------");
					System.out.println("| 예약이 취소되었습니다.                 |");

				} else if (ch == 3) {
					// 입장
					// 대기번호 1번부터 입장
					System.out.println("------------------------------------------");
					System.out.println("| 1번부터 입장하세요 ");
					System.out.println("------------------------------------------");
					System.out.print("| 대기 번호 : ");
					int numbercheck = scanner.nextInt();
					if (wlist.isEmpty()) {
						System.out.println("| 대기중인 고객이 없습니다. ");
					} else {
						for (waitingList w : wlist) {
							if (numbercheck == w.getWaiting_number()) {
								System.out.println("------------------------------------------");
								System.out.println("| [" + numbercheck + "] 번 손님 환영합니다. ");
								wlist.remove(0);
								break;
							} else {
								System.out.println("| 유효한 숫자가 아닙니다.                |");
							}

						}
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
