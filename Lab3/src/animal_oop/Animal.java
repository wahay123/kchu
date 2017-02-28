package animal_oop;

public class Animal {
	public static void main(String args[]) {
		Dog bobby = new Dog("Bobby", "bone");
		Cat tom = new Cat("Tom", "fish");
		Mouse jerry = new Mouse("Jerry", "cheese");

		bobby.eat();
		tom.eat();
		jerry.eat();
	}
}
