package Shapes;

public class square implements Shape{

	@Override
	public void calculateArea(int a, int b) {
		int arena = a * b;

		System.out.println("Der Fl�cheninhalt betr�gt: "+ arena);
	}

}
