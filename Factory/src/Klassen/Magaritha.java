package Klassen;

import java.util.ArrayList;

import Interface.Product;

public class Magaritha implements Product {
	ArrayList<String> zutaten = new ArrayList<>();
	int backzeit = 50;
	int hitze = 185;
	
	@Override
	public void backen() {
		belegen();
		System.out.println("Die Backzeit ist " + backzeit + " Minuten");
		System.out.println("Die Pizza wird mit "+ hitze + " Grad gebacken");
		System.out.println("Mit folgende Zutaten: ");
		for (String string : zutaten) {
			System.out.println("+ " +string);
		}	
		System.out.println("-------------------------------------------------------");
		
	}

	@Override
	public void belegen() {
		// TODO Auto-generated method stub
		zutaten.add("Tomaten Souce");
		zutaten.add("Käse");
		zutaten.add("Tomaten");
	}

}
