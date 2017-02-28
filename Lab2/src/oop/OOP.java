package oop;

public class OOP {

	public static void main(String args[]) {

		Square square = new Square("Square", 0, false, "");
		Triangle triangle = new Triangle("Triangle", 0, false, "");

		square.rotate();
		square.playSound();
		triangle.rotate();
		triangle.playSound();
		System.out.println(square);
		System.out.println(square.toString());
		System.out.println(triangle);
	}

}

// Today, we covered class, orbject setter, getter, constructor, toString


//calculator 10 buttons 0-9
// finalResult
// Button Class, int val, add() to finalResult