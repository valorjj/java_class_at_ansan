package CafeKiosk;

public class coffee {

	String coffee_name;
	int coffee_price;
	int coffee_inventory;
	String coffee_hot;
	String coffee_size;

	public coffee(String coffee_name, int coffee_price, int coffee_inventory, String coffee_hot, String coffee_size) {
		super();
		this.coffee_name = coffee_name;
		this.coffee_price = coffee_price;
		this.coffee_inventory = coffee_inventory;
		this.coffee_hot = coffee_hot;
		this.coffee_size = coffee_size;
	}

	public coffee(String coffee_name, int coffee_price, int coffee_inventory) {
		super();
		this.coffee_name = coffee_name;
		this.coffee_price = coffee_price;
		this.coffee_inventory = coffee_inventory;
	}

	public String getCoffee_name() {
		return coffee_name;
	}

	public void setCoffee_name(String coffee_name) {
		this.coffee_name = coffee_name;
	}

	public int getCoffee_price() {
		return coffee_price;
	}

	public void setCoffee_price(int coffee_price) {
		this.coffee_price = coffee_price;
	}

	public int getCoffee_inventory() {
		return coffee_inventory;
	}

	public void setCoffee_inventory(int coffee_inventory) {
		this.coffee_inventory = coffee_inventory;
	}

	public String getCoffee_hot() {
		return coffee_hot;
	}

	public void setCoffee_hot(String coffee_hot) {
		this.coffee_hot = coffee_hot;
	}

	public String getCoffee_size() {
		return coffee_size;
	}

	public void setCoffee_size(String coffee_size) {
		this.coffee_size = coffee_size;
	}

}
