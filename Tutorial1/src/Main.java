
public class Main {
	public static void main(String args[]){
		Circle circle1 = new Circle(2);
		Circle circle2 = new Circle(3);
		Circle circle3 = new Circle(4);
		Circle circle4 = new Circle(5);
		Rectangle rec1 = new Rectangle(2,4);
		Rectangle rec2 = new Rectangle(5,4);
		Rectangle rec3 = new Rectangle(3,4);
		Square sq1 = new Square(2);
		Square sq2 = new Square(3);
		Square sq3 = new Square(4);
		
		System.out.println(circle1.getArea() + circle2.getArea() + circle3.getArea()
		+ circle4.getArea() + rec1.getArea() + rec2.getArea() + rec3.getArea() + sq1.getArea()
		+sq2.getArea() + sq3.getArea());
	}
}
