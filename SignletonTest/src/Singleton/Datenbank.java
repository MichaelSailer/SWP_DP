package Singleton;

public class Datenbank {
	private static int index = 0;
	private static Datenbank instance = null;
	
	private Datenbank() {		
		System.out.println(index);
	}
	
	public static Datenbank getInstance() {
		if(instance == null) {
			index++;
			instance = new Datenbank();
		}
		return instance;
	}

}
