package state;

import command.*;
public class NewAccountState implements State {
	BitcoinAccount bitcoinAccount;
	Ledger ledger;
	
	public NewAccountState(BitcoinAccount bitcoinAccount, Ledger ledger) {
		this.bitcoinAccount = bitcoinAccount;
		this.ledger = ledger;
	}

	@Override
	public void buyBitcoins() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellBitcoins() {
		// TODO Auto-generated method stub
		System.out.println("Please load bitcoin account first");
	}

	@Override
	public void sendBitcoins() {
		// TODO Auto-generated method stub
		System.out.println("Please load bitcoin account first");
	}

	@Override
	public void receiveBitcoins() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newAccount() {
		// TODO Auto-generated method stub
		System.out.println("Account Created");
		Wallet wallet = new Wallet();
		double amount = 0;
		Command newAccountCommand = new NewAccountCommand(wallet, amount);
		ledger.setCommand(newAccountCommand);
		ledger.transact();
		bitcoinAccount.setState(bitcoinAccount.getBuyState());
	}

}
