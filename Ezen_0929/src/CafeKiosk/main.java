package CafeKiosk;

import Day09.ATM;

public class main {

	public static void main(String[] args) {

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


	
	
}
