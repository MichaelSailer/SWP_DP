package Main;

import java.util.Scanner;

import Command.Rückwärts;
import Command.Seitwärts;
import Command.Vorwärts;

public abstract class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CommandSpeicher cms = new CommandSpeicher();
		boolean weiter = true;
		
		do {
		System.out.println("In welche Richtung wollen Sie gehen?");		
		switch(s.nextLine()) {
			case "v":
				cms.executeCommand(new Vorwärts());
				break;
			case "s":
				cms.executeCommand(new Seitwärts());
				break;
			case "r":
				cms.executeCommand(new Rückwärts());
				break;				
		}
		System.out.println("Wollen sie weiter spielen");
		if(s.nextLine().equals("t")) {
			weiter = true;
		}else {
			weiter = false;
		}
		System.out.println("Letzten Befehl löschen?");
		if(s.nextLine().equals("t")) {
			cms.removeCommand();
		}
		}while(weiter);
	}

}
