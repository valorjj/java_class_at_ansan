package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Song;

public class Customer extends Thread {

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 1. [필드]

	private String filepath_song_list = "D:\\jj_ansan_ezen\\console_backup\\src\\file\\song_list_info.txt";

	final int STAR_REP = 50; // 라인을 구분하기 위해 "*" 찍을 갯수

	public Scanner scanner = new Scanner(System.in);
	public ArrayList<String> sorted_by_item_customer = new ArrayList<>();
	public ArrayList<Song> revervation_list_customer = new ArrayList<>();

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 2. [생성자]

	public Customer() { // 빈 생성자

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 3. [메소드]

	// [고객] 곡 리스트를 출력하는 메소드입니다.
	public void customer_song() throws IOException {

		while (true) {

			try {
				star(STAR_REP);
				System.out.println("1. 발라드 | 2. 댄스 | 3. 힙합 | 4. 예약실행 | 5. 뒤로가기 ");
				star(STAR_REP);
				System.out.print("선택 : ");
				int ch1 = scanner.nextInt();
				star(STAR_REP);
				if (ch1 == 1) {
					ballad();
					System.out.println("1. 바로시작 2. 예약");
					int ch2 = scanner.nextInt();
					if (ch2 == 1) {
						Thread2 thread2 = new Thread2();
						thread2.start();
						thread2.join();

					} else if (ch2 == 2) {
						boolean run = true;
						while (run) {
							System.out.println("1. 예약 2. 뒤로가기");
							try {

								int ch3 = scanner.nextInt();

								if (ch3 == 1) {
									System.out.println("예약할 노래번호 : ");
									String user_input_songNumber = scanner.next();
									int user_input = Integer.parseInt(user_input_songNumber);
									sorted_by_item_customer.clear();

									txtfile_reader();
									for (String str : sorted_by_item_customer) {
										String[] tmp = str.split(",");
										if (str.contains(user_input_songNumber)) {
											revervation_list_customer.add(new Song(tmp[0], tmp[1], tmp[2], tmp[3]));
										}
									}
								} else if (ch3 == 2) {
									run = false;
								} else {
									System.err.println("[알림] 잘못입력하셨습니다. ");
								}
							} catch (Exception e) {
								scanner = new Scanner(System.in);
							}

						}
					}
				} else if (ch1 == 2) {
					dance();
					System.out.println("1. 바로시작 2. 예약");
					int ch2 = scanner.nextInt();
					if (ch2 == 1) {
						Thread2 thread2 = new Thread2();
						thread2.start();
						thread2.join();
					} else if (ch2 == 2) {
						boolean run = true;

						while (run) {

							System.out.println("1. 예약 2. 뒤로가기");

							try {

								int ch3 = scanner.nextInt();

								if (ch3 == 1) {
									System.out.println("예약할 노래번호 : ");
									String user_input_songNumber = scanner.next();
									int user_input = Integer.parseInt(user_input_songNumber);
									sorted_by_item_customer.clear();

									txtfile_reader();
									for (String str : sorted_by_item_customer) {
										String[] tmp = str.split(",");
										if (str.contains(user_input_songNumber)) {
											revervation_list_customer.add(new Song(tmp[0], tmp[1], tmp[2], tmp[3]));
										}
									}
								} else if (ch3 == 2) {
									run = false;
								} else {
									System.err.println("[알림] 잘못입력하셨습니다. ");
								}
							} catch (Exception e) {
								scanner = new Scanner(System.in);
							}
						}
					}
				} else if (ch1 == 3) {
					hiphop();
					System.out.println("1. 바로시작 2. 예약");
					int ch2 = scanner.nextInt();
					if (ch2 == 1) {
						Thread2 thread2 = new Thread2();
						thread2.start();
						thread2.join();
					} else if (ch2 == 2) {
						boolean run = true;
						while (run) {
							System.out.println("1. 예약 2. 뒤로가기");
							try {
								int ch3 = scanner.nextInt();
								if (ch3 == 1) {
									System.out.println("예약할 노래번호 : ");
									String user_input_songNumber = scanner.next();
									int user_input = Integer.parseInt(user_input_songNumber);
									sorted_by_item_customer.clear();

									txtfile_reader();
									for (String str : sorted_by_item_customer) {
										String[] tmp = str.split(",");
										if (str.contains(user_input_songNumber)) {
											revervation_list_customer.add(new Song(tmp[0], tmp[1], tmp[2], tmp[3]));
										}
									}
								} else if (ch3 == 2) {
									run = false;
								} else {
									System.err.println("[에러] 잘못입력하셨습니다. ");
								}
							} catch (Exception e) {
								scanner = new Scanner(System.in);
							}
						}
					}
				} else if (ch1 == 4) {
					// 예약한 노래를 실행하는 화면입니다.
					System.out.println("예약 목록 : ");

					for (Song song1 : revervation_list_customer) {
						System.out.println(song1.getNumber() + " | " + song1.getTitle() + " | " + song1.getSinger());
					}
					Thread2 thread2 = new Thread2();
					thread2.start();
					thread2.join();

				} else if (ch1 == 5) {
					return;
				}

				else {
					System.err.println("[알림] 유효하지 않은 입력입니다. ");
				}

			} catch (Exception e) {
				star(STAR_REP);
				System.err.println("[알림] 관리자에게 문의하세요. " + e);
				star(STAR_REP);
			}

		}

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 발라드 1번 ~ 10번 까지의 노래 이름, 가수 를 출력합니다.
	public void ballad() throws IOException, InterruptedException {

		// 1. [고객] 이 발라드를 선택했습니다.
		// 1. song_list_info.txt 파일을 읽고 sorted_by_item_customer 리스트에 저장합니다.
		// 1. 리스트에 저장하는 이유 :
		// 1. 출력할 때 원하는 값만 탐색해서 출력하기 위해서

		txtfile_reader();

		for (String string : sorted_by_item_customer) {
			// k 는 sorted_by_item_customer 안에 들어있는 String 인스턴스입니다.
			// k 안에는 제목,가수,예약번호,카테고리 가 있습니다.
			String[] tmp = string.split(",");
			// tmp = { 제목, 가수, 예약번호, 카테고리 };
			// tmp 안에서 3번째, 즉 인덱스2에 있는 예약번호가 '1' 으로 시작하는지 검사합니다.
			if (Integer.parseInt(tmp[2]) / 1000 == 1) {
				// 1로 시작하는 노래, 즉 발라드 카테고리에 있다는게 확인된 것 입니다.
				// 이제 이 if 문 안에서는 발라드 노래 목록을 전부 출력합니다.
				System.out.print("제목 : " + tmp[0] + " | ");
				System.out.print("가수 : " + tmp[1] + " | ");
				System.out.println("예약번호 : " + tmp[2]);
			}
		}
		System.out.println();

		// 곡 목록을 출력하고, 그 다음에 선택을 받습니다.
		star(STAR_REP);

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 댄스 1번 ~ 10번 까지의 노래 이름, 가수 를 출력합니다.
	public void dance() throws IOException, InterruptedException {

		txtfile_reader();

		for (String k : sorted_by_item_customer) {
			// k 는 sorted_by_item_customer 안에 들어있는 String 인스턴스입니다.
			// k 안에는 제목,가수,예약번호,카테고리 가 있습니다.
			String[] tmp = k.split(",");

			// tmp 안에서 3번째, 즉 인덱스2에 있는 예약번호가 '2' 으로 시작하는지 검사합니다.
			if (Integer.parseInt(tmp[2]) / 1000 == 2) {
				// 나누어 떨어진다면 1로 시작하는 노래, 즉 댄스 카테고리에 있다는게 확인된 것 입니다.
				// 이제 이 if 문 안에서는 댄스 노래 목록을 전부 출력합니다.
				System.out.print("제목 : " + tmp[0] + " | ");
				System.out.print("가수 : " + tmp[1] + " | ");
				System.out.println("예약번호 : " + tmp[2]);
			}
		}
		System.out.println();

		// 곡 목록을 출력하고, 그 다음에 선택을 받습니다.
		star(STAR_REP);

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 힙합 1번 ~ 10번 까지의 노래 이름, 가수 를 출력합니다.
	public void hiphop() throws IOException, InterruptedException {

		txtfile_reader();

		for (String k : sorted_by_item_customer) {
			// k 는 sorted_by_item_customer 안에 들어있는 String 인스턴스입니다.
			// k 안에는 제목,가수,예약번호,카테고리 가 있습니다.
			String[] tmp = k.split(",");

			// tmp 안에서 3번째, 즉 인덱스2에 있는 예약번호가 '3' 으로 시작하는지 검사합니다.
			if (Integer.parseInt(tmp[2]) / 1000 == 3) {
				// 나누어 떨어진다면 1로 시작하는 노래, 즉 발라드 카테고리에 있다는게 확인된 것 입니다.
				// 이제 이 if 문 안에서는 발라드 노래 목록을 전부 출력합니다.
				System.out.print("제목 : " + tmp[0] + " | ");
				System.out.print("가수 : " + tmp[1] + " | ");
				System.out.println("예약번호 : " + tmp[2]);
			}
		}
		System.out.println();

		// 곡 목록을 출력하고, 그 다음에 선택을 받습니다.
		star(STAR_REP);

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// txt 파일을 읽어서 sorted_by_item_customer 리스트에 저장합니다.
	// [고객] 의 선택을 인수로 받아서 예약번호에 해당하는 곡을 출력하기 위함입니다.
	public void txtfile_reader() throws IOException {

		FileInputStream fis;

		fis = new FileInputStream(filepath_song_list);
		// filepath_song_list 이 파일안에 있는 바이트 갯수만큼만 size 에 저장한다.
		int size = fis.available();
		byte[] bytelist = new byte[size];
		fis.read(bytelist);

		String readStr = new String(bytelist);

		String[] tmplist = readStr.split("\n");
		for (String str : tmplist) {
			sorted_by_item_customer.add(str);
		}

		fis.close();

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void star(int STAR_REP) {
		for (int i = 0; i < STAR_REP; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
