package command;

public class Wallet {
	double balance;
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void sendBitcoins(double bitcoins) {
		if(bitcoins <= 0.00000000) {
			System.out.println("You have insufficient bitcoins");
		}
		else if( bitcoins - balance <= 0.000000000) {
			System.out.println("Bitcoins to send greater than balance");
		}
		else {
			balance -= bitcoins;
			System.out.println("Bitcoins " + balance + " have being sent");
		}
	}
	public void receiveBitcoins(double bitcoins) {
		balance += bitcoins;
	}
	public void buyBitcoins(double bitcoins) {
		System.out.println("You have bought " + bitcoins + " bitcoins");
		balance += bitcoins;
	}
	public void sellBitcoins(double bitcoins) {
		System.out.println("You have sold " + bitcoins + " bitcoins" );
		if(bitcoins <= 0.00000000) {
			System.out.println("You have insufficient bitcoins");
		}
		else if( bitcoins - balance <= 0.000000000) {
			System.out.println("Bitcoins to sell greater than balance");
		}
		else {
			balance -= bitcoins;
			System.out.println("Bitcoins " + balance + " have being sold");
		}
	}
	public void newAccount(double amount) {
		balance = amount;
	}
	
	
}
