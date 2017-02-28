

public class Test {
	public static void main(String[] args) {
		ShapeCollection sc = new ShapeCollection();
		sc.add(new Triangle((float) 4.0, (float) 4.0));
		sc.add(new Circle((float) 8.0));
		
		System.out.println("Total area is " + sc.totalArea());
	}

}


