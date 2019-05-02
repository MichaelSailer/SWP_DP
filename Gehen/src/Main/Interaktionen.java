package Main;

import Strategy.Strategien;

public class Interaktionen {
	Strategien s;
	
	public Interaktionen(Strategien st) {
	
		this.s = st;
		
	}
	public void executeStrategy() {
		s.statusVomMenschen();
	}
}
