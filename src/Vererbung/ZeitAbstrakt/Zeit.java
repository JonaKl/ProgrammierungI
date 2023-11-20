package Vererbung.ZeitAbstrakt;

public abstract class Zeit {
	abstract long getMinuten();
	
	public long getSekunden() {
		return getMinuten() * 60;
	}
}

