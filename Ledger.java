package command;

public class Ledger {
	Command slot;
	
	public void setCommand(Command slot) {
		this.slot = slot;
	}
	public void transact() {
		slot.execute();
	}
}
