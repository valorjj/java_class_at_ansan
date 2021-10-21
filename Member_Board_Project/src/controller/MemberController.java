package controller;

import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import database.File;
import model.Member;

public class MemberController {

	public static ArrayList<Member> memberlist = new ArrayList<>();

	public static boolean login(String id, String pw) {

		for (Member member : memberlist) {
			if (member.getId().equals(id) && member.getPassword().equals(pw)) {
				return true; // 로그인 성공시 true 리턴하고 메소드 종료
			}

		}

		return false; // 로그인 실패시 false 리턴하고 메소드 종료
	}

	public static boolean sigup(Member member) {

		// 1. 유효성 검사 :

		if (member.getId().length() < 4) {
			System.out.println("아이디는 4글자 이상만 가능합니다.");
			return false;
		}

		if (member.getPassword().length() != 4) {
			System.out.println("비밀번호는 4글자만 입니다. ");
			return false;
		}

		if (member.getName().length() < 2) {
			System.out.println("이름은 2글자 이상 가능입니다. ");
			return false;

		}
		if (!member.getEmail().contains("@")) {
			System.out.println("이메일에는 \"@\" 이 포함되야합니다. ");
			return false;

		}

		// 2. ID 중복 체크 :

		for (Member temp : memberlist) {
			if (temp.getId().equals(member.getId())) {
				System.out.println("아이디 중복 ");
				return false;
			}
		}

		// 3. 리스트 저장

		memberlist.add(member);

		File.filesave(1);

		// 4. 파일 처리

		return true;

	}

	public static boolean forgotid(String name, String email) {

		for (Member member : memberlist) {
			if (member.getName().equals(name) && member.getEmail().equals(email)) {
				// 메일 메소드 호출 [받는사람이메일, 1(아이디찾기), 찾은아이디(정보)]
				sendmail(member.getEmail(), 1, member.getId());
				return true; // 아이디를 찾았어 -> true 리턴
			}
		}

		return false; // 아이디를 못 찾았어 -> false 리턴

	}

	public static boolean forgotpassword(String id, String email) {
		for (Member member : memberlist) {
			if (member.getId().equals(id) && member.getEmail().equals(email)) {
				return true; // 아이디를 찾았어 -> true 리턴
			}
		}

		return false; // 아이디를 못 찾았어 -> false 리턴

	}

	public Member info(String loginid) {

		Member member = null;

		return member;

	}

	public boolean info(String loginid, Member update_member) {

		return true;

	}

	public boolean delete(String loginid) {

		return true;
	}

	public static void sendmail(String tomail, int type, String contents) {

		// 1. API 라이브러리 다운 [activation.jar, mail.jar]
		// 2. 현재 프로젝트에 라이브러리 등록 [Build Path]

		// 0. 설정 [보내는 사람 ID, 비밀번호, 메일회사의 호스트]

		String fromemail = "re_mull59@naver.com";
		String frompassword = "Wjdwls5133!";

		Properties properties = new Properties();

		properties.put("mail.smtp.host", "smtp.naver.com"); // host : 호스트 주소
		properties.put("mail.smtp.host", 587); // port : 호스트에 접속하는 번호
		properties.put("mail.smtp.host", true); // auth : 회원 인증

		Session session = Session.getDefaultInstance(properties, new Authenticator() {

			// 익명 객체 생성
			@Override // 패스워드 인증 메소드 오버라이딩
			protected PasswordAuthentication getPasswordAuthentication() {
				// 인증할 이메일, 인증할 패스워드
				return new PasswordAuthentication(fromemail, frompassword);
			}

		});
		/////////////////////////////////////////////////////////////////////////////////////////

		MimeMessage message = new MimeMessage(session);

		try {
			message.setFrom(new InternetAddress(fromemail));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(tomail));

			if (type == 1) {
				message.setSubject("java console (forgot ID)");
				message.setText("회원님의 아이디 : " + contents);
			}
			if (type == 2) {
				message.setSubject("java console (forgot Password)");
				message.setText("회원님의 비밀번호 : " + contents);
			}
			if (type == 3) {
				message.setSubject("java console (Member signup)");
				message.setText("회원가입축하 " + contents);
			}

			Transport.send(message);

		} catch (MessagingException e) {
			System.err.println("[알림] 메일 전송 실패 ");
		}

	}

}
