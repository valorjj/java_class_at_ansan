package Day04;

import java.util.Scanner;

/*키오스크 프로그램 */

public class Day04_3 {

	static String[] menu = { "콜라", "환타", "사이다" };
	static int[] price = { 300, 200, 300 };
	static int[] init_stock = { 10, 10, 10 };

	public static void main(String[] args) {

		// console용 키오스크 [자판기]
		// 1. 메뉴판[ 1.콜라[300] 2.환타[200] 3. 사이다[300] 4. 결제 ]
		// 메뉴판 아래에 선택한 제품들 목록 [ 제품 수량 / 총 결제 예정 금액 ]
		// 2. 초기 재고 [ 10개씩 ] 팔렸을 때 재고 감소 // 재고가 없으면 구매 불가
		// 3. 금액을 입력받아서 결제액만큼 차감 후 잔돈 출력 => 부족하면
		boolean run = true;

		Scanner sc = new Scanner(System.in);

		int moneyToPay = 0;
		int moneyInserted = 0;
		boolean willingToPay = true;

		int[] temp_stock = { 0, 0, 0 }; // 결제가 취소됐을 경우 다시 재고를 채우기 위한 배열입니다.

		// 이것도 run 할지말지 선택할 수 있게해야 한다.
		// 어떻게 짜느냐에 따라서 달라지는 것 같아.
		// while 문을 3개를 써야 와리가리가 가능해지는 듯. 특히 이렇게 선택이 많은 경우에는
		while (run) {
			System.out.println("메인 메뉴를 출력하시겠습니까? y/n");
			String isMain = sc.next();
			if (isMain.equals("y")) {
				while (willingToPay) {
					// 메뉴를 출력하는 화면입니다.
					for (int i = 0; i < menu.length; i++) {
						if (init_stock[i] != 0) {
							System.out.print(menu[i] + "(" + price[i] + ")원, " + init_stock[i] + "개 남았습니다. ");
							System.out.println("");
						} else if (init_stock[i] == 0) {
							System.out.print(menu[i] + "는 품절입니다. 죄송합니다. ");
							System.out.println("");
						}
					}

					System.out.print("1번부터 3번 중, 어떤 메뉴를 고르시겠습니까 >>> ");
					int userInput = sc.nextInt();
					if (userInput >= 1 && userInput <= 4) {

					} else {
						System.out.println("잘못된 접근입니다. ");
						break;
					}

					switch (userInput) { // 스위치문을 이용해 사용자의 입력에 따라 결과를 출력합니다.

					case 1: // 콜라를 골랐을 경우
						System.out.println("콜라를 고르셨습니다. ");
						if (init_stock[userInput - 1] >= 1) {
							init_stock[userInput - 1] = init_stock[userInput - 1] - 1;
							temp_stock[userInput - 1]++;
							if (init_stock[userInput - 1] == 0) {
								System.out.println("콜라는 품절입니다. ");
							} else {
								System.out.println("콜라는 " + init_stock[userInput - 1] + "개 남았습니다. ");
								moneyToPay += 300;
							}

						} else {
							System.out.println("콜라는 품절입니다. ");
						}

						break;

					case 2: // 환타를 골랐을 경우
						System.out.println("환타를 고르셨습니다. ");
						if (init_stock[userInput - 1] >= 1) {
							init_stock[userInput - 1] = init_stock[userInput - 1] - 1;
							temp_stock[userInput - 1]++;
							if (init_stock[userInput - 1] == 0) {
								System.out.println("환타는 품절입니다. ");
							}
						} else {
							System.out.println("환타는 품절입니다. ");
						}
						System.out.println("환타는 " + init_stock[userInput - 1] + "개 남았습니다. ");
						moneyToPay += 200;
						break;

					case 3: // 사이다를 골랐을 경우
						System.out.println("사이다를 고르셨습니다. ");
						if (init_stock[userInput - 1] >= 1) {
							init_stock[userInput - 1] = init_stock[userInput - 1] - 1;
							temp_stock[userInput - 1]++;
							if (init_stock[userInput - 1] == 0) {
								System.out.println("사이다는 품절입니다. ");
							}
						} else {
							System.out.println("사이다는 품절입니다. ");
						}
						System.out.println("사이다는 " + init_stock[userInput - 1] + "개 남았습니다. ");
						moneyToPay += 300;
						break;

					case 4: // 결제 창을 띄운다.

						System.out.print("결제를 진행하시겠습니까? (y/n) >>>");
						String proceed = sc.next();

						if (proceed.equals("y")) {
							if (init_stock[0] == 0 && init_stock[1] == 0 && init_stock[2] == 0) {
								System.out.println("죄송합니다. 모두 품절입니다. "); // 품절이라고 출력하고 최외각 반복문 종료
								run = false;
							} else {
								System.out.println("결제창입니다. ");
								System.out.println("총 지불하실 금액은 " + moneyToPay + " 입니다. ");
								System.out.print("금액을 입금하여주시길 바랍니다 >>>");
								moneyInserted = sc.nextInt();
								System.out.println("입금된 금액은 " + moneyInserted + " 입니다. ");
								if (moneyToPay > moneyInserted) { // 입금금액이 부족한 경우 추가적으로 금액을 넣을건지 물어본다.
									System.out.print("금액이 부족합니다. 금액을 더 넣으시겠습니까 ? (y/n)");
									String ch = sc.next();
									if (ch.equals("y")) { // 만약에 돈을 더 넣는다고 하면
										System.out.println("얼마를 더 넣으시겠습니까? ");
										System.out.print("추가 금액 >>>");
										int moneyExtra = sc.nextInt();
										moneyInserted += moneyExtra; // 추가 금액을 이전 금액에 더해준다.
										if (moneyInserted > moneyToPay) { // 총 금액이 지불 금액보다 크다면 결제를 진행한다.
											moneyInserted -= moneyToPay; // 잔돈을 빼주고
											System.out.println("지불하실 금액은 " + moneyToPay + " 입니다. ");
											System.out.println("잔돈은 " + moneyInserted + " 입니다. ");
											for (int i = 0; i < temp_stock.length; i++) { // 몇개를 주문했는지 출력해준다.
												System.out.println(menu[i] + "는 " + temp_stock[i] + "개 주문하셨습니다. ");
											}
											willingToPay = false;
											run = false; // 결제가 끝났으니 최외각 루프를 종료시킨다.
										} else {
											System.out.println("금액이 부족합니다. 처음부터 다시 진행해주세요. "); // 한번 더 물어본 경우에도 금액이
																								// 부족하다면 결제 의지가 없다고 생각하고
																								// 종료시킨다.
											willingToPay = false;

											run = false;
										}
									}
								} else {
									if (willingToPay) { // 금액이 충분하다면 바로 결제를 진행한다.
										moneyInserted -= moneyToPay; // 잔돈을 구하고
										System.out.println("지불하실 금액은 " + moneyToPay + " 입니다. ");
										System.out.println("잔돈은 " + moneyInserted + " 입니다. ");
										for (int i = 0; i < temp_stock.length; i++) {
											System.out.println(menu[i] + "는 " + temp_stock[i] + "개 주문하셨습니다. ");
										}
										willingToPay = false;
										run = false;

									}
								}

							}
						} else {

							// 결제를 취소한다.
							// 재고를 다시 채워놔야함.
							// 다시 첫 화면으로 돌아가야함.
							System.out.println("결제가 취소되었습니다. ");
							for (int i = 0; i < menu.length; i++) {
								init_stock[i] += temp_stock[i];
							}
							willingToPay = false;
						}
						break;

					default:
						System.out.println("잘못된 접근입니다. ");
						willingToPay = false;

					}

					System.out.println("");

				}

			} else {
				run = false;
			}

		}

	}

}
