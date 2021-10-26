package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import application.Main;
import model.Lyrics;
import model.Song;

public class Manager extends Main {

	private String filepath_ballad = "D:/jj_ansan_ezen/console_backup/src/file/ballad_lyrics.txt";
	private String filepath_dance = "D:/jj_ansan_ezen/console_backup/src/file/dance_lyrics.txt";
	private String filepath_hiphop = "D:/jj_ansan_ezen/console_backup/src/file/hiphop_lyrics.txt";
	private String filepath_song_list = "D:/jj_ansan_ezen/console_backup/src/file/song_list_info.txt";

	// 미리 입력 된 매니저 아이디 / 패스워드
	private String manager_id = "admin";
	private String manager_pw = "1234";

	public Scanner scanner;

	public ArrayList<ArrayList<Lyrics>> list_manager = new ArrayList<>();
	// 첫번째 - 발라드, 두번째 - 댄스, 세번째 - 힙합

	public ArrayList<Song> song_manager = new ArrayList<>();

	public ArrayList<Lyrics> lyrics_list_manager_ballad = new ArrayList<Lyrics>();
	public ArrayList<Lyrics> lyrics_list_manager_dance = new ArrayList<Lyrics>();
	public ArrayList<Lyrics> lyrics_list_manager_hiphop = new ArrayList<Lyrics>();

