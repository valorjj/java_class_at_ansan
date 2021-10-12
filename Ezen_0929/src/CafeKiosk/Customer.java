package CafeKiosk;

public class Customer extends main {

	String[] customer_menu = new String[100];

	public static void main(String[] args) {

		Customer c = new Customer();

		c.dataDelete();
		c.dataInput();
		c.data수정();

	}

	@Override
	public void dataInput() {
		System.out.println("[고객] 메뉴 주문");

	}

	@Override
	public void data수정() {
		System.out.println("[고객] 주문 수정");

	}

	@Override
	public void dataDelete() {

	}

}
