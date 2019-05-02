package Haptframe;


import Shapes.*;

public class Choose {
	public void createShapes(int a, int b, char wahl) {
		switch(wahl) {
		case 's':
			square s = new square();
			s.calculateArea(a, b);
			break;
		case 'r':
			rectangle r = new rectangle();
			r.calculateArea(a, b);
			break;
		case 't':
			Triangle t = new Triangle();
			t.calculateArea(a, b);
			break;
			
		}
	}
}
