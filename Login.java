package banking;

public class Login {
		String userName = "ABC";
		String pass = "sit@123";
		
	void check(String u ,String p) {
		if(userName.equals(u) && pass.equals(p)) {
			System.out.println("SuccessFully Login");
		}else {
			System.out.println("Invalid Login credinital");
		}
	}

}
