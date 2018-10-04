import java.nio.channels.NonWritableChannelException;
import java.util.Timer;

public class person {
	String name;
	int age;
	
	private static person instance = null;
	
	private person() {
		
	}
	public static person getPerson() {
		if(instance == null) {
			instance = new person();
		}
		return instance;
	}
	
	private double calculateLifetime(int age) {
		Timer t = new Timer();
		
		
	}
	
}
