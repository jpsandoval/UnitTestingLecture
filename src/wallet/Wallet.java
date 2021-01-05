package wallet;

public class Wallet {

	private double balance;
	
	public Wallet(){
		balance = 0;
	}
	
	void save(double amount) {
		balance = balance + amount;
	}
	void withdraw(double amount) {
		if(amount>balance) {
			balance = balance - amount;
		}
	}
	
	double getBalance() {
		return balance;
	}
}
