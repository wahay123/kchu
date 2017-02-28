import java.util.Random;

/**
 * class Turtle subclass of Animal
 * @author cheungwilson
 *
 */
public class Turtle extends Animal {
	public Turtle(String name, Board b) {
		super(name, b);
	}

	/**
	 * a method move() to handle the movement of animals
	 * @param b	object of Board
	 */
	public void move(Board b) {
		if (this.isAlive == true) {
			if (willMove() == true) {
				Random rand = new Random();
				int x = this.col;
				int y = this.row;
				int tempx = 0;
				int tempy = 0;

				do {
					// System.out.println(this.name + " I am generating random
					// number footstep");
					int randStep = rand.nextInt(4);
					switch (randStep) {

					case 0:
						tempx = x - 1;
						tempy = y;
						// System.out.println("case 0 generated");
						break;

					case 1:
						tempx = x;
						tempy = y - 1;
						// System.out.println("case 1 generated");
						break;

					case 2:
						tempx = x + 1;
						tempy = y;
						// System.out.println("case 2 generated");
						break;

					case 3:
						tempx = x;
						tempy = y + 1;
						// System.out.println("case 3 generated");
						break;
					}
				} while (checkLocationTemp(tempx, tempy, b) == false
						|| checkLocationDeadAnimal(tempx, tempy, b) == false);
				// generate again

				if (b.isEmpty(b, tempx, tempy) == true) {
					// System.out.println(this.name + "check empty before moving
					// =
					// true");
					System.out.println(this.name + " moved from " + x + " , " + y + " to " + tempx + " , " + tempy);
					// changes
					b.animals[this.col][this.row] = null;
					this.col = tempx;
					this.row = tempy;
					b.animals[tempx][tempy] = this;

				} else if (b.isEmpty(b, tempx, tempy) == false) {
					//System.out.println(this.name
						//	+ "need to attack another animal!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					attack(b, b.getAnimals()[tempx][tempy], tempx, tempy);

					/*
					 * if (this.isAlive == true) {
					 * b.getAnimals()[tempx][tempy].dieAway(b.getAnimals()[tempx
					 * ][tempy], b); this.col = tempx; this.row = tempy;
					 * 
					 * } else { this.dieAway(this, b); }
					 */

				}

			} else {
				System.out.println(this.name + " moved from " + this.col + " , " + this.row + " to " + this.col + " , "
						+ this.row);
			}
		} else {
			// no need to move
			// System.out.println(this.name + "is dead, no need to move");

		}
	}

	private boolean willMove() {
		Random rand = new Random();
		int gonnaMove = rand.nextInt(2);

		if (gonnaMove == 0) {
			return true;
		}

		else {
			return false;
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

		Random rand = new Random();
		int chance = rand.nextInt(10);

		if (b.getAnimals()[tempx][tempy] instanceof Animal) {
			enemy = b.getAnimals()[tempx][tempy];
			switch (chance) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				enemy.isAlive = false;
				enemy.shortForm = Character.toUpperCase(this.name.charAt(0));
				System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name
						+ " at " + tempx + ", " + tempy + " and wins ");
				enemy.dieAway(enemy, b);
				System.out.println(enemy.name + " dies at " + enemy.col + " , " + enemy.row);
				// System.out.print(enemy);
				b.animals[this.col][this.row] = null;
				this.col = tempx;
				this.row = tempy;
				b.animals[tempx][tempy] = this;

				System.out.println(this.name + " moved to " + this.col + " , " + this.row);

				break;

			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				this.isAlive = false;
				this.shortForm = Character.toUpperCase(this.name.charAt(0));
				System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name
						+ " at " + tempx + ", " + tempy + " and loses ");
				this.dieAway(this, b);
				System.out.println(this.name + " dies at " + this.col + " , " + this.row);
				// cout die
				break;
			}

		} else {
			enemy = b.getAnimals()[tempx][tempy];
			this.isAlive = false;
			this.shortForm = Character.toUpperCase(this.name.charAt(0));
			System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name + " at "
					+ tempx + ", " + tempy + " and loses ");
			this.dieAway(this, b);
			System.out.println(this.name + " dies at " + this.col + " , " + this.row);
			// cout dieaway
		}

	}
}