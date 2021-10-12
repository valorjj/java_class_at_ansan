package CafeKiosk;


public class Admin implements Kiosk {
	// 키오스크 메소드 오버라이딩

	String[] admin_menu = new String[100];

	public static void main(String[] args) {

		Kiosk k = new Admin();

		k.dataDelete();
		k.dataInput();
		k.data수정();

	}

	@Override
	public void dataInput() {
		// TODO Auto-generated method stub
		System.out.println("[관리자메뉴] 메뉴 등록 ");

	}

	@Override
	public void data수정() {
		// TODO Auto-generated method stub
		System.out.println("[관리자메뉴] 메뉴 수정");

	}

	@Override
	public void dataDelete() {
		// TODO Auto-generated method stub
		System.out.println("[관리자메뉴] 메뉴 삭제");

	}

}
