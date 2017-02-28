import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Wilson Cheung 3035119135 the Forest class, the main method of the
 *         program. To generate the Forest simulator.
 *
 */

public class Forest {
	/**
	* Create a main method to run the program
	* Create a ForestScanner object that reads input of user 
	* to set the animal ArrayList, start the program with Forest.Start
	* and continue the forest simulator with Forest.again
	*
	*/
	public static void main(String args[]) {
		ForestScanner scan = new ForestScanner();
		String input = "";
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		Board board1 = new Board();
		animalList = Forest.start(board1);
		Forest.again(input, scan, board1, animalList);
	}

/**
 * a method to set the board and draw it out
 * 
 * @param board 1	Board object board1
 * @return an ArrayList animalList
 */
	public static ArrayList start(Board board1) {

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList = board1.setBoard();
		board1.drawBoard();

		return animalList;

	}
	

/**
 * a method to simulate the Forest after reading in user's input
 * 
 * @param input  a String value input, to store user's input
 * @param scan	 a ForestScanner object scan to read user's input and continue or exit the loop
 * @param animalList	a ArrayList<Animal> object to store Animals
 * 
 */

	public static void again(String input, ForestScanner scan, Board board1, ArrayList<Animal> animalList) {
		scan.test(input, board1, animalList);

	}

}
