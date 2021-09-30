package practice;

public class UserClass {
	public static void main(String[] args) {
		hell("yashita");
	}
	
	private static void hell(String login) {
		if(!login.equals("admin")) {
			LoginException x = new LoginException(); 
			try{
				throw x;
			}catch(LoginException y) {
				System.out.println("invalid username");
			}
	}
		
		
	}

}
