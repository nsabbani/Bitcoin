package command;

public class ReceiveCommand implements Command {
	Wallet wallet;
	double amount;
	
	public ReceiveCommand(Wallet wallet) {
		this.wallet = wallet;
		this.amount = amount;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		wallet.receiveBitcoins(amount);
	}

}
