
public class TestB {
	public static void main(String[] args) {
		ShapeCollection sc = new ShapeCollection();
		sc.add(new Triangle((float) 4.0, (float) 4.0));
		sc.add(new Square((float) 6.0));
		sc.add(new Rectangle((float) 5.0, (float) 7.0));

		System.out.println("Total area is" + sc.totalArea());
	}
}
