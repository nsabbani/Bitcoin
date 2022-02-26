package command;

public class BuyCommand implements Command {
	Wallet wallet;
	double amount;
	
	public BuyCommand(Wallet wallet, double amount) {
		this.wallet = wallet;
		this.amount = amount;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		wallet.buyBitcoins(amount);
	}

}
