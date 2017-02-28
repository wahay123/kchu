package shape;

public class Inheritance {
	public static void main(String args[]) {
		Circle circle = new Circle("Circle", 0, false, "");
		circle.getRemark();
//		circle.playSound();

		circle.rotate();
		System.out.println(circle.getRotate());

	}
}
