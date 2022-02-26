package state;

import command.Command;
import command.Ledger;
import command.NewAccountCommand;
import command.Wallet;

public class BuyState implements State {
	BitcoinAccount bitcoinAccount;
	Ledger ledger;
	
	public BuyState(BitcoinAccount bitcoinAccount, Ledger ledger) {
		this.bitcoinAccount = bitcoinAccount;
		this.ledger = ledger;
	}

	

	@Override
	public void buyBitcoins() {
		// TODO Auto-generated method stub
		System.out.println("Account Created");
		Wallet wallet = new Wallet();
		double amount = 1.00000;
		Command newAccountCommand = new NewAccountCommand(wallet, amount);
		ledger.setCommand(newAccountCommand);
		ledger.transact();
		bitcoinAccount.setState(bitcoinAccount.getBuyState());
	}

	@Override
	public void sellBitcoins() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendBitcoins() {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveBitcoins() {
		// TODO Auto-generated method stub

	}



	@Override
	public void newAccount() {
		// TODO Auto-generated method stub
		
	}

}
