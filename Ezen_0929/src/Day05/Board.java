package Day05;

import java.util.Date;

public class Board {
	
	// 클래스 : 설계도면
		// 1. 필드 [변수, 객체, 인터페이스 등등] : 메모리 선언값이 들어간다. 
		// 2. 생성자
		// 3. 메소드 
	String title;
	String writer;
	String contents;
	String date;
	int count;
	
	Board(String title, String writer, String contents){
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}
	
	Board(){
		
	}
		

}
