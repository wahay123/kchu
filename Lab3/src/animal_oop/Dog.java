package animal_oop;

public class Dog {
	String name;
	String food;

	public Dog(String name, String food) {
		this.name = name;
		this.food = food;
	}

	public void eat() {
		System.out.println(this.name + " eats " + this.food);
	}
}
