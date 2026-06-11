package banking;

public class Deposite extends Thread{
	private double amount;
	private BankAcoount account;
	public Deposite(String name , double amount, BankAcoount account) {
		super(name);
		this.amount = amount;
		this.account = account;
	}
	public void run() {
		account.deposite(amount);
	}

}
