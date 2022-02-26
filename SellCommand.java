package command;

public class SellCommand implements Command {
	Wallet wallet;
	double amount;
	
	public SellCommand(Wallet wallet, double amount) {
		this.wallet = wallet;
		this.amount = amount;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		wallet.sellBitcoins(amount);
	}

}
