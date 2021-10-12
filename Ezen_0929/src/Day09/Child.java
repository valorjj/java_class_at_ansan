package Day09;

public class Child extends Parent {

	private String name;

	public Child() {
		this("Hong");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call" + name);
	}

	

}
