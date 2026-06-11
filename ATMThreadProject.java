package banking;

public class ATMThreadProject {

	public static void main(String[] args) {
		BankAcoount account = new BankAcoount(10000);
		
		Withdraw1 customer1 = new Withdraw1("Mangesh ",15000 ,account);
		Deposite customer2 = new Deposite("XYZ " ,10000,account);
		customer1.start();
		try {
			Thread.sleep(300);
		}catch(Exception e) {}
		customer2.start();

	}

}
