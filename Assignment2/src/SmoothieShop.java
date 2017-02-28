import java.util.ArrayList;

public class SmoothieShop {
	public static void main(String args[]) {
		int input = -1;
		IngredientScanner scan1 = new IngredientScanner();
		ArrayList<Ingredient> ingredientList = start();
		ArrayList<Ingredient> containerList = new ArrayList<Ingredient>();
		ArrayList<Ingredient> smoothy = new ArrayList<Ingredient>();
		SmoothieShop ss = new SmoothieShop();

		ss.again(input, scan1, ingredientList, containerList, smoothy);

	}

	public static ArrayList start() {
		ArrayList<Ingredient> al = ingredients();

		for (Ingredient j : al) {
			int i = al.indexOf(j) + 1;
			System.out.println(i + ". " + j.getName());

		}
		System.out.println("What would you like to add to your smoothie?");
		return al;
	}

	public static ArrayList ingredients() {
		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

		Ingredient apple = new Apple("Apple");
		Ingredient orange = new Orange("Orange");
		Ingredient banana = new Banana("Banana");
		Ingredient melon = new Melon("Melon");
		Ingredient waterMelon = new Watermelon("Water melon");
		Ingredient coconut = new Coconut("Coconut");
		Ingredient chocChip = new ChocChip("Chocolate chips");
		Ingredient milk = new Milk("Milk");
		Ingredient vanilla = new Vanilla("Vanilla ice cream");

		ingredients.add(apple);
		ingredients.add(orange);
		ingredients.add(banana);
		ingredients.add(melon);
		ingredients.add(waterMelon);
		ingredients.add(coconut);
		ingredients.add(chocChip);
		ingredients.add(milk);
		ingredients.add(vanilla);

		return ingredients;

	}

	public static void again(int input, IngredientScanner scan1, ArrayList<Ingredient> iList,
			ArrayList<Ingredient> cList, ArrayList<Ingredient> sList) {
		Ingredient plasticCup = new PlasticCup("Plastic cup");
		scan1.test(input, iList, cList, sList, plasticCup);
	}
}
