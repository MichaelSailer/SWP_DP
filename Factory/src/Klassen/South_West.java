package Klassen;

import java.util.ArrayList;

import Interface.Product;

public class South_West implements Product{

	ArrayList<String> zutaten = new ArrayList<>();
	int backzeit = 90;
	int hitze = 185;
	int schärfeGrad = 8;
	
	@Override
	public void backen() {
	belegen();
	System.out.println("Die Backzeit ist " + backzeit + " Minuten");
	System.out.println("Die Pizza wird mit "+ hitze + " Grad gebacken");
	System.out.println("Mit folgende Zutaten: ");
	for (String string : zutaten) {
		System.out.println("+ " + string);
	}
	System.out.println("Die Schärfe ist " + schärfeGrad);	
	System.out.println("-------------------------------------------------------");
		
	}

	@Override
	public void belegen() {
		zutaten.add("South-Souce");
		zutaten.add("Speck");
		zutaten.add("Eier");
		zutaten.add("Peperoni");
		zutaten.add("Zwiebel");
		
	}

}
