package model;

import java.io.FileInputStream;

public interface Karaoke_Interface {

	// [추상 메소드] 데이터를 입력받는 메소드
	void data_input();

	// [추상 메소드] 데이터를 출력하는 메소드
	void data_print();

	// [추상 메소드] 데이터를 수정하는 메소드
	void data_modify();

	// [추상 메소드] 데이터를 삭제하는 메소드
	void data_delete();

}
