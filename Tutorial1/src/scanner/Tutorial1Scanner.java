package scanner;

import java.util.Scanner;

public class Tutorial1Scanner {
	private Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		Tutorial1Scanner scan = new Tutorial1Scanner();
		scan.test();
	}

	public void test() {
		System.out.println("Press enter to iterate, type exit to quit:");
		String line = "";
		while (!line.equals("exit")) {
			line = keyboard.nextLine();
			// animalList.move();
			System.out.println("Press enter to iterate, type exit to quit:");

		}
		// list all animals
	}
}