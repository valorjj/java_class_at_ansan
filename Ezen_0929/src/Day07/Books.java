package Day07;

public class Books {

	// 도서관이 가지고 있는 전체 도서의 목록
	// 1. 필드 [ISBN, 도서명, 대여여부, 대여한 회원아이디

	// 2. 생성자
	// 1. 도서등록 [모든필드]
	// 2. 빈생성자 [필드X]

	// 3. 메소드
	// 1. 필드가 private 사용시 => get, set 메소드
	// 2. 도서 등록
	// 3. 도서 목록
	// 4. 도서대여
	// 5. 도서반납

	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String id;

	public Books() {

	}

	public Books(String b_ISBN, String b_name, boolean b_rental, String id) {
		super();
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_rental;
		this.id = id;
	}


	public boolean book_add() {
		// 1. 입력 받기
		System.out.println("----도서 등록 페이지----");
		System.out.print("ISBN : ");
		String b_ISBN = LibraryApplication.scanner.next();
		System.out.print("도서명 : ");
		String b_name = LibraryApplication.scanner.next();
		// 2. 객체 생성
		Books book = new Books(b_ISBN, b_name, true, null); // 첫 등록에는 대여여부, 대여자 없는걸로 해야겠지?
		// 3. 객체 배열 저장
		boolean check = bookCheck(b_ISBN);

		if (check) {
			System.out.println("중복되는 도서코드가 있습니다.");
			return false;
		}
		for (int i = 0; i < LibraryApplication.books.length; i++) {
			if (LibraryApplication.books[i] == null) { // 빈 곳에 book 인스턴스 저장
				LibraryApplication.books[i] = book;
				return true;
			}
		}
		return false;
	}

	// 4. 도서대여 메소드 [ 도서코드를 입력받아 대여여부가 true 이면 대여하기 ]

	public boolean book_rental(String loginId) {
		System.out.println("도서대여 화면입니다. ");
		System.out.print("도서 코드(ISBN) : ");
		String b_ISBN = LibraryApplication.scanner.next();
		boolean check = bookCheck(b_ISBN);
		if (check) {
			for (int i = 0; i < LibraryApplication.books.length; i++) {
				Books book = LibraryApplication.books[i]; // 아랫줄에 이어질 코드 간소화를 위해서 새로운 book 인스턴스를 생성해서 저장한다.
				if (book != null && book.getB_ISBN().equals(b_ISBN)) {
					if (book.getB_rental()) {
						// true 이면 대여가 가능함
						System.out.println("현재 해당 도서 대여가능합니다. ");
						// 1. 대여 성공 시 대여 여부 true 값을 false 로 변환

						book.setB_rental(false);
						// String id = book.getB_Id();
						// 2. 대여성공 시 대여회원에 현재 로그인된 아이디 대입
						book.setId(loginId);

						return true;
					} else {
						// false 이면 대여불가능
						System.out.println("현재 대여중인 도서입니다. ");
						return false;
					}
				}
			}
		} else {
			System.out.println(" 해당 도서코드가 존재하지 않습니다. ");
			return false;

		}
		return false;
	}

	// 5. 도서 목록 출력 메소드
	public void book_list() {
		System.out.println("------ 도서 목록 출력 ------ ");
		System.out.println("도서코드" + "\t" + "도서명" + "\t" + "대여여부" + "\t" + "대여회원");

		for (int i = 0; i < LibraryApplication.books.length; i++) {
			if (LibraryApplication.books[i] == null)
				return;

			Books book = LibraryApplication.books[i];
			System.out
					.println(book.b_ISBN + "\t" + book.getB_name() + "\t" + book.getB_rental() + "\t" + book.getId());
		}

	}

	// 6. 도서 반납 메소드
	public boolean book_return(String loginId) {
		System.out.println("도서반납 화면입니다. ");
		System.out.print("도서 코드(ISBN) : ");
		String b_ISBN = LibraryApplication.scanner.next();

		// 1. 대여중인 책들 찾기

		// 2. 입력받은 도서 코드

		// 3. 로그인된 회원 == 대여회원 => 반납 성공

		for (int i = 0; i < LibraryApplication.books.length; i++) {
			Books book = LibraryApplication.books[i];
			
			if (book != null && !book.getB_rental()) { // 현재 해당 도서 대여 중
				if(book.getB_ISBN().equals(b_ISBN)) {
					if(book.getId().equals(loginId)) {
						
						System.out.println("도서가 반납되었습니다. ");
						// 1. 반납 성공 시 대여회원을 null 로 교체
						book.setId(null);
						// 2. 반납 성공 시 대여여부 true 로 교체 
						book.setB_rental(true);
						
						return true;
					}
				}
			}
		}
		System.out.println("도서코드가 다르거나 대여중인 도서가 아닙니다. ");
		return true;
	}

	// 6. 중복되는 도서가 있는지 검사하는 메소드
	public boolean bookCheck(String check_ISBN) {
		for (int i = 0; i < LibraryApplication.books.length; i++) {
			if (LibraryApplication.books[i] != null && LibraryApplication.books[i].getB_ISBN().equals(check_ISBN)) {
				return true;
			}
		}
		return false;
	}

	public String getB_ISBN() {
		return b_ISBN;
	}

	public void setB_ISBN(String b_ISBN) {
		this.b_ISBN = b_ISBN;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public boolean getB_rental() {
		return b_rental;
	}

	public void setB_rental(boolean b_rental) {
		this.b_rental = b_rental;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
