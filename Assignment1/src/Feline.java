import java.util.Random;
/**
 * Class Feline is a subclass of Animal
 * @author cheungwilson
 *
 */
public class Feline extends Animal {
	public Feline(String name, Board b) {
		super(name, b);
	}

	/**
	 * a method move() to handle the movement of animals
	 * @param b	object of Board
	 */
	public void move(Board b) {
		if (this.isAlive == true) {
			Random rand = new Random();
			int x = this.col;
			int y = this.row;
			int tempx = 0;
			int tempy = 0;

			do {
				int randStep = rand.nextInt(8);
				switch (randStep) {

				case 0:
					tempx = x - 1;
					tempy = y - 1;

					break;
				case 1:
					tempx = x;
					tempy = y - 1;
					break;

				case 2:
					tempx = x + 1;
					tempy = y - 1;
					break;

				case 3:
					tempx = x + 1;
					tempy = y;
					break;

				case 4:
					tempx = x + 1;

					tempy = y + 1;
					break;

				case 5:
					tempx = x;
					tempy = y + 1;
					break;

				case 6:
					tempx = x - 1;
					tempy = y + 1;

				case 7:
					tempx = x - 1;
					tempy = y;
				}
			} while (checkLocationTemp(tempx, tempy, b) == false || checkLocationDeadAnimal(tempx, tempy, b) == false);

			if (b.isEmpty(b, tempx, tempy)) {
				System.out.println(this.name + " moved from " + x + " , " + y + " to " + tempx + " , " + tempy);
				// changes 1
				b.animals[this.col][this.row] = null;
				this.col = tempx;
				this.row = tempy;
				b.animals[this.col][this.row] = this;
			} else {
				//System.out.println(this.name
						//+ "need to attack another animal!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				attack(b, b.getAnimals()[tempx][tempy], tempx, tempy);
			}
		} else {

			// no need to move
			// System.out.println("Feline is dead no need to move");
		}
	}
	/**
	 * a method attack() to handle the fighting of two animals
	 * 
	 * 
	 * @param b			a board object
	 * @param enemy		an Animal object	
	 * @param tempx		an integer value to store coordination
	 * @param tempy		an integer value to store coordination
	 */
	protected void attack(Board b, Animal enemy, int tempx, int tempy) {

		if (b.getAnimals()[tempx][tempy] instanceof Canine) {
			System.out.println("Feline line 80- feline attack Canine");
			enemy = b.getAnimals()[tempx][tempy];
			enemy.isAlive = false;
			enemy.shortForm = Character.toUpperCase(enemy.name.charAt(0));
			System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name + " at "
					+ tempx + ", " + tempy + " and wins ");
			enemy.dieAway(enemy, b);
			System.out.println("feline line 87- canine die away");
			System.out.println(enemy.name + " dies at " + enemy.col + " , " + enemy.row);
			// changes
			b.animals[this.col][this.row] = null;
			this.col = tempx;
			this.row = tempy;
			b.animals[tempx][tempy] = this;
			System.out.println(this.name + " moved to " + this.col + " , " + this.row);

		} else {
			enemy = b.getAnimals()[tempx][tempy];
			this.isAlive = false;
			this.shortForm = Character.toUpperCase(this.name.charAt(0));
			System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name + " at "
					+ tempx + ", " + tempy + " and loses ");
			this.dieAway(this, b);
			System.out.println("Feline line 99- feline die away");
			System.out.println(this.name + " dies at " + this.col + " , " + this.row);
		}

	}
}
