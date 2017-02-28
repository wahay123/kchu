package animal_oop;

public class Mouse {
	String name;
	String food;

	public Mouse(String name, String food) {
		this.name = name;
		this.food = food;
	}

	public void eat() {
		System.out.println(this.name + " eats " + this.food);
	}
}
