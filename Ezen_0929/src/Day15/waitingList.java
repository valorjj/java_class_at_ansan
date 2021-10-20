package Day15;

public class waitingList {

	private int party_number;
	private int waiting_number;

	public waitingList(int party_number, int waiting_number) {
		this.party_number = party_number;
		this.waiting_number = waiting_number;
	}

	public int getParty_number() {
		return party_number;
	}

	public void setParty_number(int party_number) {
		this.party_number = party_number;
	}

	public int getWaiting_number() {
		return waiting_number;
	}

	public void setWaiting_number(int waiting_number) {
		this.waiting_number = waiting_number;
	}

}
