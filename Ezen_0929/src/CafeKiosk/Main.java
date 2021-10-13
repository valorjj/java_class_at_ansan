package CafeKiosk;

import java.util.ArrayList;

public class Main implements Kiosk {

	public static void main(String[] args) {

		ArrayList<coffee> item_list1;
		ArrayList<dessert> item_list2;

		// admin
		// customer

		// 여기서 실행시킵니다.

		Admin a;

		a = new Admin();

		a.dataDelete();
		a.dataInput();
		a.data수정();

		Customer c;

		c = new Customer();

		c.dataDelete();
		c.dataInput();
		c.data수정();

	}

	@Override
	public void dataInput() {
		System.out.println(" [입력] ");
		
	}

	@Override
	public void data수정() {
		System.out.println(" [수정] ");
		
	}

	@Override
	public void dataDelete() {
		System.out.println(" [삭제] ");
		
	}

}
