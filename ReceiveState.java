package state;

import command.Ledger;
import command.Wallet;

public class ReceiveState implements State {
	BitcoinAccount bitcoinAccount;
	Ledger ledger;
	
	public ReceiveState(BitcoinAccount bitcoinAccount, Ledger ledger) {
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
