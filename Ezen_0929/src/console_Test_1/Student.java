package console_Test_1;

public class Student {
	
	// TreeMap 에 저장될 Student 객체입니다.

	// 1. 필드 
	private String name;
	private int k_score;
	private int e_score;
	private int m_score;
	private int total_score;
	
	// 2. 생성자 
	
	public Student(String name, int k_score, int e_score, int m_score, int total_score) {
		this.name = name;
		this.k_score = k_score;
		this.e_score = e_score;
		this.m_score = m_score;
		this.total_score = total_score;
	}

	// 3. 필드 - getter & setter 메소드 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getK_score() {
		return k_score;
	}

	public void setK_score(int k_score) {
		this.k_score = k_score;
	}

	public int getE_score() {
		return e_score;
	}

	public void setE_score(int e_score) {
		this.e_score = e_score;
	}

	public int getM_score() {
		return m_score;
	}

	public void setM_score(int m_score) {
		this.m_score = m_score;
	}

	public int getTotal_score() {
		return total_score;
	}

	public void setTotal_score(int total_score) {
		this.total_score = total_score;
	}


}
