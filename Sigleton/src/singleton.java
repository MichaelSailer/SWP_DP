public class singleton {
	private static singleton instance =  null;
	
	private singleton() {
		//Hier kommt dann die Initialisierung
		// und der ganze wichtige Code
	}
	public static singleton getInstance() {
		if(instance == null) {
			instance = new singleton();	
		}
		return instance;
	}
}