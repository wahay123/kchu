
/**
 * class ForestScanner to scan in user input that can repeat the simulator or end it
 */
import java.util.Scanner;
import java.util.ArrayList;

public class ForestScanner {
	private Scanner keyboard = new Scanner(System.in);

	/**
	 * a method test() to handle the user input
	 * 
	 * @param input
	 *            String variable to store the user input
	 * @param board1
	 *            a board object
	 * @param animalList
	 *            an arrayList storing animal objects
	 */
	public void test(String input, Board board1, ArrayList<Animal> animalList) {
		// System.out.println("Press enter to iterate, type exit to quit:");
		String line = "";
		while (!line.equals("exit")) {
			System.out.println("Press enter to iterate, type exit to quit:");
			line = keyboard.nextLine();
			if (line.equals("exit")) {
				board1.drawBoard();
				break;
			}
			for (Animal a : animalList) {
				a.move(board1);

			}

		}
		for (Animal a : animalList) {
			if (a.isAlive == true) {
				System.out.println(a.name + " is alive at " + a.col + " , " + a.row);
			} else {
				System.out.println(a.name + " is dead at " + a.col + " , " + a.row);
			}
		}
	}
}
