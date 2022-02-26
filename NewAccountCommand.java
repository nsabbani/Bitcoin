package command;

public class NewAccountCommand implements Command {
	Wallet wallet;
	double amount;
	
	public NewAccountCommand(Wallet wallet, double amount) {
		this.wallet = wallet;
		this.amount = amount;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		wallet.newAccount(0);
	}

}
