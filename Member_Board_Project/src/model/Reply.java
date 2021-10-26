package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reply {

	// 글 내용, 아이디, 비밀번호, 날짜

	String contents;
	String writer;
	String date;

	public Reply(String contents, String writer) {
		this.contents = contents;
		this.writer = writer;
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
		this.date = simpleDateFormat.format(date);

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

}
