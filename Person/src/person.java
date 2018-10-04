import java.nio.channels.NonWritableChannelException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class person {
	String name;
	
	LocalDateTime now = LocalDateTime.now();
	
	private static person instance = null;
	
	private person(int age) {
		
		calculateLifetime(age);
		
	}
	public static person getPerson(int age) {
		if(instance == null) {
			instance = new person(age);
		}
		return instance;
	}
	
	private double calculateLifetime(int age) {
		int result= 0;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy");
		int zeit = Integer.parseInt( now.format(df));
		result = zeit - age;
		
		
		System.out.println("Ihr Geburtstjahr war am: " + result);
		System.out.println("Sie haben so viele Sekunden schon gelebt: " + (age * 525600));
		
		
		
		return result;
	}
	
	
}
