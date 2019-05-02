package Main;

import java.util.Scanner;

import Command.R�ckw�rts;
import Command.Seitw�rts;
import Command.Vorw�rts;

public abstract class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CommandSpeicher cms = new CommandSpeicher();
		boolean weiter = true;
		
		do {
		System.out.println("In welche Richtung wollen Sie gehen?");		
		switch(s.nextLine()) {
			case "v":
				cms.executeCommand(new Vorw�rts());
				break;
			case "s":
				cms.executeCommand(new Seitw�rts());
				break;
			case "r":
				cms.executeCommand(new R�ckw�rts());
				break;				
		}
		System.out.println("Wollen sie weiter spielen");
		if(s.nextLine().equals("t")) {
			weiter = true;
		}else {
			weiter = false;
		}
		System.out.println("Letzten Befehl l�schen?");
		if(s.nextLine().equals("t")) {
			cms.removeCommand();
		}
		}while(weiter);
	}

}
