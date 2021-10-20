package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_pr3 {

	// 지하철 관제
	// [조건1] 역 4개 (종점역 -> 용산 -> 서울 -> 구로 -> 종점)
	// [조건2] 전철 3개 객체 [종점역에 3개 전철 대기중]
	// [조건3] 출발 신호를 받아서(메뉴를 만들어서) 해당역에서 출발해서 다음으로 도착
	// [조건4] 역 당 소요시간은 2초

	// 역마다 메뉴 존재
	// 1. 종점 2. 용산 3. 서울 4. 구로
	// 예시 ) 1번 선택시 종점역에 있는 먼저 들어온 전철을 다음역으로 출발
	// 예시 ) 만일, 해당역에 전철이 없으면 없다고 출력
	// 예시 ) 해당역에 전철이 이미 존재하면 있다고 출력

	// 멀티스레드를 어떤 식으로 활용할까 ?

	public static void main(String[] args) {

		Scanner scanner;

		Station 종점역 = new Station();
		종점역.station.offer(new Subway("KTX1"));
		종점역.station.offer(new Subway("KTX2"));
		종점역.station.offer(new Subway("새마을호1"));
		종점역.station.offer(new Subway("새마을호2"));
		Station 용산역 = new Station();
		Station 서울역 = new Station();
		Station 구로역 = new Station();

		boolean run = true;

		boolean[] sw = { true, false, false, false };

		// 제어 스위치
		// false 일 때는 아무도 못 지나가게 해보자

		while (run) {

			System.out.println("1. 종점 | 2. 용산 | 3. 서울 | 4. 구로 | 5. 종료 : ");

			try {

				scanner = new Scanner(System.in);
				int ch = scanner.nextInt();

				Station_Time time_thread = new Station_Time();

				if (ch == 1) {
					// 1. 종점역에 열차가 있다면, 종점에서 용산으로 (1에서 2로) 이동시킨다.
					if (!종점역.station.isEmpty()) {
						if (sw[ch - 1] == true) {
							time_thread.stop_train(sw[ch - 1]);

							time_thread.run();
							용산역.station.offer(종점역.station.poll());
						} else {
							System.out.println("통행이 불가능합니다. ");
							System.out.println("통행을 허용하시겠습니까? : (Y/N)");
							String pass = scanner.next();
							if (pass.equals("Y")) {
								System.out.println(ch + "번 구간 통행이 허용되었습니다. ");
								sw[ch - 1] = true;
							}
						}
					} else {
						// 1. 아무것도 없으니 지나갑니다..
						System.out.println("정차중인 열차가 없습니다. ");

					}
					current_subway(종점역, 용산역, 서울역, 구로역);
				}

				if (ch == 2) {
					// 2. 용산역에 열차가 있다면, 용산에서 서울역으로 (2에서 3로) 이동시킨다.
					if (!용산역.station.isEmpty()) {
						if (sw[ch - 1] == true) {
							time_thread.stop_train(sw[ch - 1]);
							time_thread.run();

							서울역.station.offer(용산역.station.poll());
						} else {
							System.out.println("통행이 불가능합니다. ");
							System.out.println("통행을 허용하시겠습니까? : (Y/N)");
							String pass = scanner.next();
							if (pass.equals("Y")) {
								System.out.println(ch + "번 구간 통행이 허용되었습니다. ");
								sw[ch - 1] = true;
							}
						}
					} else {
						// 1. 아무것도 없으니 지나갑니다..
						System.out.println("정차중인 열차가 없습니다. ");
					}
					current_subway(종점역, 용산역, 서울역, 구로역);
				}

				if (ch == 3) {
					// 3. 서울역에 열차가 있다면, 서울역에서 구로역으로 (3에서 4로) 이동시킨다.
					if (!서울역.station.isEmpty()) {
						if (sw[ch - 1] = true) {
							time_thread.stop_train(sw[ch - 1]);
							time_thread.run();

							구로역.station.offer(서울역.station.poll());

						} else {
							System.out.println("통행이 불가능합니다. ");
							System.out.println("통행을 허용하시겠습니까? : (Y/N)");
							String pass = scanner.next();
							if (pass.equals("Y")) {
								System.out.println(ch + "번 구간 통행이 허용되었습니다. ");
								sw[ch - 1] = true;
							}
						}
					} else {
						// 1. 아무것도 없으니 지나갑니다..
						System.out.println("정차중인 열차가 없습니다. ");

					}
					current_subway(종점역, 용산역, 서울역, 구로역);
				}

				if (ch == 4) {
					// 3. 구로역에 열차가 있다면, 구로역에서 종점역으로 (4에서 1로) 이동시킨다.
					if (!구로역.station.isEmpty()) {
						if (sw[ch - 1] = true) {
							time_thread.stop_train(sw[ch - 1]);
							time_thread.run();

							종점역.station.offer(구로역.station.poll());

						} else {
							System.out.println("통행이 불가능합니다. ");
							System.out.println("통행을 허용하시겠습니까? : (Y/N)");
							String pass = scanner.next();
							if (pass.equals("Y")) {
								System.out.println(ch + "번 구간 통행이 허용되었습니다. ");
								sw[ch - 1] = true;
							}
						}

					} else {
						// 1. 아무것도 없으니 지나갑니다..
						System.out.println("정차중인 열차가 없습니다. ");

					}
					current_subway(종점역, 용산역, 서울역, 구로역);
				}
				if (ch == 5) {
					System.out.println("System shutting down ... ");
					run = false;
				}

			} catch (Exception e) {
				System.out.println("[에러발생] 관리자에게 문의바랍니다. ");
			}

		}

	}

	public static void current_subway(Station 종점역, Station 용산역, Station 서울역, Station 구로역) {

		System.out.print("종점역 : ");

		for (Subway s : 종점역.station) {
			System.out.print(s.toString() + " ");
		}
		System.out.println();

		System.out.print("용산역 : ");

		for (Subway s : 용산역.station) {
			System.out.print(s.toString() + " ");
		}
		System.out.println();

		System.out.print("서울역 : ");
		for (Subway s : 서울역.station) {
			System.out.print(s.toString() + " ");
		}
		System.out.println();

		System.out.print("구로역 : ");
		for (Subway s : 구로역.station) {
			System.out.print(s.toString() + " ");
		}
		System.out.println();

	}

}
