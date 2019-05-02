package Main;

import Controller.AbonnentenSystem;
import Kanal.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 u1 = new User1();
		User2 u2 = new User2();
		User3 u3 = new User3();
		
		AbonnentenSystem abs = new AbonnentenSystem();
		
		abs.addAbonnent(u1);
		abs.addAbonnent(u2);
		abs.addAbonnent(u3);
		
		abs.setYoutubeTitel("LOL TOD WTF");
	}

}
