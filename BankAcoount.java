package banking;

public class BankAcoount {
	private double balance;
    public BankAcoount(double balance) {
        	this.balance = balance;
    }
    public synchronized void withdraw(double amount) {
        	System.out.println(Thread.currentThread().getName()+"wants to withdraw RS."+amount);
    	while(balance < amount) {
        System.out.println("Insufficant Balance");
        	System.out.println(Thread.currentThread().getName()+" is wating for deposit.....");
        try {
        	   wait();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
       }
      }
   public synchronized void deposite(double amount) {
	   System.out.println(Thread.currentThread().getName()+"Depositing "+"amount Rs. "+amount);
	   balance+=amount;
       System.out.println("Updated Balance = Rs."+balance);
       System.out.println("Notify Waiting Customers.....");
       notifyAll();
   }
   public synchronized void checkBalance() {
	   System.out.println("Current Balnce = Rs."+balance);
   }
   
}


