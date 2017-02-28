/**
 * Class Lion subclass of class Feline
 * @author cheungwilson
 *
 */
public class Lion extends Feline {
	public Lion(String name, Board b) {
		super(name, b);

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
	public void attack(Board b, Animal enemy, int tempx, int tempy) {

		if (b.getAnimals()[tempx][tempy] instanceof Canine) {
			enemy = b.getAnimals()[tempx][tempy];
			enemy.isAlive = false;
			enemy.shortForm = Character.toUpperCase(enemy.name.charAt(0));
			System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name + " at "
					+ tempx + ", " + tempy + " and wins ");
			enemy.dieAway(enemy, b);
			System.out.println(enemy.name + " dies at " + enemy.col + " , " + enemy.row);
			//changes
			b.animals[this.col][this.row] = null;
			this.col = tempx;
			this.row = tempy;
			b.animals[tempx][tempy] = this;
			System.out.println(this.name + " moved to " + this.col + " , " + this.row);

		} else if (b.getAnimals()[tempx][tempy] instanceof Hippo) {
			enemy = b.getAnimals()[tempx][tempy];
			enemy.isAlive = false;
			enemy.shortForm = Character.toUpperCase(enemy.name.charAt(0));
			System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name + " at "
					+ tempx + ", " + tempy + " and wins ");
			enemy.dieAway(enemy, b);
			System.out.println(enemy.name + " dies at " + enemy.col + " , " + enemy.row);
			//changes
			b.animals[this.col][this.row] = null;
			this.col = tempx;
			this.row = tempy;
			b.animals[tempx][tempy] = this;
			System.out.println(this.name + " moved to " + this.col + " , " + this.row);

		}

		else {
			enemy = b.getAnimals()[tempx][tempy];
			this.isAlive = false;
			this.shortForm = Character.toUpperCase(this.name.charAt(0));
			System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name + " at "
					+ tempx + ", " + tempy + " and loses ");
			this.dieAway(this, b);
			System.out.println(this.name + " dies at " + this.col + " , " + this.row);
		}

	}
}
