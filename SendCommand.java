package command;

public class SendCommand implements Command{
	Wallet wallet;
	double amount;
	
	public SendCommand(Wallet wallet, double amount) {
		this.wallet = wallet;
		this.amount = amount;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		wallet.sendBitcoins(amount);
	}

}
