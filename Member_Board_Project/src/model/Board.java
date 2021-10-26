package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Board {

	// 1. [필드]

	String title;
	String contents;
	String writer;
	String date;

	int view;

	// 하나의 게시물에 여러개 댓글을 저장하기 위한 객체
	ArrayList<Reply> replylist;

	// 2. [생성자]

	public Board() {
	}

	public Board(String title, String contents, String writer) {
		this.title = title;
		this.contents = contents;
		this.writer = writer;

		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
		this.date = simpleDateFormat.format(date);

		this.view = 1;
		// ********************************* 메모리 할당을 꼭 해야한다.
		this.replylist = new ArrayList<>();

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public ArrayList<Reply> getReplylist() {
		return replylist;
	}

	public void setReplylist(ArrayList<Reply> replylist) {
		this.replylist = replylist;
	}

	public Board(String title, String contents, String writer, String date, int view) {
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.date = date;
		this.view = view;
	}

	// 3. [필드]

}
