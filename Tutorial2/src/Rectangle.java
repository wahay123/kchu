
public class Rectangle extends Shape {
	private float width, height;
	
	public Rectangle(float w, float h){
		width = w;
		height = h;
	}
	
	public float getArea(){
		float area = width * height;
		return area;
	}
}
