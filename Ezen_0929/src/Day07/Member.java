package Day07;

public class Member {

	// -----회원 도서 프로그램-----

	// 설계는 선언부 먼저 !
	// 행동은 선언부 살펴보면서 나중에

	private String name;
	private String id;
	private String password;
	private String phoneNumber;

	private static String admin = "admin";
	private static String adminPW = "1234";

	// 유저 정보를 담는 메소드
	public Member(String name, String id, String password, String phoneNumber) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public Member() { // 깡통 생성자

	}

	// 회원가입 메소드
	public static boolean signup() {
		// public : main 에 속한 클래스 (외부클래스)
		// 회원가입에 성공하면 true 값 리턴
		// 1. 필요한 값 입력 받기
		System.out.println("---------------회원가입 페이지-------------");
		System.out.print("아이디 : ");
		String id = LibraryApplication.scanner.next();
		// 아이디 중복체크
		boolean res = idCheck(id);
		if (res) { // 아이디가 중복되는 경우
			System.out.println("이미 존재하는 아이디입니다. ");
			return false;
		}
		System.out.print("비밀번호 : ");
		String password = LibraryApplication.scanner.next();
		System.out.print("연락처 : ");
		String phoneNumber = LibraryApplication.scanner.next();
		System.out.print("이름 : ");
		String name = LibraryApplication.scanner.next();

		// 2. 입력받은 정보로 객체 생성
		Member member = new Member(name, id, password, phoneNumber);

		// 3. 생성한 객체를 배열에 넣기

		for (int i = 0; i < LibraryApplication.members.length; i++) {
			if (LibraryApplication.members[i] == null) {
				LibraryApplication.members[i] = member;
				return true;
			}
		}

		return false; // 회원가입 실패 (빈 공간이 없어서)
		// 빈 공간이 있다면 바로 위 for 문에서 종료된다.

	}

	// 아이디 중복 체크 메소드
	public static boolean idCheck(String check_id) {

		for (int i = 0; i < LibraryApplication.members.length; i++) {
			if (LibraryApplication.members[i] != null && LibraryApplication.members[i].getId().equals(check_id)) {
				return true; // 인수와 동일한 아이디가 배열(LibraryApplication 에 선언한 members 배열 내 존재하면 true 반환
			}
		}
		return false; // 중복이 없다 => false 반환
	}

	// 로그인 메소드
	public static String logIn() {
		// 반환값 : 로그인 성공시 => 성공한 아이디

		// 1. 아이디, 비밀번호 입력 받기

		System.out.println("-----로그인 페이지-----");
		System.out.print("아이디 : ");
		String id = LibraryApplication.scanner.next();
		System.out.print("비밀번호 : ");
		String password = LibraryApplication.scanner.next();
		
		if(id.equals("admin") && password.equals("1234")) {
			System.out.println(">>> 관리자입니다. ");
			return admin;
		}

		// 2. 배열에 존재하는지 확인

		for (int i = 0; i < LibraryApplication.members.length; i++) {
			if (LibraryApplication.members[i] != null && LibraryApplication.members[i].getId().equals(id)
					&& LibraryApplication.members[i].getPassword().equals(password)) {
				return id; // 로그인 성공 시 성공한 아이디를 반환
			}
		}

		return null; // 로그인 실패 시 null 리턴
	}

	// 아이디 찾기 메소드
	public static String searchId() {
		// 반환값 : 찾았을 경우 => 아이디

		System.out.println("----아이디 찾기 페이지----");
		System.out.print("아이디 : ");
		String name = LibraryApplication.scanner.next();
		System.out.print("연락처 : ");
		String phoneNumber = LibraryApplication.scanner.next();

		for (int i = 0; i < LibraryApplication.members.length; i++) {
			if (LibraryApplication.members[i] != null && LibraryApplication.members[i].getName().equals(name)
					&& LibraryApplication.members[i].getPhoneNumber().equals(phoneNumber)) {
				return LibraryApplication.members[i].getId(); // 찾은 아이디를 반환
			}
		}

		return null;// 아이디가 없을 경우 null 리턴
	}

	// 비밀번호 찾기 메소드
	public static String searchPassword() {
		// 찾았을 경우 => 비밀번호 리턴

		System.out.println("----아이디 찾기 페이지----");
		System.out.print("아이디 : ");
		String id = LibraryApplication.scanner.next();
		System.out.print("연락처 : ");
		String phoneNumber = LibraryApplication.scanner.next();

		for (int i = 0; i < LibraryApplication.members.length; i++) {
			if (LibraryApplication.members[i] != null && LibraryApplication.members[i].getId().equals(id)
					&& LibraryApplication.members[i].getPhoneNumber().equals(phoneNumber)) {
				return LibraryApplication.members[i].getPassword(); // 찾은 아이디를 반환
			}
		}

		return null;// 아이디가 없을 경우 null 리턴
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getAdminPW() {
		return adminPW;
	}

	public void setAdminPW(String adminPW) {
		this.adminPW = adminPW;
	}

}
