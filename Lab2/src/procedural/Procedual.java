package procedural;

public class Procedual {

	public static void main(String args[]) {

		Shape shape1 = new Shape("circle", 0, false);
		Shape shape2 = new Shape("tri", 0, false);
		Shape shape3 = new Shape("square", 0, false);

		rotate(shape1);
		rotate(shape2);
		rotate(shape3);
		playSound(shape1);
		playSound(shape2);

		System.out.println(shape1.getName() +", "+ shape1.getRotate() + shape1.isPlaying() + shape1.getSongName());
		System.out.println(shape2.getName() + shape2.getRotate() + shape2.isPlaying() + shape2.getSongName());
		System.out.println(shape3.getName() + shape3.getRotate() + shape3.isPlaying() + shape3.getSongName());
		
		System.out.println(String.format("%s, %s, %s, %s", shape1.getName(), shape1.getRotate(), shape1.isPlaying(), shape1.getSongName()));

	}

	public static void rotate(Shape shape) {
		if (shape.getName().equals("circle")) {
			shape.setRotate(shape.getRotate() + 360);
		} else if (shape.getName().equals("tri")) {
			shape.setRotate(shape.getRotate() + 180);
		} else if (shape.getName().equals("square")) {
			shape.setRotate(shape.getRotate() + 90);

		}

	}

	public static void playSound(Shape shape) {
		if (shape.getName().equals("circle")) {
			shape.setPlaying(true);
			shape.setSongName("Circle Song");
		} else if (shape.getName().equals("tri")) {
			shape.setPlaying(true);
			shape.setSongName("tri Song");
		} else if (shape.getName().equals("square")) {
			shape.setPlaying(true);
			shape.setSongName("Square Song");
		}
	}
}
