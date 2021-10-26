package controller;

import java.util.ArrayList;

import database.File;
import model.Board;

public class BoardController {

	public static ArrayList<Board> boardlist = new ArrayList<>();

	// 게시물 등록 메소드
	public static boolean add(Board board) {

		boardlist.add(board);

		File.filesave(2); // 게시물 저장

		return true;

	}

	// 게시물 상세페이지 [조회] 메소드
	public static Board detail(int index) {

		Board board = boardlist.get(index);

		return board;
	}

	public static boolean delete(int index) {

		return true;
	}

	public static boolean update(int index, String title, String contents) {

		return true;
	}

}
