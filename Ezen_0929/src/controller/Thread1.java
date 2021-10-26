package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Lyrics;

public class Thread1 implements Runnable {

	public boolean stop;
	public boolean work = true;

	// Thread1 을 멈추는 메소드
	public void stopThread() {
		this.stop = true;
	}

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	Scanner scanner = new Scanner(System.in);

	public ArrayList<Lyrics> lyric_list_thread = new ArrayList<>();

	private String filepath_ballad = "D:\\jj_ansan_ezen\\console_backup\\src\\file\\ballad_lyrics.txt";
	private String filepath_dance = "D:\\jj_ansan_ezen\\console_backup\\src\\file\\dance_lyrics.txt";
	private String filepath_hiphop = "D:\\jj_ansan_ezen\\console_backup\\src\\file\\hiphop_lyrics.txt";

	private final int STEP = 1000;

	@Override
	public void run() {

		while (!stop) {

			try {

				System.out.println("[알림] 예약번호 : ");

				int customer_song_choice = scanner.nextInt(); // 예약번호

				int idx = customer_song_choice / 1000; // 카테고리 번호

				if (idx == 1) {

					// 발라드 가사 목록을 출력합니다.
					txtfile_reader_ballad();

					for (Lyrics lyrics : lyric_list_thread) {
						if (lyrics.getNumber() == customer_song_choice) {
							String[] lyrics_print = lyrics.getLyrics().split("\n");

							while (!stop) {
								for (String single_line : lyrics_print) {
									if (work) {
										System.out.println(single_line);
										Thread.sleep(STEP);
									} else {
										Thread.yield();
									}
								}
							}
						} else {
							// System.out.println("[알림] 곡 정보가 존재하지 않습니다. ");

						}
					}
				}

				if (idx == 2) {
					// 댄스 가사 목록을 출력합니다.
					txtfile_reader_dance();

					for (Lyrics lyrics : lyric_list_thread) {
						if (lyrics.getNumber() == customer_song_choice) {
							String[] lyrics_print = lyrics.getLyrics().split("\n");
							while (!stop) {
								for (String single_line : lyrics_print) {
									if (work) {
										System.out.println(single_line);
										Thread.sleep(STEP);
									} else {
										Thread.yield();
									}
								}
							}
						} else {
							// System.out.println("[알림] 곡 정보가 존재하지 않습니다. ");
						}
					}
				}

				if (idx == 3) {
					// 힙합 가사 목록을 출력합니다.
					txtfile_reader_hiphop();

					for (Lyrics lyrics : lyric_list_thread) {
						if (lyrics.getNumber() == customer_song_choice) {
							String[] lyrics_print = lyrics.getLyrics().split("\n");

							while (!stop) {
								for (String single_line : lyrics_print) {
									if (work) {
										System.out.println(single_line);
										Thread.sleep(STEP);
									} else {
										Thread.yield();
									}
								}
							}
						} else {
							// System.out.println("[알림] 곡 정보가 존재하지 않습니다. ");
						}
					}
				}

			} catch (Exception e) {
				scanner = new Scanner(System.in);
				System.err.println("[알림] 유효한 입력이 아닙니다. " + e);
			}
		}
	}

	public void txtfile_reader_ballad() throws IOException, InterruptedException {

		FileInputStream fis;

		fis = new FileInputStream(filepath_ballad);

		int size = fis.available();
		byte[] bytelist = new byte[size];
		fis.read(bytelist);

		String readStr = new String(bytelist);

		String[] tmplist_sorted_by_song = readStr.split("\n%\n");
		for (String str : tmplist_sorted_by_song) {
			String[] tmplist_sorted_by_lyric = str.split("&\n");
			int song_number = Integer.parseInt(tmplist_sorted_by_lyric[0]);
			String lyrics = tmplist_sorted_by_lyric[1];
			lyric_list_thread.add(new Lyrics(lyrics, song_number));

		}

		fis.close();

	}

	public void txtfile_reader_dance() throws IOException, InterruptedException {

		FileInputStream fis;

		fis = new FileInputStream(filepath_dance);

		int size = fis.available();
		byte[] bytelist = new byte[size];
		fis.read(bytelist);

		String readStr = new String(bytelist);

		String[] tmplist_sorted_by_song = readStr.split("\n%\n");
		for (String str : tmplist_sorted_by_song) {
			String[] tmplist_sorted_by_lyric = str.split("&\n");
			int song_number = Integer.parseInt(tmplist_sorted_by_lyric[0]);
			String lyrics = tmplist_sorted_by_lyric[1];
			lyric_list_thread.add(new Lyrics(lyrics, song_number));

		}

		fis.close();

	}

	public void txtfile_reader_hiphop() throws IOException, InterruptedException {

		FileInputStream fis;

		fis = new FileInputStream(filepath_hiphop);

		int size = fis.available();
		byte[] bytelist = new byte[size];
		fis.read(bytelist);

		String readStr = new String(bytelist);

		String[] tmplist_sorted_by_song = readStr.split("\n%\n");
		for (String str : tmplist_sorted_by_song) {
			String[] tmplist_sorted_by_lyric = str.split("&\n");
			int song_number = Integer.parseInt(tmplist_sorted_by_lyric[0]);
			String lyrics = tmplist_sorted_by_lyric[1];
			lyric_list_thread.add(new Lyrics(lyrics, song_number));

		}

		fis.close();

	}

}
