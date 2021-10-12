package CafeKiosk;

public class dessert {

	String dessert_name;
	int dessert_price;
	int dessert_inventory;

	public dessert(String dessert_name, int dessert_price, int dessert_inventory) {
		super();
		this.dessert_name = dessert_name;
		this.dessert_price = dessert_price;
		this.dessert_inventory = dessert_inventory;
	}

	public String getDessert_name() {
		return dessert_name;
	}

	public void setDessert_name(String dessert_name) {
		this.dessert_name = dessert_name;
	}

	public int getDessert_price() {
		return dessert_price;
	}

	public void setDessert_price(int dessert_price) {
		this.dessert_price = dessert_price;
	}

	public int getDessert_inventory() {
		return dessert_inventory;
	}

	public void setDessert_inventory(int dessert_inventory) {
		this.dessert_inventory = dessert_inventory;
	}

}
