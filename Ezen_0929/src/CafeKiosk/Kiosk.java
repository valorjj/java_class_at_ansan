package CafeKiosk;

public interface Kiosk {
	
	//1. 데이터 입력받기
	public void dataInput();
		//어드민, 손님(커피, 디저트)
	
	//2. 데이터 수정하기
	public void data수정();
		//어드민, 
	
	//3. 데이터 삭제하기
	public void dataDelete();
		//주문취소(커피,디저트), 어드민 메뉴삭제(커피, 디저트)
	

}
