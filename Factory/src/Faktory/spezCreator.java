package Faktory;

import Klassen.Diavolo;
import Klassen.Magaritha;
import Klassen.South_West;

public class spezCreator extends Creator {
	@Override
	public void createProduct(String text) {
		if(text.equals("Diavolo")) {
			Diavolo divaolo = new Diavolo();
			divaolo.backen();
		}else if (text.equals("Magaritha")) {
			Magaritha mag = new Magaritha();
			mag.backen();
		}
		else if (text.equals("South_West")) {
			South_West south = new South_West();
			south.backen();
		}
		else {
			System.out.println("Fehler");
		}
	}
}