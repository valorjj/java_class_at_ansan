package Day13;

public class Thread_name {

	private String name;

	public String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		
		this.name = name;

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(name + " 소리");
			}
		} catch (Exception e) {
		}

		System.out.println("스레드명 : " + Thread.currentThread().getName());
	}

}
