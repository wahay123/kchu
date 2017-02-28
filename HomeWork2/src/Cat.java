
public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}

	public void eat() {
		System.out.println(this.getName(name) + " eat mouse");
	}

	public void shout() {
		System.out.println("meow");
	}
}
