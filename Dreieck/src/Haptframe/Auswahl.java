package Haptframe;

import java.util.Scanner;

public class Auswahl {

	public static void main(String[] args) {
		Choose c = new Choose();
		Scanner s = new Scanner(System.in);
		System.out.println("Geben sie die Form an:");
		char wahl = s.nextLine().charAt(0);
		System.out.println("Geben sie die Länge:");
		int a = Integer.parseInt(s.nextLine());
		System.out.println("Geben sie die Breite:");
		int b = Integer.parseInt(s.nextLine());
		
		c.createShapes(a, b, wahl);

	}

}
