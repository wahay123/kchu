import java.util.Random;
/**
*  Animal class to store the animal objects
*  String variable name to store the name of Animal
*  Character variable shortForm to store the short form of animal
*  integer variable col and row to store the coordinate of the animal
*  boolean variable isAlive to store if the animal is alive or not
*  Array Animal to store the location of the animal
*/
/**
 *
 *
 */
public class Animal {

	protected String name;
	protected char shortForm;
	protected int col, row;
	protected boolean isAlive;
	protected Animal[][] location;

	
	/**
	 * constructor of the Class Animal
	 * 
	 * integer variable tempRow and tempCol 
	 * 
	 * @param name	a String variable name to help assign name to the object
	 * @param b		a Board object 
	 */
	
	public Animal(String name, Board b) {

		int tempRow;
		int tempCol;

		this.name = name;
		if (this.name.equals("Turtle")) {
			this.shortForm = 'u';
		} else {
			this.shortForm = Character.toLowerCase(this.name.charAt(0));
		}

		do {
			tempRow = setRow();
			tempCol = setCol();
		} while (b.isEmpty(b, tempCol, tempRow) == false);

		this.col = tempCol;
		this.row = tempRow;
		this.isAlive = true;
		b.setLocation(col, row, this);

	}
	/**
	 *a method setRow to assign random number to row
	 *rand	a Random object
	 *row	an integer to store the random number
	 *
	 *@return row
	 */
	public int setRow() {
		Random rand = new Random();
		int row = rand.nextInt(12);
		return row;

	}
	
	/**
	 *a method setCol to assign random number to col
	 *rand	a Random object
	 *	an integer to store the random number
	 *
	 *@return row
	 */

	public int setCol() {
		Random rand1 = new Random();
		int col = rand1.nextInt(12);
		return col;
	}


	/**
	 * a getShortForm() method to get the short form of the animal object
	 * @return shortForm of this class
	 */
	public char getShortForm() {
		return this.shortForm;
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
			} while (checkLocationTemp(tempx, tempy, b) == false || checkLocationDeadAnimal(tempx, tempy, b) == false);
			// generate again

			if (b.isEmpty(b, tempx, tempy) == true) {
				// System.out.println(this.name + "check empty before moving =
				// true");
				System.out.println(this.name + " moved from " + x + " , " + y + " to " + tempx + " , " + tempy);
				// /////////////////////////////////////////////////////////////////////changes///////////////////////////////////
				b.animals[this.col][this.row] = null;
				this.col = tempx;
				this.row = tempy;
				b.animals[this.col][this.row] = this;
				////////////////////////////////////////////////////////////////////// changes////////
			} else if (b.isEmpty(b, tempx, tempy) == false) {
				//System.out.println(this.name
					//	+ "need to attack another animal!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				attack(b, b.getAnimals()[tempx][tempy], tempx, tempy);

	

			}
		} else {
			// no need to move
			// System.out.println(this.name + "is dead, no need to move");

		}
	}

	/**
	 *a method checkLocationTemp to check if the animal will go outside the board
	 *
	 *@param	tempx, tempy	integer value tempx, tempy to store the location of the steps
	 *@param	b				a board object b
	 *
	 *
	 *@return	false
	 *@return	true
	 */
	protected boolean checkLocationTemp(int tempx, int tempy, Board b) {
		if (tempx < 0 || tempx > 11 || tempy < 0 || tempy > 11) {
			// System.out.println("check location exceed 0 11");
			return false;

		} else {
			// System.out.println("check location true did not exceed board");
			return true;
		}
	}

	/**a method CheckLocationDeadAnimal() to check if there is a dead animal at the location
	*
	*@param	tempx, tempy	integer value tempx, tempy to store the location of the steps
	*@param	b				a board object b
	*
	*@return	false
	*@return	true
	*/
	protected boolean checkLocationDeadAnimal(int tempx, int tempy, Board b) {
		if (b.isEmpty(b, tempx, tempy) == false) {

			if (b.getAnimals()[tempx][tempy].isAlive == false) {
				// System.out.println(this.name + "hv dead animal ");
				return false;
			} else if (b.getAnimals()[tempx][tempy].isAlive == true) {
				// System.out.println(this.name + "not empty but alive ");
				return true;
			} else {
				return true;
			}
		} else {
			// System.out.println(this.name + "no dead animal ");
			return true;
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
	// attack before moving
	protected void attack(Board b, Animal enemy, int tempx, int tempy) {

		Random rand = new Random();
		int chance = rand.nextInt(10);

		if (b.getAnimals()[tempx][tempy] instanceof Turtle) {
			enemy = b.getAnimals()[tempx][tempy];
			switch (chance) {
			case 0:
			case 1:
				//System.out.println("Animal line 196 turtle lose case");
				enemy.isAlive = false;
				enemy.shortForm = 'U';
				System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name
						+ " at " + tempx + ", " + tempy + " and wins ");
				enemy.dieAway(enemy, b);
				//System.out.println("animal line 202 turtle die away");
				System.out.println(enemy.name + " dies at" + enemy.col + " , " + enemy.row);
				///////////////////////////////////////////////////////////////////// changes////////
				b.animals[this.col][this.row] = null;
				this.col = tempx;
				this.row = tempy;
				b.animals[tempx][tempy] = this;
				///////////////////////////////////////////////////////////////////// changes////////
				System.out.println(this.name + " moved to " + this.col + " , " + this.row);
				//System.out.println("animal line 208 this overtake the place");

				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				//System.out.println("animal line 219- turtle case this die");
				this.isAlive = false;
				this.shortForm = Character.toUpperCase(this.name.charAt(0));
				System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name
						+ " at " + tempx + ", " + tempy + " and loses ");
				this.dieAway(this, b);
				System.out.println(this.name + " dies at" + this.col + " , " + this.row);

				// cout dieaway
				break;
			}

		} else {
			//System.out.println("Animal line 233- Animal attack enemy and lose case");
			enemy = b.getAnimals()[tempx][tempy];
			this.isAlive = false;
			this.shortForm = Character.toUpperCase(this.name.charAt(0));
			System.out.println(this.name + " from " + this.col + " , " + this.row + " attacks " + enemy.name + " at "
					+ tempx + ", " + tempy + " and loses ");
			this.dieAway(this, b);
			System.out.println(this.name + " dies at " + this.col + " , " + this.row);

			// cout dieaway
		}
		/*
		 * if (animal attacks turtle) 20% animal wins and turtle dies
		 * 
		 * else attacker loses and dies
		 */

	}
	
	/**
	 * a dieAway() method to handle where the dead body of the animal will be placed after losing the fight
	 * @param a		an Animal object
	 * @param b		a board object
	 * 
	 * 
	 * x,y,tempx,tempy	to handle the coordinate
	 */

	protected void dieAway(Animal a, Board b) {

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
		///////////////////////////////////////////////////////////////////// changes////////
		b.animals[a.col][a.row] = null;
		a.col = tempx;
		a.row = tempy;
		b.animals[a.col][a.row] = a;
		///////////////////////////////////////////////////////////////////// changes////////
	}
}
