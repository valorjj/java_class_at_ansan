package controller;

import java.util.ArrayList;

import model.Member;

public class MemberController {

	// �ʵ� : ��� ȸ���� ��� �ִ� ��ü
	public static ArrayList<Member> memberlist = new ArrayList<>();

	public boolean login(String id, String pw) {

		return true;
	}

	public boolean sigup(Member member) {

		return true;

	}

	// 3. ���̵�ã��[�̸�, �̸��� �μ��� �޾Ƽ� �ش� ���Ͽ� ���̵� ����]
	public boolean forgotid(String name, String email) {

		return true;

	}

	// 4. ��й�ȣã�� [���̵�, �̸��� �μ��� �޾Ƽ� �ش� ���Ͽ� ��й�ȣ ����]
	public boolean forgotpassword(String id, String pw) {

		return true;

	}

	// 5. ȸ������[���̵� �μ��� �޾� �ش� ���̵��� ��� ���� ��ȯ]
	public Member info(String loginid) {

		Member member = null;

		return member;

	}

	// 6. ȸ����������[���̵�, ���������� �޾Ƽ� ������Ʈ�� ó�� �� �������� ��ȯ]
	public boolean info(String loginid, Member update_member) {

		return true;

	}

	// 7. ȸ��Ż�� [�ش� ���̵� ���� �� ���� ���� ��ȯ]
	public boolean delete(String loginid) {

		return true;
	}

	public void logout() {

	}

}
