
public class Inheritance {
	public static void main(String args[]) {
		Cat tom = new Cat("Tom", 12);
		Dog bob = new Dog("Bob", 11);
		Bird twick = new Bird("Twick", 4);
		Pigeon mary = new Pigeon("Mary", 5);
		Eagle paul = new Eagle("Paul", 8);

		tom.sleep();
		tom.eat();
		tom.shout();
		bob.sleep();
		bob.eat();
		bob.shout();
		twick.sleep();
		twick.eat();
		twick.fly();
		mary.sleep();
		mary.eat();
		mary.fly();
		paul.sleep();
		paul.eat();
		paul.fly();

	}
}
