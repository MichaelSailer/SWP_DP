package Shapes;

public class Triangle implements Shape {

	@Override
	public void calculateArea(int a, int b) {
		int arena= (a * b)/2;
		
		System.out.println("Der Flächeninhalt beträgt: "+ arena);
	}
	
}
