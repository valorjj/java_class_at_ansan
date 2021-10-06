package Day06;

public class MemberService {
	
	private String ID;
	private String Password;
	
	public MemberService(String ID, String Password) {
		this.ID = ID;
		this.Password = Password;
		
		
	}
	
	public boolean login(String ID, String Password) {
		
		if(ID.equals("hong") && Password.equals("1234")) {
			return true;
		}
		
		return false;
	}
	
	public void logout(String ID) {
		if(ID.equals("hong")) {
			System.out.println("로그아웃 되었습니다. ");
		}
	}
	
	

}
