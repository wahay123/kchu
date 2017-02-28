import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class IngredientScanner {
	private Scanner keyboard = new Scanner(System.in);

	public void test(int input, ArrayList<Ingredient> ingredients, ArrayList<Ingredient> containers,
			ArrayList<Ingredient> smoothy, Ingredient plasticCup) {
		int num = -1;
		containers.add(plasticCup);
		while (num != 0) {
			int min = 0;
			int max = 0;

			System.out.println("Please enter your choice (1-9, or 0 to finish the order) :");
			num = keyboard.nextInt();
			if (num == 0) {
				break;
			} else if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8
					|| num == 9) {

				switch (num) {
				case 1:
					min = 40;
					max = 50;
					break;
				case 2:
					min = 50;
					max = 60;
					break;

				case 3:
					min = 35;
					max = 40;
					break;
				case 4:
					min = 50;
					max = 70;
					break;
				case 5:
					min = 150;
					max = 150;
					break;
				case 6:
					min = 60;
					max = 80;
					break;
				case 7:
					min = 30;
					max = 40;
					break;
				case 8:
					min = 100;
					max = 100;
					break;
				case 9:
					min = 40;
					max = 45;
					break;

				}

				int i = num - 1;
				Ingredient retrival = ingredients.get(i);
				int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
				retrival.setVol(randomNum);
				
				
				
				////////////////////////////////THIS ????????????????????????????????????????????
				containers.add(retrival);
				smoothy.add(retrival);

				System.out.println("Added " + retrival.getName() + " " + retrival.getVol() + "ml");

			}

		}
		for (Ingredient i : containers) {
			//////////////////////////////////thissssssssssssss/////////////////////
			System.out.println(i.getName() + " " + i.getVol());
			/*
			 * if (i instanceof ContainerInterface) {
			 * 
			 * System.out.print(((ContainerInterface) i).getContainerName());
			 * System.out.println(" " + ((ContainerInterface)
			 * i).getContainerVol());
			 * 
			 * }
			 */
		}

	}
}
