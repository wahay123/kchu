package animal_inheritance;

import java.util.ArrayList;

public class Animal {
	private String animal;
	String food;
	
	public Animal(String animal, String food) {
		this.animal = animal;
		this.food = food;
	}

	public void eat() {
		System.out.println(this.animal + " eats " + this.food);
	}
}

//HOMEWORK
// 2016 1b lab2  tutorial2.pptx
