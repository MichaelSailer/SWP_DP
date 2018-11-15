package Obejcte;

import Interfaces.Personen;

public class Empfänge implements Personen{

	@Override
	public void Weiterleitung(int messwert) {
		System.out.println("Messwert ist: "+ messwert);
	}

	
	
	
}
