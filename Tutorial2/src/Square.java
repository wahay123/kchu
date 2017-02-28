public class Square extends Shape {
	private float length;

	public Square(float l) {
		length = l;
	}

	public float getArea() {
		float area = length * length;
		return area;
	}
}
