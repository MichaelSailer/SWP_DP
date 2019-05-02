package Main;

import java.util.ArrayList;

import Command.Gehen;

public class CommandSpeicher {
	ArrayList<Gehen> gehen = new ArrayList<>();
	
	public void addCommand(Gehen richtung) {
		gehen.add(richtung);
	}
	
	public void removeCommand() {
		int length = gehen.size()-1;
		gehen.remove(length);
		executeCommand(gehen.get(gehen.size()-1));
	}
	public void executeCommand(Gehen richtung) {
		addCommand(richtung);
		richtung.execute();
	}
	public void showAllCommands() {
		for(Gehen g : gehen) {
			g.execute();
		}
	}

}