	final int STAR_REP = 50; // 라인을 구분하기 위해 "*" 찍을 갯수

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 하는일 : 메인 메소드에서 실행될 관리자 메뉴를 출력하는 메소드입니다.
	@Override
	public void data_input() {

		try {
			scanner = new Scanner(System.in);
			if (manager_login()) {

				star(STAR_REP);
				System.out.println("1. 곡 정보 수정 2. 로그아웃");
				star(STAR_REP);
				System.out.print("선택 : ");
				int ch = scanner.nextInt();
				if (ch == 1) {
					// 하는일 : 곡 목록(제목,가수,번호,장르) 를 수정합니다.
					manager_song_edit_mode();
				} else if (ch == 2) {
					// 로그아웃
					return;
				} else {
					star(STAR_REP);
					System.out.println("[유효하지 않은 입력입니다]");
					star(STAR_REP);
				}
			} else {
				star(STAR_REP);
				System.err.println("[관리자 로그인 실패]");
			}

		} catch (Exception e) {
			star(STAR_REP);
			System.err.println("[에러]" + e);
			star(STAR_REP);
		}

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 하는일 : 곡 정보를 등록 및 삭제하는 메소드입니다.

	public void manager_song_edit_mode() throws IOException {
		try {
			boolean run = true;
			while (run) {
				// 구분 : while 문을 돌면서 메뉴를 출력합니다.
				star(STAR_REP);
				System.out.print("1. 추가 | 2. 삭제 | 3. 로그아웃 : ");
				try {

					//////////////////////////////////////////////////////////////////////////////////////////////////////
					int ch1 = scanner.nextInt();
					if (ch1 == 1) {
						reader_song_list();
						star(STAR_REP);
						System.out.println("[분류] 발라드=1000, 댄스=2000, 힙합=3000");
						star(STAR_REP);
						System.out.print(" 제목 : ");
						String title = scanner.next();
						System.out.print(" 가수 : ");
						String singer = scanner.next();
						System.out.print(" 예약번호 : ");
						String SN = scanner.next();
						System.out.print(" 장르 : ");
						String category = scanner.next();
						scanner.nextLine();
						String newStr = title + "," + singer + "," + SN + "," + category + "\n";

						int idx = Integer.parseInt(SN) / 1000;

						song_add_singleString(newStr); // txt 파일에 newStr 을 쓴다.

						// 근데 여기서 데이터 중복이 발생되는거 아닌가???????

						reader_song_list(); // 데이터가 추가된 txt 파일을 다시 객체로 불러온다.
						song_list_update(); // 객체를 정렬한다.
						song_add_ArrayList(song_manager); // 정렬된 객체를 txt 파일로 넘긴다.
						song_manager.clear();

						////////////////////////////////////////////////////////////////////////////////////////////////////

						if (idx == 1) {
							// 발라드 가사 저장
							reader_lyrics_ballad();
							star(STAR_REP);
							System.out.print("가사를 입력하세요 : ");
							String lyrics = scanner.nextLine();
							String str_ballad = SN + "&\n" + lyrics + "\n%\n";

							lyrics_add_ballad(str_ballad);
							reader_lyrics_ballad();
							lyrics_list_update_ballad();
							lyrics_add_ballad_ArrayList(lyrics_list_manager_ballad);
							lyrics_list_manager_ballad.clear();

						} else if (idx == 2) {
							// 댄스 가사 저장
							reader_lyrics_dance();
							star(STAR_REP);
							System.out.print("가사를 입력하세요 : ");
							String lyrics = scanner.nextLine();
							String str_dance = SN + "&\n" + lyrics + "\n%\n";

							lyrics_add_dance(str_dance);
							reader_lyrics_dance();
							lyrics_list_update_dance();
							lyrics_add_dance_ArrayList(lyrics_list_manager_dance);
							lyrics_list_manager_dance.clear();

						} else if (idx == 3) {
							// 힙합 가사 저장
							reader_lyrics_hiphop();
							star(STAR_REP);
							System.out.print("가사를 입력하세요 : ");
							String lyrics = scanner.nextLine();
							String str_hiphop = SN + "&\n" + lyrics + "\n%\n";

							lyrics_add_hiphop(str_hiphop);
							reader_lyrics_dance();
							lyrics_list_update_hiphop();
							lyrics_add_hiphop_ArrayList(lyrics_list_manager_hiphop);
							lyrics_list_manager_hiphop.clear();

						}

						/////////////////////////////////////////////////////////////////////////////////////////////////////

					} else if (ch1 == 2) {

						// 곡 정보를 삭제합니다.
						reader_song_list(); // txt 파일을 song_list 객체로 옮겨담습니다.

						star(STAR_REP);
						print_list_ballad();
						print_list_dance();
						print_list_hiphop();
						star(STAR_REP);

						reader_lyrics_ballad();
						System.out.println("발라드 가사 사이즈 : " + lyrics_list_manager_ballad.size());
						reader_lyrics_dance();
						System.out.println(" 댄스 가사 사이즈 : " + lyrics_list_manager_dance.size());
						reader_lyrics_hiphop();
						System.out.println("힙합 가사 사이즈 : " + lyrics_list_manager_hiphop.size());

						System.out.print("삭제할 곡 번호 : ");

						int remove_number = scanner.nextInt();

						// 해당하는 번호를 검색해서, 삭제시킵니다.

						song_delete(remove_number); // song_manager 리스트에서 해당 원소를 제거시킵니다.
						song_list_update();
						song_add_ArrayList(song_manager);
						song_manager.clear();

						// 가사 삭제

						int idx = remove_number / 1000;

						if (idx == 1) {
							System.out.println("인덱스1 분류 통과 ");
							// reader_lyrics_ballad(); // txt 파일의 데이터를 list 인스턴스로 옮깁니다.
							System.out.println("파일 읽기 통과 ");
							lyrics_ballad_delete(remove_number); // 고객이 입력한 값을 인수로 전달받아서 list 에서 remove 시킵니다.
							System.out.println("파일 삭제 통과 ");
							lyrics_list_update_ballad(); // remove 된 list 를 정렬합니다.
							System.out.println("파일 읽기 2 통과 ");
							lyrics_add_ballad_ArrayList(lyrics_list_manager_ballad);
							System.out.println("파일 업데이트 통과 ");
							lyrics_list_manager_ballad.clear();

						} else if (idx == 2) {
							// reader_lyrics_dance();
							lyrics_dance_delete(remove_number);
							lyrics_list_update_dance();
							lyrics_add_dance_ArrayList(lyrics_list_manager_dance);
							lyrics_list_manager_dance.clear();
						} else if (idx == 3) {
							// reader_lyrics_hiphop();
							lyrics_hiphop_delete(remove_number);
							lyrics_list_update_hiphop();
							lyrics_add_hiphop_ArrayList(lyrics_list_manager_hiphop);
							lyrics_list_manager_hiphop.clear();
						}

					}

					else if (ch1 == 3) {
						// 프로그램을 종료합니다.
						System.out.println("[관리자] 로그아웃");
						star(STAR_REP);
						break;

					} else {
						star(STAR_REP);
						System.err.println("[유효한 입력이 아닙니다]");

					}

				} catch (Exception e) {
					System.err.println("[알림] 관리자에게 문의하세요. " + e);
					scanner = new Scanner(System.in);
				}

			}

		} catch (Exception e) {
			star(STAR_REP);
			System.err.println("[알림] 관리자에게 문의하세요. " + e);
			star(STAR_REP);

		}

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 인수 : 없음
	// 하는일 : 관리자 여부를 체크하는 메소드입니다.
	private boolean manager_login() {

		try {
			scanner = new Scanner(System.in);
			star(STAR_REP);
			System.out.print("[관리자 권한] id : ");
			String id = scanner.next();
			star(STAR_REP);
			System.out.print("[관리자 권한] password : ");
			String pw = scanner.next();

			if (id.equals(manager_id) && pw.equals(manager_pw)) {
				System.out.println("[관리자] 로그인 성공");
				star(STAR_REP);
				return true;
			}
		} catch (Exception e) {
			System.out.println("[알림] 오류 발생 " + e);
			star(STAR_REP);

		}
		return false;

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void reader_song_list() throws IOException {
		FileInputStream fis;
		fis = new FileInputStream(filepath_song_list);

		int size = fis.available();
		byte[] bytelist = new byte[size];
		fis.read(bytelist);

		String readStr = new String(bytelist);

		String[] tmplist = readStr.split("\n");
		for (String str : tmplist) {
			if (!str.equals(" ")) {
				String[] tmp = str.split(",");
				song_manager.add(new Song(tmp[0], tmp[1], tmp[2], tmp[3]));
			}
		}
		fis.close();
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void song_add_ArrayList(ArrayList<Song> list) throws Exception {
		FileOutputStream fos;

		String str = "";
		for (Song song : list) {
			str += song.getTitle() + "," + song.getSinger() + "," + song.getNumber() + "," + song.getCategory() + "\n";
		}
		fos = new FileOutputStream(filepath_song_list);
		fos.write(str.getBytes());

		fos.flush();
		fos.close();

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 인수 : String str
	// 하는일 : String 으로 입력된 데이터 (txt 파일에서 1줄) 을 filepath_song_list 에 추가합니다.
	public void song_add_singleString(String str) throws IOException {
		FileOutputStream fos;
		fos = new FileOutputStream(filepath_song_list);
		fos.write(str.getBytes());
		fos.flush();
		fos.close();

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 라인 구분을 위해 별을 찍습니다.

	public void star(int STAR_REP) {
		for (int i = 0; i < STAR_REP; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 발라드 목록을 출력합니다.

	public void print_list_ballad() {
		try {
			for (Song song : song_manager) {
				if (song.getCategory().equals("발라드")) {
					System.out.print("제목 : " + song.getTitle() + " | ");
					System.out.print("가수 : " + song.getSinger() + " | ");
					System.out.println("예약번호 : " + song.getNumber());
				}

			}
		} catch (Exception e) {
		}
	}

	// 댄스 목록을 출력합니다.
	public void print_list_dance() {
		try {
			for (Song song : song_manager) {
				if (song.getCategory().equals("댄스")) {
					System.out.print("제목 : " + song.getTitle() + " | ");
					System.out.print("가수 : " + song.getSinger() + " | ");
					System.out.println("예약번호 : " + song.getNumber());
				}
			}
		} catch (Exception e) {
		}
	}

	// 힙합 목록을 출력합니다.
	public void print_list_hiphop() {
		try {
			for (Song song : song_manager) {
				if (song.getCategory().equals("힙합")) {
					System.out.print("제목 : " + song.getTitle() + " | ");
					System.out.print("가수 : " + song.getSinger() + " | ");
					System.out.println("예약번호 : " + song.getNumber());
				}
			}
		} catch (Exception e) {
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////

	// 하는일 : 발라드 가사를 저장하는 메소드입니다.

	public void reader_lyrics_ballad() throws IOException {
		FileInputStream fis_b;
		fis_b = new FileInputStream(filepath_ballad);

		int size = fis_b.available();
		byte[] bytelist = new byte[size];
		fis_b.read(bytelist);

		String readStr = new String(bytelist);

		String[] tmplist_by_song = readStr.split("\n%\n");
		for (String str : tmplist_by_song) {
			if (!str.equals(" ")) {
				String[] tmplist_sorted_by_lyric = str.split("&\n");
				String lyrics = tmplist_sorted_by_lyric[1];
				int song_number = Integer.parseInt(tmplist_sorted_by_lyric[0]);
				lyrics_list_manager_ballad.add(new Lyrics(lyrics, song_number));
			}
		}
		fis_b.close();
	}

	public void reader_lyrics_dance() throws IOException {
		// 인풋스트림
		FileInputStream fis_d;
		fis_d = new FileInputStream(filepath_dance);

		int size = fis_d.available();
		byte[] bytelist = new byte[size];
		fis_d.read(bytelist);

		// 파일 읽기

		// 읽어온 파일을 String 에 저장
		String readStr = new String(bytelist);
		// String 파일을 split 해서 리스트에 저장
		String[] tmplist_by_song = readStr.split("\n%\n");
		for (String str : tmplist_by_song) {
			if (!str.equals(" ")) {
				String[] tmplist_sorted_by_lyric = str.split("&\n");
				int song_number = Integer.parseInt(tmplist_sorted_by_lyric[0]);
				String lyrics = tmplist_sorted_by_lyric[1];
				lyrics_list_manager_dance.add(new Lyrics(lyrics, song_number));
			}

		}

		fis_d.close();
	}

	public void reader_lyrics_hiphop() throws IOException {
		FileInputStream fis_h;

		fis_h = new FileInputStream(filepath_hiphop);

		int size = fis_h.available();
		byte[] bytelist = new byte[size];
		fis_h.read(bytelist);

		String readStr = new String(bytelist);

		String[] tmplist_by_song = readStr.split("\n%\n");
		for (String str : tmplist_by_song) {
			String[] tmplist_sorted_by_lyric = str.split("&\n");
			int song_number = Integer.parseInt(tmplist_sorted_by_lyric[0]);
			String lyrics = tmplist_sorted_by_lyric[1];
			lyrics_list_manager_hiphop.add(new Lyrics(lyrics, song_number));
		}
		fis_h.close();
	}

	public void lyrics_add_ballad(String str) throws IOException {
		FileOutputStream fos;
		fos = new FileOutputStream(filepath_ballad);
		fos.write(str.getBytes());
		fos.flush();
		fos.close();
	}

	public void lyrics_add_dance(String str) throws IOException {
		FileOutputStream fos;
		fos = new FileOutputStream(filepath_dance);
		fos.write(str.getBytes());
		fos.flush();
		fos.close();
	}

	public void lyrics_add_hiphop(String str) throws IOException {
		FileOutputStream fos;
		fos = new FileOutputStream(filepath_hiphop);
		fos.write(str.getBytes());
		fos.flush();
		fos.close();
	}

	public void song_list_update() {
		Collections.sort(song_manager, new Comparator<Song>() {
			@Override
			public int compare(Song o1, Song o2) {
				int a = Integer.parseInt(o1.getNumber());
				int b = Integer.parseInt(o2.getNumber());
				return a - b;
			}
		});
	}

	public void lyrics_list_update_ballad() {
		Collections.sort(lyrics_list_manager_ballad, new Comparator<Lyrics>() {
			@Override
			public int compare(Lyrics o1, Lyrics o2) {
				return o1.getNumber() - o2.getNumber();
			}
		});
	}

	public void lyrics_list_update_dance() {
		Collections.sort(lyrics_list_manager_dance, new Comparator<Lyrics>() {
			@Override
			public int compare(Lyrics o1, Lyrics o2) {
				return o1.getNumber() - o2.getNumber();
			}
		});
	}

	public void lyrics_list_update_hiphop() {
		Collections.sort(lyrics_list_manager_hiphop, new Comparator<Lyrics>() {
			@Override
			public int compare(Lyrics o1, Lyrics o2) {
				return o1.getNumber() - o2.getNumber();
			}

		});

	}

	public void lyrics_add_ballad_ArrayList(ArrayList<Lyrics> ballad_list) throws IOException {
		FileOutputStream fos_ballad;
		String str = "";
		for (Lyrics lyric : ballad_list) {
			str += lyric.getNumber() + "&\n" + lyric.getLyrics() + "\n%\n";
		}
		fos_ballad = new FileOutputStream(filepath_ballad);
		fos_ballad.write(str.getBytes());
		fos_ballad.flush();
		fos_ballad.close();

	}

	public void lyrics_add_dance_ArrayList(ArrayList<Lyrics> dance_list) throws IOException {
		FileOutputStream fos_ballad;

		String str = "";
		for (Lyrics lyric : dance_list) {
			str += lyric.getNumber() + "&\n" + lyric.getLyrics() + "\n%\n";
		}
		fos_ballad = new FileOutputStream(filepath_ballad);
		fos_ballad.write(str.getBytes());
		fos_ballad.flush();
		fos_ballad.close();

	}

	public void lyrics_add_hiphop_ArrayList(ArrayList<Lyrics> hiphop_list) throws IOException {
		FileOutputStream fos_ballad;

		String str = "";
		for (Lyrics lyric : hiphop_list) {
			str += lyric.getNumber() + "&\n" + lyric.getLyrics() + "\n%\n";
		}
		fos_ballad = new FileOutputStream(filepath_ballad);
		fos_ballad.write(str.getBytes());
		fos_ballad.flush();
		fos_ballad.close();

	}

	public void song_delete(int user_input_number) {
		// 예약 번호를 인수로 넘겨받아서 지우는 메소드입니다.

		for (Song song : song_manager) {
			if (Integer.parseInt(song.getNumber()) == user_input_number) {
				// 해당 번호가 일치하는 것이 존재하면,
				int idx = song_manager.indexOf(song);
				song_manager.remove(idx);
				break;
			} else {
				System.err.println("[알림] 해당하는 곡이 존재하지 않습니다. ");
			}
		}
	}

	public void lyrics_ballad_delete(int user_input_number) {
		// 예약 번호를 인수로 받아서 해당 원소를 지웁니다.
		for (Lyrics lyric : lyrics_list_manager_ballad) {
			if (lyric.getNumber() == user_input_number) {
				int idx = lyrics_list_manager_ballad.indexOf(lyric);
				lyrics_list_manager_ballad.remove(idx);
				break;
			} else {
				System.err.println("[알림] 해당하는 곡이 존재하지 않습니다. ");
			}
		}
	}

	public void lyrics_dance_delete(int user_input_number) {
		for (Lyrics lyric : lyrics_list_manager_dance) {
			if (lyric.getNumber() == user_input_number) {
				int idx = lyrics_list_manager_dance.indexOf(lyric);
				lyrics_list_manager_dance.remove(idx);
				break;
			} else {
				System.err.println("[알림] 해당하는 곡이 존재하지 않습니다. ");
			}

		}

	}

	public void lyrics_hiphop_delete(int user_input_number) {
		for (Lyrics lyric : lyrics_list_manager_hiphop) {
			if (lyric.getNumber() == user_input_number) {
				int idx = lyrics_list_manager_hiphop.indexOf(lyric);
				lyrics_list_manager_hiphop.remove(idx);
				break;
			} else {
				System.err.println("[알림] 해당하는 곡이 존재하지 않습니다. ");
			}

		}
	}

}
