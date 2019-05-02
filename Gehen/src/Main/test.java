package Main;

import java.util.Random;
import Strategy.Angeschossen;
import Strategy.Laufen;
import Strategy.Normal;

public class test {
	
	public static void main(String[] args) {	
		
		Interaktionen ina;
		System.out.println("Sie sind ein charakter. Nun passiert ein Event!");
		Random rmd = new Random();
		
		switch(rmd.nextInt(3)) {
			case 0:
				ina = new Interaktionen(new Normal());
				ina.executeStrategy();
				break;
			case 1:
				ina = new Interaktionen(new Laufen());
				ina.executeStrategy();
				break;
			case 2:
				ina = new Interaktionen(new Angeschossen());
				ina.executeStrategy();
				break;
		}
		
		
	}
}
