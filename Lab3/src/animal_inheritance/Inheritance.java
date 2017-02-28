package animal_inheritance;

public class Inheritance {
	public static void main(String args[]) {
		Dog bobby = new Dog("Bobby", "bone");
		Cat tom = new Cat("Tom", "fish");
		Mouse jerry = new Mouse("Jerrfy", "Cheese");

		bobby.eat();
		tom.eat();
		jerry.eat();
	}
}
