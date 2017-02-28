
public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}

	public void eat() {
		System.out.println(this.getName(name) + " eat bone");
	}

	public void shout() {
		System.out.println("ruff");
	}
}
