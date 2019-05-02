package Main;

import Singleton.Datenbank;

public class Test {

	public static void main(String[] args) {

		Datenbank db1 = Datenbank.getInstance();
		System.out.println("test");
		Datenbank db2 = Datenbank.getInstance();
		System.out.println("test");

	}

}
