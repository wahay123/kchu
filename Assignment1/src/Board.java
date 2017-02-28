import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author cheungwilson
 * Board Class to handle the forest that will be created
 * Animal[][] animals to show where the animals are
 * ArrayList<Animal> animalist an arraylist to store the animals objects
 */
public class Board {
	private static int c, r;
	public Animal[][] animals;
	public ArrayList<Animal> animalList;
/**
 * constructor of Board()
 */
	public Board() {
		this.c = 12;
		this.r = 12;
		this.setAnimals(new Animal[c][r]);

	}
/**
 * a method setLocation to set the location 
 * @param row	an integer value row to store coordinate
 * @param col	an integer value col to store coordinate
 * @param a		an Animal object a
 */
	public void setLocation(int col, int row, Animal a) {
		this.getAnimals()[col][row] = a;
	}
/**
 * a method drawBoard() to print out the array
 */
	public void drawBoard() {

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (getAnimals()[i][j] == null) {
					System.out.print(".");
				} else {
					System.out.print(getAnimals()[i][j].getShortForm());
				}
			}
			System.out.println();
		}

	}
	
	/**
	 * a method setBoard() to initialize the object and add into th arraylist
	 * @return arraylist animal
	 */

	public ArrayList setBoard() {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		Animal f = new Fox("Fox", this);
		Animal w = new Wolf("Wolf", this);
		Animal d = new Dog("Dog", this);
		Animal cat = new Cat("Cat", this);
		Animal l = new Lion("Lion", this);
		Animal h = new Hippo("Hippo", this);
		Animal u = new Turtle("Turtle", this);
		Animal t = new Tiger("Tiger", this);

		animalList.add(cat);
		animalList.add(d);
		animalList.add(f);
		animalList.add(h);
		animalList.add(l);
		animalList.add(t);
		animalList.add(u);
		animalList.add(w);

		return animalList;

	}

	
/*
	public void moving(Animal a) {
		a.move(this);
	}*/
	
	/**
	 * a isEmpty method to check if the array location is empty
	 * @param b a board object
	 * @param col an integer value for the coordinate
	 * @param row an integer value for the coordinate
	 * @return true if it is empty
	 * @return false if it is not empty
	 */

	public boolean isEmpty(Board b, int col, int row) {
		if (b.getAnimals()[col][row] == null) {
			// System.out.println(" board. boolean isempty true");
			return true;
		} else
			// System.out.println("board. boolean isempty false");
			return false;
	}

	/*public int getC() {
		return this.c;
	}

	public int getR() {
		return this.r;
	}*/

	/**
	 * a method to get the arrays of animals
	 * @return animals array
	 */
	public Animal[][] getAnimals() {
		return animals;
	}

	/**
	 * a method to setAnimals into array
	 * @param animals an Animal class array
	 */
	public void setAnimals(Animal[][] animals) {
		this.animals = animals;
	}

}
