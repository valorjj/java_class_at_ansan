package controller;

import model.Reply;

public class ReplyController {

	public static boolean add(int index, Reply reply) {
		
		
		try {
			BoardController.boardlist.get(index).getReplylist().add(reply);
			return true;
		} catch (Exception e) {
			System.out.println("해당 게시물이 존재하지 않습니다. ");
			return true;
		}

		
	}

}
