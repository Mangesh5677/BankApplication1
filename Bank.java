package banking;

public class Bank {

	public static void main(String[] args) {
		User u1 = new User();
		u1.login();
		u1.check("ABC", "sit@123");
		u1.logout();

	}

}
