package Klassen;

import java.util.ArrayList;

import Interface.Product;

public class Diavolo implements Product{
	ArrayList<String> zutaten = new ArrayList<>();
	int backzeit = 1;
	int hitze = 185;
	int schärfeGrad = 5;		

	@Override
	public void backen() {
		belegen();
		System.out.println("Die Backzeit ist " + backzeit + " Stunde");
		System.out.println("Die Pizza wird mit "+ hitze + " Grad gebacken");
		System.out.println("Mit folgende Zutaten: ");
		for (String string : zutaten) {
			System.out.println("+ " +string);
		}
		System.out.println("Die Schärfe ist " + schärfeGrad);	
		System.out.println("-------------------------------------------------------");
	}

	@Override
	public void belegen() {
		zutaten.add("Salami");
		zutaten.add("Käse");
		zutaten.add("Tomaten Souce");
		zutaten.add("Peperonie");
		
	}

}
