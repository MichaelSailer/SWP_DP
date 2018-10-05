import java.security.Permissions;
import java.util.Scanner;

public class Aufruf {
	public static void main(String[] args) {
		person p = null;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Geben Sie ihr Alter ein: ");
		int age = s.nextInt();
	
		p = person.getPerson(age);
		
	}

}
