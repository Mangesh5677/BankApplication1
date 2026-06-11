package banking;
//this refer as the BankAcoount class
public class Withdraw1 extends Thread{
	private double amount;
	private BankAcoount account;
	public Withdraw1(String name , double amount, BankAcoount account) {
		super(name);
		this.amount = amount;
		this.account = account;
	}
	public void run() {
		account.withdraw(amount);
	}

}
