package state;
import command.*;
public class BitcoinAccount {
	State buyState;
	State sellState;
	State receiveState;
	State sendState;
	State newAccountState;
	
	State state;
	
	public BitcoinAccount(Ledger ledger) {
		buyState = new BuyState(this, ledger);
		sellState = new SellState(this, ledger);
		receiveState = new ReceiveState(this, ledger);
		sendState = new SendState(this, ledger);
		newAccountState = new NewAccountState(this, ledger);
		
		state = newAccountState;
		
	}
	public void setState(State state) {
		this.state = state;
		
	}
	public State getState() {
		return state;
	}
	public State getBuyState() {
		return buyState;
	}
	public State getSellState() {
		return sellState;
	}
	public State getReceiveState() {
		return receiveState;
	}
	public State getSendState() {
		return sendState;
	}
	public State getNewAccountState() {
		return newAccountState;
	}
	public void buyBitcoins() {
		state.buyBitcoins();
	}
	public void sellBitcoins() {
		state.sellBitcoins();
	}
	public void sendBitcoins() {
		state.sendBitcoins();
	}
	public void receiveBitcoins() {
		state.receiveBitcoins();
	}
	public String toString() {
		return "Bitcoin account in " + state + " state";
	}
	
}
