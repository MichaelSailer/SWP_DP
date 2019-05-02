package Shapes;

public class rectangle implements Shape{

	@Override
	public void calculateArea(int a, int b) {
		int arena = (a+b)*2;

		System.out.println("Der Flächeninhalt beträgt: "+ arena);
	}

}
