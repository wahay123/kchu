package animal_oop;

public class Cat {
	String name;
	String food;
	
	public Cat(String name, String food){
		this.name = name;
		this.food = food;
	}

	public void eat() {
		System.out.println(this.name + " eat " + this.food);
	}
}
