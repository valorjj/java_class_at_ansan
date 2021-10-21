package controller;

import java.util.ArrayList;

import model.Member;

public class MemberController {

	// 필드 : 모든 회원을 담고 있는 객체
	public static ArrayList<Member> memberlist = new ArrayList<>();

	public boolean login(String id, String pw) {

		return true;
	}

	public boolean sigup(Member member) {

		return true;

	}

	// 3. 아이디찾기[이름, 이메일 인수로 받아서 해당 메일에 아이디 전송]
	public boolean forgotid(String name, String email) {

		return true;

	}

	// 4. 비밀번호찾기 [아이디, 이메일 인수로 받아서 해당 메일에 비밀번호 전송]
	public boolean forgotpassword(String id, String pw) {

		return true;

	}

	// 5. 회원정보[아이디를 인수로 받아 해당 아이디의 모든 정보 반환]
	public Member info(String loginid) {

		Member member = null;

		return member;

	}

	// 6. 회원정보수정[아이디, 수정정보를 받아서 업데이트를 처리 후 성공여부 반환]
	public boolean info(String loginid, Member update_member) {

		return true;

	}

	// 7. 회원탈퇴 [해당 아이디 삭제 후 성공 여부 반환]
	public boolean delete(String loginid) {

		return true;
	}

	public void logout() {

	}

}
