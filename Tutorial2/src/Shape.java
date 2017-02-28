
abstract public class Shape {
	int x, y;

	public Shape() { }
	
	public abstract float getArea();
}

class Triangle extends Shape {
	private float base, height;

	public Triangle(float b, float h) {
		base = b;
		height = h;
	}

	public float getArea() {
		float area = base * height;
		area = (float) 0.5 * area;
		return area;
	}
}

class Circle extends Shape {
	private float radius;

	public Circle(float r) {
		radius = r;
	}

	public float getArea() {
		return ( (float)3.14 * radius * radius ) ;
	}
}

