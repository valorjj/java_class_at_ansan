package Day14;

public class User {

	private String id;
	private String password;
	private String name;

	/**
	 * @param id
	 * @param password
	 * @param name
	 */
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public User() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
