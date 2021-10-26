package database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import controller.BoardController;
import controller.MemberController;
import model.Board;
import model.Member;

public class File {

	private static String memberpath = "C:/Users/505/git/java_ezen/Member_Board_Project/src/database/memberlist.txt";
	private static String boardpath = "C:/Users/505/git/java_ezen/Member_Board_Project/src/database/boardlist.txt";

	public static boolean filesave(int type) {
		// type : 1. 회원저장 2.게시물저장 3.댓글저장
		try {

			FileOutputStream fos = null;

			if (type == 1) {
				// 회원 저장
				fos = new FileOutputStream(memberpath);
				// 반복문을 이용한 리스트에서 하나씩 회원정보 가져오기
				for (Member member : MemberController.memberlist) {
					// 각 회원마다 필드 [,] 회원 [\n] 로 구분
					String outstring = member.getId() + "," + member.getPassword() + "," + member.getName() + ","
							+ member.getEmail() + "," + member.getPoint() + "\n";
					fos.write(outstring.getBytes());
				}

				// 스트림 사용 후 초기화
				fos.flush();
				fos.close();

				return true;

			} else if (type == 2) {
				// 회원 저장
				fos = new FileOutputStream(boardpath);
				// 반복문을 이용한 리스트에서 하나씩 회원정보 가져오기
				for (Board board : BoardController.boardlist) {
					// 각 회원마다 필드 [,] 회원 [\n] 로 구분
					String outstring = board.getTitle() + "," + board.getContents() + "," + board.getWriter() + ","
							+ board.getDate() + "," + board.getView() + "\n";
					fos.write(outstring.getBytes());
				}

				// 스트림 사용 후 초기화
				fos.flush();
				fos.close();

				return true;

			} else if (type == 3) {

			}

			return true;

		} catch (Exception e) {
			System.err.println("[알림] : 파일 저장 오류 발생 [관리자에게 문의]");
		}
		return false;

	}

	public static boolean fileroad(int type) {
		// type : 1. 회원저장 2.게시물저장 3.댓글저장
		// 메소드를 3개 만드는게 아니라, type을 선언해서 제어하겠다는 것이야
		FileInputStream fis = null;
		try {

			if (type == 1) {
				fis = new FileInputStream(memberpath);
				int size = fis.available();
				byte[] bytes = new byte[size];
				fis.read(bytes);
				String inString = new String(bytes);
				String[] members = inString.split("\n");
				// 주의 : \n 으로 split 할 경우 맨 마지막 공백 회원이 생긴다.
				for (String item : members) {
					if (!item.equals(" ")) {
						String[] fields = item.split(",");
						Member member = new Member(fields[0], fields[1], fields[2], fields[3],
								Integer.parseInt(fields[4]));

						MemberController.memberlist.add(member);
					}
				}
				fis.close(); // 스트림 닫아줘야해 (해시코드가 남아 있을 수 있어서??)
				return true; // 파일 불러오기 성공 !!!

			}
			if (type == 2) {
				fis = new FileInputStream(boardpath);
				int size = fis.available();
				byte[] bytes = new byte[size];
				fis.read(bytes);
				String inString = new String(bytes);
				String[] boards = inString.split("\n");
				// 주의 : \n 으로 split 할 경우 맨 마지막 공백 회원이 생긴다.
				for (String item : boards) {
					if (!item.equals(" ")) {
						String[] fields = item.split(",");
						
						Date date = new Date();
						
						Board board = new Board(fields[0], fields[1], fields[2], fields[3],
								Integer.parseInt(fields[4]));
						BoardController.boardlist.add(board);
					}
				}
				fis.close(); // 스트림 닫아줘야해 (해시코드가 남아 있을 수 있어서??)
				return true; // 파일 불러오기 성공 !!!

			}

		} catch (Exception e) {
			System.err.println("[알림] : 파일 불러오기 오류 발생 [관리자에게 문의]");
		}

		return false;
	}
}
